package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public class BuildIdInfo {
    private final java.lang.String arch;
    private final java.lang.String buildId;
    private final java.lang.String libraryName;

    public BuildIdInfo(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.libraryName = r1
            r0.arch = r2
            r0.buildId = r3
            return
    }

    public java.lang.String getArch() {
            r1 = this;
            java.lang.String r0 = r1.arch
            return r0
    }

    public java.lang.String getBuildId() {
            r1 = this;
            java.lang.String r0 = r1.buildId
            return r0
    }

    public java.lang.String getLibraryName() {
            r1 = this;
            java.lang.String r0 = r1.libraryName
            return r0
    }
}
