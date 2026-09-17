package androidx.webkit.internal;

/* loaded from: classes.dex */
public abstract class StartupApiFeature {
    private static final java.util.Set<androidx.webkit.internal.StartupApiFeature> sValues = null;
    private final java.lang.String mInternalFeatureValue;
    private final java.lang.String mPublicFeatureValue;

    public static class NoFramework extends androidx.webkit.internal.StartupApiFeature {
        NoFramework(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public static class P extends androidx.webkit.internal.StartupApiFeature {
        P(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.webkit.internal.StartupApiFeature.sValues = r0
            return
    }

    StartupApiFeature(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.mPublicFeatureValue = r1
            r0.mInternalFeatureValue = r2
            java.util.Set<androidx.webkit.internal.StartupApiFeature> r1 = androidx.webkit.internal.StartupApiFeature.sValues
            r1.add(r0)
            return
    }
}
