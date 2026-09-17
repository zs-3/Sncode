package com.google.firebase.platforminfo;

/* loaded from: classes2.dex */
public class DefaultUserAgentPublisher implements com.google.firebase.platforminfo.UserAgentPublisher {
    private final com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar gamesSDKRegistrar;
    private final java.lang.String javaSDKVersionUserAgent;

    public static /* synthetic */ com.google.firebase.platforminfo.UserAgentPublisher $r8$lambda$4ig3kBSwJpLAUmRXJRn9olP8BdE(com.google.firebase.components.ComponentContainer r0) {
            com.google.firebase.platforminfo.UserAgentPublisher r0 = lambda$component$0(r0)
            return r0
    }

    DefaultUserAgentPublisher(java.util.Set<com.google.firebase.platforminfo.LibraryVersion> r1, com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = toUserAgent(r1)
            r0.javaSDKVersionUserAgent = r1
            r0.gamesSDKRegistrar = r2
            return
    }

    public static com.google.firebase.components.Component<com.google.firebase.platforminfo.UserAgentPublisher> component() {
            java.lang.Class<com.google.firebase.platforminfo.UserAgentPublisher> r0 = com.google.firebase.platforminfo.UserAgentPublisher.class
            com.google.firebase.components.Component$Builder r0 = com.google.firebase.components.Component.builder(r0)
            java.lang.Class<com.google.firebase.platforminfo.LibraryVersion> r1 = com.google.firebase.platforminfo.LibraryVersion.class
            com.google.firebase.components.Dependency r1 = com.google.firebase.components.Dependency.setOf(r1)
            com.google.firebase.components.Component$Builder r0 = r0.add(r1)
            com.google.firebase.platforminfo.DefaultUserAgentPublisher$$ExternalSyntheticLambda0 r1 = com.google.firebase.platforminfo.DefaultUserAgentPublisher$$ExternalSyntheticLambda0.INSTANCE
            com.google.firebase.components.Component$Builder r0 = r0.factory(r1)
            com.google.firebase.components.Component r0 = r0.build()
            return r0
    }

    private static /* synthetic */ com.google.firebase.platforminfo.UserAgentPublisher lambda$component$0(com.google.firebase.components.ComponentContainer r2) {
            com.google.firebase.platforminfo.DefaultUserAgentPublisher r0 = new com.google.firebase.platforminfo.DefaultUserAgentPublisher
            java.lang.Class<com.google.firebase.platforminfo.LibraryVersion> r1 = com.google.firebase.platforminfo.LibraryVersion.class
            java.util.Set r2 = r2.setOf(r1)
            com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar r1 = com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar.getInstance()
            r0.<init>(r2, r1)
            return r0
    }

    private static java.lang.String toUserAgent(java.util.Set<com.google.firebase.platforminfo.LibraryVersion> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r3.next()
            com.google.firebase.platforminfo.LibraryVersion r1 = (com.google.firebase.platforminfo.LibraryVersion) r1
            java.lang.String r2 = r1.getLibraryName()
            r0.append(r2)
            r2 = 47
            r0.append(r2)
            java.lang.String r1 = r1.getVersion()
            r0.append(r1)
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L9
            r1 = 32
            r0.append(r1)
            goto L9
        L34:
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public java.lang.String getUserAgent() {
            r2 = this;
            com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar r0 = r2.gamesSDKRegistrar
            java.util.Set r0 = r0.getRegisteredVersions()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            java.lang.String r0 = r2.javaSDKVersionUserAgent
            return r0
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.javaSDKVersionUserAgent
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar r1 = r2.gamesSDKRegistrar
            java.util.Set r1 = r1.getRegisteredVersions()
            java.lang.String r1 = toUserAgent(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
