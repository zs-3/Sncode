package androidx.privacysandbox.ads.adservices.internal;

/* compiled from: AdServicesInfo.kt */
/* loaded from: classes.dex */
public final class AdServicesInfo {
    public static final androidx.privacysandbox.ads.adservices.internal.AdServicesInfo INSTANCE = null;

    /* compiled from: AdServicesInfo.kt */
    private static final class Extensions30ExtImpl {
        public static final androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.Extensions30ExtImpl INSTANCE = null;

        static {
                androidx.privacysandbox.ads.adservices.internal.AdServicesInfo$Extensions30ExtImpl r0 = new androidx.privacysandbox.ads.adservices.internal.AdServicesInfo$Extensions30ExtImpl
                r0.<init>()
                androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.Extensions30ExtImpl.INSTANCE = r0
                return
        }

        private Extensions30ExtImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final int getAdExtServicesVersionS() {
                r1 = this;
                r0 = 31
                int r0 = android.os.ext.SdkExtensions.getExtensionVersion(r0)
                return r0
        }
    }

    /* compiled from: AdServicesInfo.kt */
    private static final class Extensions30Impl {
        public static final androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.Extensions30Impl INSTANCE = null;

        static {
                androidx.privacysandbox.ads.adservices.internal.AdServicesInfo$Extensions30Impl r0 = new androidx.privacysandbox.ads.adservices.internal.AdServicesInfo$Extensions30Impl
                r0.<init>()
                androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.Extensions30Impl.INSTANCE = r0
                return
        }

        private Extensions30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final int getAdServicesVersion() {
                r1 = this;
                r0 = 1000000(0xf4240, float:1.401298E-39)
                int r0 = android.os.ext.SdkExtensions.getExtensionVersion(r0)
                return r0
        }
    }

    static {
            androidx.privacysandbox.ads.adservices.internal.AdServicesInfo r0 = new androidx.privacysandbox.ads.adservices.internal.AdServicesInfo
            r0.<init>()
            androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE = r0
            return
    }

    private AdServicesInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public final int adServicesVersion() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Ld
            androidx.privacysandbox.ads.adservices.internal.AdServicesInfo$Extensions30Impl r0 = androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.Extensions30Impl.INSTANCE
            int r0 = r0.getAdServicesVersion()
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public final int extServicesVersionS() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 == r1) goto Ld
            r1 = 32
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto L13
        Ld:
            androidx.privacysandbox.ads.adservices.internal.AdServicesInfo$Extensions30ExtImpl r0 = androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.Extensions30ExtImpl.INSTANCE
            int r0 = r0.getAdExtServicesVersionS()
        L13:
            return r0
    }
}
