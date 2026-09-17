package com.google.android.datatransport.cct.internal;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class AndroidClientInfo {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo build();

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setApplicationBuild(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setCountry(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setDevice(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setFingerprint(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setHardware(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setLocale(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setManufacturer(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setMccMnc(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setModel(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setOsBuild(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setProduct(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setSdkVersion(java.lang.Integer r1);
    }

    public AndroidClientInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo$Builder
            r0.<init>()
            return r0
    }

    public abstract java.lang.String getApplicationBuild();

    public abstract java.lang.String getCountry();

    public abstract java.lang.String getDevice();

    public abstract java.lang.String getFingerprint();

    public abstract java.lang.String getHardware();

    public abstract java.lang.String getLocale();

    public abstract java.lang.String getManufacturer();

    public abstract java.lang.String getMccMnc();

    public abstract java.lang.String getModel();

    public abstract java.lang.String getOsBuild();

    public abstract java.lang.String getProduct();

    public abstract java.lang.Integer getSdkVersion();
}
