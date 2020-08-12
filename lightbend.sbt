resolvers in ThisBuild += "lightbend-commercial-mvn" at
  "https://repo.lightbend.com/pass/XoOou6-zo4yYIMBBkWsT21c9jk28DJsC6L2paH-BKxpfyFOV/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
        url("https://repo.lightbend.com/pass/XoOou6-zo4yYIMBBkWsT21c9jk28DJsC6L2paH-BKxpfyFOV/commercial-releases"))(Resolver.ivyStylePatterns)