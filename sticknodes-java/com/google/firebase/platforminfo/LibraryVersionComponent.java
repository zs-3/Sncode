package com.google.firebase.platforminfo;

/* loaded from: classes2.dex */
public class LibraryVersionComponent {

    public interface VersionExtractor<T> {
        java.lang.String extract(T r1);
    }

    public static /* synthetic */ com.google.firebase.platforminfo.LibraryVersion $r8$lambda$Dl2UOJASySXKbW5tJLYAdrR74MU(java.lang.String r0, com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor r1, com.google.firebase.components.ComponentContainer r2) {
            com.google.firebase.platforminfo.LibraryVersion r0 = lambda$fromContext$0(r0, r1, r2)
            return r0
    }

    public static com.google.firebase.components.Component<?> create(java.lang.String r0, java.lang.String r1) {
            com.google.firebase.platforminfo.LibraryVersion r0 = com.google.firebase.platforminfo.LibraryVersion.create(r0, r1)
            java.lang.Class<com.google.firebase.platforminfo.LibraryVersion> r1 = com.google.firebase.platforminfo.LibraryVersion.class
            com.google.firebase.components.Component r0 = com.google.firebase.components.Component.intoSet(r0, r1)
            return r0
    }

    public static com.google.firebase.components.Component<?> fromContext(java.lang.String r2, com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor<android.content.Context> r3) {
            java.lang.Class<com.google.firebase.platforminfo.LibraryVersion> r0 = com.google.firebase.platforminfo.LibraryVersion.class
            com.google.firebase.components.Component$Builder r0 = com.google.firebase.components.Component.intoSetBuilder(r0)
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            com.google.firebase.components.Dependency r1 = com.google.firebase.components.Dependency.required(r1)
            com.google.firebase.components.Component$Builder r0 = r0.add(r1)
            com.google.firebase.platforminfo.LibraryVersionComponent$$ExternalSyntheticLambda0 r1 = new com.google.firebase.platforminfo.LibraryVersionComponent$$ExternalSyntheticLambda0
            r1.<init>(r2, r3)
            com.google.firebase.components.Component$Builder r2 = r0.factory(r1)
            com.google.firebase.components.Component r2 = r2.build()
            return r2
    }

    private static /* synthetic */ com.google.firebase.platforminfo.LibraryVersion lambda$fromContext$0(java.lang.String r1, com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor r2, com.google.firebase.components.ComponentContainer r3) {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r3 = r3.get(r0)
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r2 = r2.extract(r3)
            com.google.firebase.platforminfo.LibraryVersion r1 = com.google.firebase.platforminfo.LibraryVersion.create(r1, r2)
            return r1
    }
}
