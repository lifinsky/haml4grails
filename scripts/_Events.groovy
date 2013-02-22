/*
 * In the war target, packageApp runs immediately before compilegsp,
 * Thus at eventPackagingEnd, we convert all haml files to gsp.
 * Unfortunately, packageApp also runs when we call "grail run-app",
 * so we will have .gsp files created throughout the view folder.
 * Currently seeking a work around for this. -- RM, 05/08/2010
 */

eventPackagingEnd = {
	def batchConverter = classLoader.loadClass("com.cadrlife.jhaml.JHamlBatchConverter").newInstance()
	def viewdir = new File("${basedir}/grails-app/views")
	batchConverter.setTargetExtenstion("gsp")
	def config = classLoader.loadClass("com.cadrlife.jhaml.JHamlConfig").newInstance();
	config.attrWrapper = '"';
	batchConverter.setConfig(config)
	batchConverter.convertAllInPath(viewdir)
}
