package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public abstract class zap extends com.google.android.gms.common.api.internal.LifecycleCallback implements android.content.DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final java.util.concurrent.atomic.AtomicReference zab;
    protected final com.google.android.gms.common.GoogleApiAvailability zac;
    private final android.os.Handler zad;

    zap(com.google.android.gms.common.api.internal.LifecycleFragment r2, com.google.android.gms.common.GoogleApiAvailability r3) {
            r1 = this;
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r0 = 0
            r2.<init>(r0)
            r1.zab = r2
            com.google.android.gms.internal.base.zau r2 = new com.google.android.gms.internal.base.zau
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            r1.zad = r2
            r1.zac = r3
            return
    }

    private final void zaa(com.google.android.gms.common.ConnectionResult r3, int r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zab
            r1 = 0
            r0.set(r1)
            r2.zab(r3, r4)
            return
    }

    private final void zad() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zab
            r1 = 0
            r0.set(r1)
            r2.zac()
            return
    }

    private static final int zae(com.google.android.gms.common.api.internal.zam r0) {
            if (r0 != 0) goto L4
            r0 = -1
            return r0
        L4:
            int r0 = r0.zaa()
            return r0
    }

    static /* bridge */ /* synthetic */ void zaf(com.google.android.gms.common.api.internal.zap r0, com.google.android.gms.common.ConnectionResult r1, int r2) {
            r0.zaa(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ void zag(com.google.android.gms.common.api.internal.zap r0) {
            r0.zad()
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zab
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zam r0 = (com.google.android.gms.common.api.internal.zam) r0
            r1 = 1
            if (r3 == r1) goto L30
            r4 = 2
            if (r3 == r4) goto Lf
            goto L5b
        Lf:
            com.google.android.gms.common.GoogleApiAvailability r3 = r2.zac
            android.app.Activity r4 = r2.getActivity()
            int r3 = r3.isGooglePlayServicesAvailable(r4)
            if (r3 != 0) goto L1f
            r2.zad()
            return
        L1f:
            if (r0 == 0) goto L68
            com.google.android.gms.common.ConnectionResult r4 = r0.zab()
            int r4 = r4.getErrorCode()
            r5 = 18
            if (r4 != r5) goto L5b
            if (r3 != r5) goto L5b
            goto L68
        L30:
            r3 = -1
            if (r4 != r3) goto L37
            r2.zad()
            return
        L37:
            if (r4 != 0) goto L5b
            if (r0 == 0) goto L68
            r3 = 13
            if (r5 == 0) goto L45
            java.lang.String r4 = "<<ResolutionFailureErrorDetail>>"
            int r3 = r5.getIntExtra(r4, r3)
        L45:
            com.google.android.gms.common.ConnectionResult r4 = new com.google.android.gms.common.ConnectionResult
            r5 = 0
            com.google.android.gms.common.ConnectionResult r1 = r0.zab()
            java.lang.String r1 = r1.toString()
            r4.<init>(r3, r5, r1)
            int r3 = zae(r0)
            r2.zaa(r4, r3)
            return
        L5b:
            if (r0 == 0) goto L68
            com.google.android.gms.common.ConnectionResult r3 = r0.zab()
            int r4 = r0.zaa()
            r2.zaa(r3, r4)
        L68:
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r3) {
            r2 = this;
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 13
            r1 = 0
            r3.<init>(r0, r1)
            java.util.concurrent.atomic.AtomicReference r0 = r2.zab
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zam r0 = (com.google.android.gms.common.api.internal.zam) r0
            int r0 = zae(r0)
            r2.zaa(r3, r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(android.os.Bundle r5) {
            r4 = this;
            super.onCreate(r5)
            if (r5 == 0) goto L34
            java.util.concurrent.atomic.AtomicReference r0 = r4.zab
            r1 = 0
            java.lang.String r2 = "resolving_error"
            boolean r1 = r5.getBoolean(r2, r1)
            if (r1 == 0) goto L30
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            java.lang.String r2 = "failed_status"
            int r2 = r5.getInt(r2)
            java.lang.String r3 = "failed_resolution"
            android.os.Parcelable r3 = r5.getParcelable(r3)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            r1.<init>(r2, r3)
            r2 = -1
            java.lang.String r3 = "failed_client_id"
            int r5 = r5.getInt(r3, r2)
            com.google.android.gms.common.api.internal.zam r2 = new com.google.android.gms.common.api.internal.zam
            r2.<init>(r1, r5)
            goto L31
        L30:
            r2 = 0
        L31:
            r0.set(r2)
        L34:
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(android.os.Bundle r4) {
            r3 = this;
            super.onSaveInstanceState(r4)
            java.util.concurrent.atomic.AtomicReference r0 = r3.zab
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zam r0 = (com.google.android.gms.common.api.internal.zam) r0
            if (r0 != 0) goto Le
            return
        Le:
            r1 = 1
            java.lang.String r2 = "resolving_error"
            r4.putBoolean(r2, r1)
            int r1 = r0.zaa()
            java.lang.String r2 = "failed_client_id"
            r4.putInt(r2, r1)
            com.google.android.gms.common.ConnectionResult r1 = r0.zab()
            int r1 = r1.getErrorCode()
            java.lang.String r2 = "failed_status"
            r4.putInt(r2, r1)
            com.google.android.gms.common.ConnectionResult r0 = r0.zab()
            android.app.PendingIntent r0 = r0.getResolution()
            java.lang.String r1 = "failed_resolution"
            r4.putParcelable(r1, r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
            r1 = this;
            super.onStart()
            r0 = 1
            r1.zaa = r0
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
            r1 = this;
            super.onStop()
            r0 = 0
            r1.zaa = r0
            return
    }

    protected abstract void zab(com.google.android.gms.common.ConnectionResult r1, int r2);

    protected abstract void zac();

    public final void zah(com.google.android.gms.common.ConnectionResult r2, int r3) {
            r1 = this;
            com.google.android.gms.common.api.internal.zam r0 = new com.google.android.gms.common.api.internal.zam
            r0.<init>(r2, r3)
        L5:
            java.util.concurrent.atomic.AtomicReference r2 = r1.zab
            r3 = 0
            boolean r3 = r2.compareAndSet(r3, r0)
            if (r3 == 0) goto L19
            android.os.Handler r2 = r1.zad
            com.google.android.gms.common.api.internal.zao r3 = new com.google.android.gms.common.api.internal.zao
            r3.<init>(r1, r0)
            r2.post(r3)
            return
        L19:
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L5
            return
    }
}
