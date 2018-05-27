resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
  url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
  Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.12")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.0")
//addSbtPlugin("com.github.play2war" % "play2-war-plugin" % "1.2.1")
