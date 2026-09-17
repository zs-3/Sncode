package com.google.firebase.platforminfo;

/* loaded from: classes2.dex */
final class AutoValue_LibraryVersion extends com.google.firebase.platforminfo.LibraryVersion {
    private final java.lang.String libraryName;
    private final java.lang.String version;

    AutoValue_LibraryVersion(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null libraryName"
            java.util.Objects.requireNonNull(r2, r0)
            r1.libraryName = r2
            java.lang.String r2 = "Null version"
            java.util.Objects.requireNonNull(r3, r2)
            r1.version = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.platforminfo.LibraryVersion
            r2 = 0
            if (r1 == 0) goto L26
            com.google.firebase.platforminfo.LibraryVersion r5 = (com.google.firebase.platforminfo.LibraryVersion) r5
            java.lang.String r1 = r4.libraryName
            java.lang.String r3 = r5.getLibraryName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            java.lang.String r1 = r4.version
            java.lang.String r5 = r5.getVersion()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
        L26:
            return r2
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public java.lang.String getLibraryName() {
            r1 = this;
            java.lang.String r0 = r1.libraryName
            return r0
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.libraryName
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r1 = r2.version
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LibraryVersion{libraryName="
            r0.append(r1)
            java.lang.String r1 = r2.libraryName
            r0.append(r1)
            java.lang.String r1 = ", version="
            r0.append(r1)
            java.lang.String r1 = r2.version
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
