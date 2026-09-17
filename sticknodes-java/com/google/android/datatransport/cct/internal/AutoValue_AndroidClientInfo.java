package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
final class AutoValue_AndroidClientInfo extends com.google.android.datatransport.cct.internal.AndroidClientInfo {
    private final java.lang.String applicationBuild;
    private final java.lang.String country;
    private final java.lang.String device;
    private final java.lang.String fingerprint;
    private final java.lang.String hardware;
    private final java.lang.String locale;
    private final java.lang.String manufacturer;
    private final java.lang.String mccMnc;
    private final java.lang.String model;
    private final java.lang.String osBuild;
    private final java.lang.String product;
    private final java.lang.Integer sdkVersion;

    /* renamed from: com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder {
        private java.lang.String applicationBuild;
        private java.lang.String country;
        private java.lang.String device;
        private java.lang.String fingerprint;
        private java.lang.String hardware;
        private java.lang.String locale;
        private java.lang.String manufacturer;
        private java.lang.String mccMnc;
        private java.lang.String model;
        private java.lang.String osBuild;
        private java.lang.String product;
        private java.lang.Integer sdkVersion;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo build() {
                r15 = this;
                com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo r14 = new com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo
                java.lang.Integer r1 = r15.sdkVersion
                java.lang.String r2 = r15.model
                java.lang.String r3 = r15.hardware
                java.lang.String r4 = r15.device
                java.lang.String r5 = r15.product
                java.lang.String r6 = r15.osBuild
                java.lang.String r7 = r15.manufacturer
                java.lang.String r8 = r15.fingerprint
                java.lang.String r9 = r15.locale
                java.lang.String r10 = r15.country
                java.lang.String r11 = r15.mccMnc
                java.lang.String r12 = r15.applicationBuild
                r13 = 0
                r0 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r14
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setApplicationBuild(java.lang.String r1) {
                r0 = this;
                r0.applicationBuild = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setCountry(java.lang.String r1) {
                r0 = this;
                r0.country = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setDevice(java.lang.String r1) {
                r0 = this;
                r0.device = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setFingerprint(java.lang.String r1) {
                r0 = this;
                r0.fingerprint = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setHardware(java.lang.String r1) {
                r0 = this;
                r0.hardware = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setLocale(java.lang.String r1) {
                r0 = this;
                r0.locale = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setManufacturer(java.lang.String r1) {
                r0 = this;
                r0.manufacturer = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setMccMnc(java.lang.String r1) {
                r0 = this;
                r0.mccMnc = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setModel(java.lang.String r1) {
                r0 = this;
                r0.model = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setOsBuild(java.lang.String r1) {
                r0 = this;
                r0.osBuild = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setProduct(java.lang.String r1) {
                r0 = this;
                r0.product = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setSdkVersion(java.lang.Integer r1) {
                r0 = this;
                r0.sdkVersion = r1
                return r0
        }
    }

    private AutoValue_AndroidClientInfo(java.lang.Integer r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r0 = this;
            r0.<init>()
            r0.sdkVersion = r1
            r0.model = r2
            r0.hardware = r3
            r0.device = r4
            r0.product = r5
            r0.osBuild = r6
            r0.manufacturer = r7
            r0.fingerprint = r8
            r0.locale = r9
            r0.country = r10
            r0.mccMnc = r11
            r0.applicationBuild = r12
            return
    }

    /* synthetic */ AutoValue_AndroidClientInfo(java.lang.Integer r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo.AnonymousClass1 r13) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.cct.internal.AndroidClientInfo
            r2 = 0
            if (r1 == 0) goto L10a
            com.google.android.datatransport.cct.internal.AndroidClientInfo r5 = (com.google.android.datatransport.cct.internal.AndroidClientInfo) r5
            java.lang.Integer r1 = r4.sdkVersion
            if (r1 != 0) goto L16
            java.lang.Integer r1 = r5.getSdkVersion()
            if (r1 != 0) goto L108
            goto L20
        L16:
            java.lang.Integer r3 = r5.getSdkVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L108
        L20:
            java.lang.String r1 = r4.model
            if (r1 != 0) goto L2b
            java.lang.String r1 = r5.getModel()
            if (r1 != 0) goto L108
            goto L35
        L2b:
            java.lang.String r3 = r5.getModel()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L108
        L35:
            java.lang.String r1 = r4.hardware
            if (r1 != 0) goto L40
            java.lang.String r1 = r5.getHardware()
            if (r1 != 0) goto L108
            goto L4a
        L40:
            java.lang.String r3 = r5.getHardware()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L108
        L4a:
            java.lang.String r1 = r4.device
            if (r1 != 0) goto L55
            java.lang.String r1 = r5.getDevice()
            if (r1 != 0) goto L108
            goto L5f
        L55:
            java.lang.String r3 = r5.getDevice()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L108
        L5f:
            java.lang.String r1 = r4.product
            if (r1 != 0) goto L6a
            java.lang.String r1 = r5.getProduct()
            if (r1 != 0) goto L108
            goto L74
        L6a:
            java.lang.String r3 = r5.getProduct()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L108
        L74:
            java.lang.String r1 = r4.osBuild
            if (r1 != 0) goto L7f
            java.lang.String r1 = r5.getOsBuild()
            if (r1 != 0) goto L108
            goto L89
        L7f:
            java.lang.String r3 = r5.getOsBuild()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L108
        L89:
            java.lang.String r1 = r4.manufacturer
            if (r1 != 0) goto L94
            java.lang.String r1 = r5.getManufacturer()
            if (r1 != 0) goto L108
            goto L9e
        L94:
            java.lang.String r3 = r5.getManufacturer()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L108
        L9e:
            java.lang.String r1 = r4.fingerprint
            if (r1 != 0) goto La9
            java.lang.String r1 = r5.getFingerprint()
            if (r1 != 0) goto L108
            goto Lb3
        La9:
            java.lang.String r3 = r5.getFingerprint()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L108
        Lb3:
            java.lang.String r1 = r4.locale
            if (r1 != 0) goto Lbe
            java.lang.String r1 = r5.getLocale()
            if (r1 != 0) goto L108
            goto Lc8
        Lbe:
            java.lang.String r3 = r5.getLocale()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L108
        Lc8:
            java.lang.String r1 = r4.country
            if (r1 != 0) goto Ld3
            java.lang.String r1 = r5.getCountry()
            if (r1 != 0) goto L108
            goto Ldd
        Ld3:
            java.lang.String r3 = r5.getCountry()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L108
        Ldd:
            java.lang.String r1 = r4.mccMnc
            if (r1 != 0) goto Le8
            java.lang.String r1 = r5.getMccMnc()
            if (r1 != 0) goto L108
            goto Lf2
        Le8:
            java.lang.String r3 = r5.getMccMnc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L108
        Lf2:
            java.lang.String r1 = r4.applicationBuild
            if (r1 != 0) goto Lfd
            java.lang.String r5 = r5.getApplicationBuild()
            if (r5 != 0) goto L108
            goto L109
        Lfd:
            java.lang.String r5 = r5.getApplicationBuild()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L108
            goto L109
        L108:
            r0 = 0
        L109:
            return r0
        L10a:
            return r2
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getApplicationBuild() {
            r1 = this;
            java.lang.String r0 = r1.applicationBuild
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getCountry() {
            r1 = this;
            java.lang.String r0 = r1.country
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getDevice() {
            r1 = this;
            java.lang.String r0 = r1.device
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getFingerprint() {
            r1 = this;
            java.lang.String r0 = r1.fingerprint
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getHardware() {
            r1 = this;
            java.lang.String r0 = r1.hardware
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getLocale() {
            r1 = this;
            java.lang.String r0 = r1.locale
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getManufacturer() {
            r1 = this;
            java.lang.String r0 = r1.manufacturer
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getMccMnc() {
            r1 = this;
            java.lang.String r0 = r1.mccMnc
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getModel() {
            r1 = this;
            java.lang.String r0 = r1.model
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getOsBuild() {
            r1 = this;
            java.lang.String r0 = r1.osBuild
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getProduct() {
            r1 = this;
            java.lang.String r0 = r1.product
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.Integer getSdkVersion() {
            r1 = this;
            java.lang.Integer r0 = r1.sdkVersion
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.Integer r0 = r4.sdkVersion
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
            java.lang.String r3 = r4.model
            if (r3 != 0) goto L17
            r3 = 0
            goto L1b
        L17:
            int r3 = r3.hashCode()
        L1b:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r4.hardware
            if (r3 != 0) goto L24
            r3 = 0
            goto L28
        L24:
            int r3 = r3.hashCode()
        L28:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r4.device
            if (r3 != 0) goto L31
            r3 = 0
            goto L35
        L31:
            int r3 = r3.hashCode()
        L35:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r4.product
            if (r3 != 0) goto L3e
            r3 = 0
            goto L42
        L3e:
            int r3 = r3.hashCode()
        L42:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r4.osBuild
            if (r3 != 0) goto L4b
            r3 = 0
            goto L4f
        L4b:
            int r3 = r3.hashCode()
        L4f:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r4.manufacturer
            if (r3 != 0) goto L58
            r3 = 0
            goto L5c
        L58:
            int r3 = r3.hashCode()
        L5c:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r4.fingerprint
            if (r3 != 0) goto L65
            r3 = 0
            goto L69
        L65:
            int r3 = r3.hashCode()
        L69:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r4.locale
            if (r3 != 0) goto L72
            r3 = 0
            goto L76
        L72:
            int r3 = r3.hashCode()
        L76:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r4.country
            if (r3 != 0) goto L7f
            r3 = 0
            goto L83
        L7f:
            int r3 = r3.hashCode()
        L83:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r4.mccMnc
            if (r3 != 0) goto L8c
            r3 = 0
            goto L90
        L8c:
            int r3 = r3.hashCode()
        L90:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r2 = r4.applicationBuild
            if (r2 != 0) goto L98
            goto L9c
        L98:
            int r1 = r2.hashCode()
        L9c:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AndroidClientInfo{sdkVersion="
            r0.append(r1)
            java.lang.Integer r1 = r2.sdkVersion
            r0.append(r1)
            java.lang.String r1 = ", model="
            r0.append(r1)
            java.lang.String r1 = r2.model
            r0.append(r1)
            java.lang.String r1 = ", hardware="
            r0.append(r1)
            java.lang.String r1 = r2.hardware
            r0.append(r1)
            java.lang.String r1 = ", device="
            r0.append(r1)
            java.lang.String r1 = r2.device
            r0.append(r1)
            java.lang.String r1 = ", product="
            r0.append(r1)
            java.lang.String r1 = r2.product
            r0.append(r1)
            java.lang.String r1 = ", osBuild="
            r0.append(r1)
            java.lang.String r1 = r2.osBuild
            r0.append(r1)
            java.lang.String r1 = ", manufacturer="
            r0.append(r1)
            java.lang.String r1 = r2.manufacturer
            r0.append(r1)
            java.lang.String r1 = ", fingerprint="
            r0.append(r1)
            java.lang.String r1 = r2.fingerprint
            r0.append(r1)
            java.lang.String r1 = ", locale="
            r0.append(r1)
            java.lang.String r1 = r2.locale
            r0.append(r1)
            java.lang.String r1 = ", country="
            r0.append(r1)
            java.lang.String r1 = r2.country
            r0.append(r1)
            java.lang.String r1 = ", mccMnc="
            r0.append(r1)
            java.lang.String r1 = r2.mccMnc
            r0.append(r1)
            java.lang.String r1 = ", applicationBuild="
            r0.append(r1)
            java.lang.String r1 = r2.applicationBuild
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
