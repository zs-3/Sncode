package com.google.firebase.platforminfo;

@com.google.auto.value.AutoValue
/* loaded from: classes2.dex */
abstract class LibraryVersion {
    LibraryVersion() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.firebase.platforminfo.LibraryVersion create(java.lang.String r1, java.lang.String r2) {
            com.google.firebase.platforminfo.AutoValue_LibraryVersion r0 = new com.google.firebase.platforminfo.AutoValue_LibraryVersion
            r0.<init>(r1, r2)
            return r0
    }

    public abstract java.lang.String getLibraryName();

    public abstract java.lang.String getVersion();
}
