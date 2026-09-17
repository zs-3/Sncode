package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
final class AutoValue_NetworkConnectionInfo extends com.google.android.datatransport.cct.internal.NetworkConnectionInfo {
    private final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype;
    private final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType;

    /* renamed from: com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder {
        private com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype;
        private com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public com.google.android.datatransport.cct.internal.NetworkConnectionInfo build() {
                r4 = this;
                com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo r0 = new com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r1 = r4.networkType
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r2 = r4.mobileSubtype
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder setMobileSubtype(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype r1) {
                r0 = this;
                r0.mobileSubtype = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder setNetworkType(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType r1) {
                r0 = this;
                r0.networkType = r1
                return r0
        }
    }

    private AutoValue_NetworkConnectionInfo(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType r1, com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype r2) {
            r0 = this;
            r0.<init>()
            r0.networkType = r1
            r0.mobileSubtype = r2
            return
    }

    /* synthetic */ AutoValue_NetworkConnectionInfo(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType r1, com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype r2, com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.cct.internal.NetworkConnectionInfo
            r2 = 0
            if (r1 == 0) goto L38
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r5 = (com.google.android.datatransport.cct.internal.NetworkConnectionInfo) r5
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r1 = r4.networkType
            if (r1 != 0) goto L16
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r1 = r5.getNetworkType()
            if (r1 != 0) goto L36
            goto L20
        L16:
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r3 = r5.getNetworkType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L36
        L20:
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r1 = r4.mobileSubtype
            if (r1 != 0) goto L2b
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r5 = r5.getMobileSubtype()
            if (r5 != 0) goto L36
            goto L37
        L2b:
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r5 = r5.getMobileSubtype()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L36
            goto L37
        L36:
            r0 = 0
        L37:
            return r0
        L38:
            return r2
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype getMobileSubtype() {
            r1 = this;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r0 = r1.mobileSubtype
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType getNetworkType() {
            r1 = this;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r0 = r1.networkType
            return r0
    }

    public int hashCode() {
            r3 = this;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r0 = r3.networkType
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r2
            int r0 = r0 * r2
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r2 = r3.mobileSubtype
            if (r2 != 0) goto L16
            goto L1a
        L16:
            int r1 = r2.hashCode()
        L1a:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NetworkConnectionInfo{networkType="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r1 = r2.networkType
            r0.append(r1)
            java.lang.String r1 = ", mobileSubtype="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r1 = r2.mobileSubtype
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
