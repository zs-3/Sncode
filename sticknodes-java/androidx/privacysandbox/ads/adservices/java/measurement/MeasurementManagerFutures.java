package androidx.privacysandbox.ads.adservices.java.measurement;

/* compiled from: MeasurementManagerFutures.kt */
/* loaded from: classes.dex */
public abstract class MeasurementManagerFutures {
    public static final androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Companion Companion = null;

    /* compiled from: MeasurementManagerFutures.kt */
    private static final class Api33Ext5JavaImpl extends androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures {
        private final androidx.privacysandbox.ads.adservices.measurement.MeasurementManager mMeasurementManager;

        public Api33Ext5JavaImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManager r2) {
                r1 = this;
                java.lang.String r0 = "mMeasurementManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.mMeasurementManager = r2
                return
        }

        public static final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.MeasurementManager access$getMMeasurementManager$p(androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl r0) {
                androidx.privacysandbox.ads.adservices.measurement.MeasurementManager r0 = r0.mMeasurementManager
                return r0
        }

        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> deleteRegistrationsAsync(androidx.privacysandbox.ads.adservices.measurement.DeletionRequest r8) {
                r7 = this;
                java.lang.String r0 = "deletionRequest"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getDefault()
                kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
                androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1 r4 = new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1
                r0 = 0
                r4.<init>(r7, r8, r0)
                r2 = 0
                r3 = 0
                r5 = 3
                r6 = 0
                kotlinx.coroutines.Deferred r8 = kotlinx.coroutines.BuildersKt.async$default(r1, r2, r3, r4, r5, r6)
                r1 = 1
                com.google.common.util.concurrent.ListenableFuture r8 = androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(r8, r0, r1, r0)
                return r8
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> getMeasurementApiStatusAsync() {
                r7 = this;
                kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getDefault()
                kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
                androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1 r4 = new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1
                r0 = 0
                r4.<init>(r7, r0)
                r2 = 0
                r3 = 0
                r5 = 3
                r6 = 0
                kotlinx.coroutines.Deferred r1 = kotlinx.coroutines.BuildersKt.async$default(r1, r2, r3, r4, r5, r6)
                r2 = 1
                com.google.common.util.concurrent.ListenableFuture r0 = androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(r1, r0, r2, r0)
                return r0
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> registerSourceAsync(android.net.Uri r8, android.view.InputEvent r9) {
                r7 = this;
                java.lang.String r0 = "attributionSource"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getDefault()
                kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
                androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1 r4 = new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1
                r0 = 0
                r4.<init>(r7, r8, r9, r0)
                r2 = 0
                r3 = 0
                r5 = 3
                r6 = 0
                kotlinx.coroutines.Deferred r8 = kotlinx.coroutines.BuildersKt.async$default(r1, r2, r3, r4, r5, r6)
                r9 = 1
                com.google.common.util.concurrent.ListenableFuture r8 = androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(r8, r0, r9, r0)
                return r8
        }

        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> registerSourceAsync(androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r8) {
                r7 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getDefault()
                kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
                androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2 r4 = new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2
                r0 = 0
                r4.<init>(r7, r8, r0)
                r2 = 0
                r3 = 0
                r5 = 3
                r6 = 0
                kotlinx.coroutines.Deferred r8 = kotlinx.coroutines.BuildersKt.async$default(r1, r2, r3, r4, r5, r6)
                r1 = 1
                com.google.common.util.concurrent.ListenableFuture r8 = androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(r8, r0, r1, r0)
                return r8
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> registerTriggerAsync(android.net.Uri r8) {
                r7 = this;
                java.lang.String r0 = "trigger"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getDefault()
                kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
                androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1 r4 = new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1
                r0 = 0
                r4.<init>(r7, r8, r0)
                r2 = 0
                r3 = 0
                r5 = 3
                r6 = 0
                kotlinx.coroutines.Deferred r8 = kotlinx.coroutines.BuildersKt.async$default(r1, r2, r3, r4, r5, r6)
                r1 = 1
                com.google.common.util.concurrent.ListenableFuture r8 = androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(r8, r0, r1, r0)
                return r8
        }

        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> registerWebSourceAsync(androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest r8) {
                r7 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getDefault()
                kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
                androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1 r4 = new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1
                r0 = 0
                r4.<init>(r7, r8, r0)
                r2 = 0
                r3 = 0
                r5 = 3
                r6 = 0
                kotlinx.coroutines.Deferred r8 = kotlinx.coroutines.BuildersKt.async$default(r1, r2, r3, r4, r5, r6)
                r1 = 1
                com.google.common.util.concurrent.ListenableFuture r8 = androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(r8, r0, r1, r0)
                return r8
        }

        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> registerWebTriggerAsync(androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest r8) {
                r7 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getDefault()
                kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
                androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1 r4 = new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1
                r0 = 0
                r4.<init>(r7, r8, r0)
                r2 = 0
                r3 = 0
                r5 = 3
                r6 = 0
                kotlinx.coroutines.Deferred r8 = kotlinx.coroutines.BuildersKt.async$default(r1, r2, r3, r4, r5, r6)
                r1 = 1
                com.google.common.util.concurrent.ListenableFuture r8 = androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(r8, r0, r1, r0)
                return r8
        }
    }

    /* compiled from: MeasurementManagerFutures.kt */
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

        public final androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures from(android.content.Context r2) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                androidx.privacysandbox.ads.adservices.measurement.MeasurementManager$Companion r0 = androidx.privacysandbox.ads.adservices.measurement.MeasurementManager.Companion
                androidx.privacysandbox.ads.adservices.measurement.MeasurementManager r2 = r0.obtain(r2)
                if (r2 == 0) goto L13
                androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl r0 = new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl
                r0.<init>(r2)
                goto L14
            L13:
                r0 = 0
            L14:
                return r0
        }
    }

    static {
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Companion r0 = new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Companion = r0
            return
    }

    public MeasurementManagerFutures() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures from(android.content.Context r1) {
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Companion r0 = androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Companion
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures r1 = r0.from(r1)
            return r1
    }

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> getMeasurementApiStatusAsync();

    public abstract com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> registerSourceAsync(android.net.Uri r1, android.view.InputEvent r2);

    public abstract com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> registerTriggerAsync(android.net.Uri r1);
}
