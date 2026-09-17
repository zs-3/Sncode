package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class AdActivity extends android.app.Activity {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private com.google.android.gms.internal.ads.zzbtm zza;

    public AdActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbtm r0 = r2.zza
            if (r0 == 0) goto Le
            r0.zzx()     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
        Le:
            return
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbtm r0 = r2.zza     // Catch: java.lang.Exception -> L8
            if (r0 == 0) goto Le
            r0.zzh(r3, r4, r5)     // Catch: java.lang.Exception -> L8
            goto Le
        L8:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
        Le:
            super.onActivityResult(r3, r4, r5)
            return
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
            r2 = this;
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.zzbtm r1 = r2.zza     // Catch: android.os.RemoteException -> Ld
            if (r1 == 0) goto L11
            boolean r1 = r1.zzH()     // Catch: android.os.RemoteException -> Ld
            if (r1 == 0) goto L1b
            goto L11
        Ld:
            r1 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r1)
        L11:
            super.onBackPressed()
            com.google.android.gms.internal.ads.zzbtm r1 = r2.zza     // Catch: android.os.RemoteException -> L1c
            if (r1 == 0) goto L1b
            r1.zzi()     // Catch: android.os.RemoteException -> L1c
        L1b:
            return
        L1c:
            r1 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r1)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            com.google.android.gms.internal.ads.zzbtm r0 = r1.zza     // Catch: android.os.RemoteException -> Lf
            if (r0 == 0) goto Le
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> Lf
            r0.zzk(r2)     // Catch: android.os.RemoteException -> Lf
        Le:
            return
        Lf:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzbc.zza()
            com.google.android.gms.internal.ads.zzbtm r0 = r0.zzq(r2)
            r2.zza = r0
            java.lang.String r1 = "#007 Could not call remote method."
            if (r0 == 0) goto L1d
            r0.zzl(r3)     // Catch: android.os.RemoteException -> L15
            return
        L15:
            r3 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r3)
            r2.finish()
            return
        L1d:
            r3 = 0
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r3)
            r2.finish()
            return
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbtm r0 = r2.zza     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto Le
            r0.zzm()     // Catch: android.os.RemoteException -> L8
            goto Le
        L8:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
        Le:
            super.onDestroy()
            return
    }

    @Override // android.app.Activity
    protected final void onPause() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbtm r0 = r2.zza     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto L11
            r0.zzo()     // Catch: android.os.RemoteException -> L8
            goto L11
        L8:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            r2.finish()
        L11:
            super.onPause()
            return
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbtm r0 = r1.zza     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto L7
            r0.zzp(r2, r3, r4)     // Catch: android.os.RemoteException -> L8
        L7:
            return
        L8:
            r2 = move-exception
            java.lang.String r3 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r3, r2)
            return
    }

    @Override // android.app.Activity
    protected final void onRestart() {
            r2 = this;
            super.onRestart()
            com.google.android.gms.internal.ads.zzbtm r0 = r2.zza     // Catch: android.os.RemoteException -> Lb
            if (r0 == 0) goto La
            r0.zzq()     // Catch: android.os.RemoteException -> Lb
        La:
            return
        Lb:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            r2.finish()
            return
    }

    @Override // android.app.Activity
    protected final void onResume() {
            r2 = this;
            super.onResume()
            com.google.android.gms.internal.ads.zzbtm r0 = r2.zza     // Catch: android.os.RemoteException -> Lb
            if (r0 == 0) goto La
            r0.zzr()     // Catch: android.os.RemoteException -> Lb
        La:
            return
        Lb:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            r2.finish()
            return
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbtm r0 = r2.zza     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto L11
            r0.zzs(r3)     // Catch: android.os.RemoteException -> L8
            goto L11
        L8:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            r2.finish()
        L11:
            super.onSaveInstanceState(r3)
            return
    }

    @Override // android.app.Activity
    protected final void onStart() {
            r2 = this;
            super.onStart()
            com.google.android.gms.internal.ads.zzbtm r0 = r2.zza     // Catch: android.os.RemoteException -> Lb
            if (r0 == 0) goto La
            r0.zzt()     // Catch: android.os.RemoteException -> Lb
        La:
            return
        Lb:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            r2.finish()
            return
    }

    @Override // android.app.Activity
    protected final void onStop() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbtm r0 = r2.zza     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto L11
            r0.zzu()     // Catch: android.os.RemoteException -> L8
            goto L11
        L8:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            r2.finish()
        L11:
            super.onStop()
            return
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
            r2 = this;
            super.onUserLeaveHint()
            com.google.android.gms.internal.ads.zzbtm r0 = r2.zza     // Catch: android.os.RemoteException -> Lb
            if (r0 == 0) goto La
            r0.zzv()     // Catch: android.os.RemoteException -> Lb
        La:
            return
        Lb:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }

    @Override // android.app.Activity
    public final void setContentView(int r1) {
            r0 = this;
            super.setContentView(r1)
            r0.zza()
            return
    }

    @Override // android.app.Activity
    public final void setContentView(android.view.View r1) {
            r0 = this;
            super.setContentView(r1)
            r0.zza()
            return
    }

    @Override // android.app.Activity
    public final void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            super.setContentView(r1, r2)
            r0.zza()
            return
    }
}
