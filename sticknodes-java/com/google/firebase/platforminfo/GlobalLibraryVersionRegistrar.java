package com.google.firebase.platforminfo;

/* loaded from: classes2.dex */
public class GlobalLibraryVersionRegistrar {
    private static volatile com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar INSTANCE;
    private final java.util.Set<com.google.firebase.platforminfo.LibraryVersion> infos;

    GlobalLibraryVersionRegistrar() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.infos = r0
            return
    }

    public static com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar getInstance() {
            com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar r0 = com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar.INSTANCE
            if (r0 != 0) goto L17
            java.lang.Class<com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar> r1 = com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar.class
            monitor-enter(r1)
            com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar r0 = com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar.INSTANCE     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L12
            com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar r0 = new com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar.INSTANCE = r0     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
        L17:
            return r0
    }

    java.util.Set<com.google.firebase.platforminfo.LibraryVersion> getRegisteredVersions() {
            r2 = this;
            java.util.Set<com.google.firebase.platforminfo.LibraryVersion> r0 = r2.infos
            monitor-enter(r0)
            java.util.Set<com.google.firebase.platforminfo.LibraryVersion> r1 = r2.infos     // Catch: java.lang.Throwable -> Lb
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }
}
