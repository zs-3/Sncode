package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class zaae extends com.google.android.gms.common.api.internal.zap {
    private final androidx.collection.ArraySet zad;
    private final com.google.android.gms.common.api.internal.GoogleApiManager zae;

    zaae(com.google.android.gms.common.api.internal.LifecycleFragment r1, com.google.android.gms.common.api.internal.GoogleApiManager r2, com.google.android.gms.common.GoogleApiAvailability r3) {
            r0 = this;
            r0.<init>(r1, r3)
            androidx.collection.ArraySet r1 = new androidx.collection.ArraySet
            r1.<init>()
            r0.zad = r1
            r0.zae = r2
            com.google.android.gms.common.api.internal.LifecycleFragment r1 = r0.mLifecycleFragment
            java.lang.String r2 = "ConnectionlessLifecycleHelper"
            r1.addCallback(r2, r0)
            return
    }

    public static void zad(android.app.Activity r2, com.google.android.gms.common.api.internal.GoogleApiManager r3, com.google.android.gms.common.api.internal.ApiKey r4) {
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(r2)
            java.lang.Class<com.google.android.gms.common.api.internal.zaae> r0 = com.google.android.gms.common.api.internal.zaae.class
            java.lang.String r1 = "ConnectionlessLifecycleHelper"
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = r2.getCallbackOrNull(r1, r0)
            com.google.android.gms.common.api.internal.zaae r0 = (com.google.android.gms.common.api.internal.zaae) r0
            if (r0 != 0) goto L19
            com.google.android.gms.common.api.internal.zaae r0 = new com.google.android.gms.common.api.internal.zaae
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r0.<init>(r2, r3, r1)
        L19:
            java.lang.String r2 = "ApiKey cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r2)
            androidx.collection.ArraySet r2 = r0.zad
            r2.add(r4)
            r3.zaA(r0)
            return
    }

    private final void zae() {
            r1 = this;
            androidx.collection.ArraySet r0 = r1.zad
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zae
            r0.zaA(r1)
        Ld:
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
            r0 = this;
            super.onResume()
            r0.zae()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
            r0 = this;
            super.onStart()
            r0.zae()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
            r1 = this;
            super.onStop()
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zae
            r0.zaB(r1)
            return
    }

    final androidx.collection.ArraySet zaa() {
            r1 = this;
            androidx.collection.ArraySet r0 = r1.zad
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(com.google.android.gms.common.ConnectionResult r2, int r3) {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zae
            r0.zax(r2, r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zae
            r0.zay()
            return
    }
}
