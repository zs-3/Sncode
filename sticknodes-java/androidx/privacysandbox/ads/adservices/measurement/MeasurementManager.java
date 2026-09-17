package androidx.privacysandbox.ads.adservices.measurement;

/* compiled from: MeasurementManager.kt */
/* loaded from: classes.dex */
public abstract class MeasurementManager {
    public static final androidx.privacysandbox.ads.adservices.measurement.MeasurementManager.Companion Companion = null;

    /* compiled from: MeasurementManager.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @android.annotation.SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final androidx.privacysandbox.ads.adservices.measurement.MeasurementManager obtain(android.content.Context r5) {
                r4 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AdServicesInfo.version="
                r0.append(r1)
                androidx.privacysandbox.ads.adservices.internal.AdServicesInfo r1 = androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE
                int r2 = r1.adServicesVersion()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "MeasurementManager"
                android.util.Log.d(r2, r0)
                int r0 = r1.adServicesVersion()
                r3 = 5
                if (r0 < r3) goto L2e
                androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerApi33Ext5Impl r0 = new androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerApi33Ext5Impl
                r0.<init>(r5)
                goto L46
            L2e:
                int r0 = r1.extServicesVersionS()
                r1 = 9
                if (r0 < r1) goto L45
                androidx.privacysandbox.ads.adservices.internal.BackCompatManager r0 = androidx.privacysandbox.ads.adservices.internal.BackCompatManager.INSTANCE
                androidx.privacysandbox.ads.adservices.measurement.MeasurementManager$Companion$obtain$1 r1 = new androidx.privacysandbox.ads.adservices.measurement.MeasurementManager$Companion$obtain$1
                r1.<init>(r5)
                java.lang.Object r5 = r0.getManager(r5, r2, r1)
                r0 = r5
                androidx.privacysandbox.ads.adservices.measurement.MeasurementManager r0 = (androidx.privacysandbox.ads.adservices.measurement.MeasurementManager) r0
                goto L46
            L45:
                r0 = 0
            L46:
                return r0
        }
    }

    static {
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManager$Companion r0 = new androidx.privacysandbox.ads.adservices.measurement.MeasurementManager$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManager.Companion = r0
            return
    }

    public MeasurementManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.Object deleteRegistrations(androidx.privacysandbox.ads.adservices.measurement.DeletionRequest r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2);

    public abstract java.lang.Object getMeasurementApiStatus(kotlin.coroutines.Continuation<? super java.lang.Integer> r1);

    public abstract java.lang.Object registerSource(android.net.Uri r1, android.view.InputEvent r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3);

    public abstract java.lang.Object registerSource(androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2);

    public abstract java.lang.Object registerTrigger(android.net.Uri r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2);

    public abstract java.lang.Object registerWebSource(androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2);

    public abstract java.lang.Object registerWebTrigger(androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2);
}
