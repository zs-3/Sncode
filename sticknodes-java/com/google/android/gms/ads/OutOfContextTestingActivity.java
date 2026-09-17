package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends android.app.Activity {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String AD_UNIT_KEY = "adUnit";

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    public OutOfContextTestingActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            com.google.android.gms.ads.internal.client.zzba r4 = com.google.android.gms.ads.internal.client.zzbc.zza()
            com.google.android.gms.internal.ads.zzbph r0 = new com.google.android.gms.internal.ads.zzbph
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzdu r4 = r4.zzh(r3, r0)
            if (r4 != 0) goto L16
            r3.finish()
            return
        L16:
            int r0 = com.google.android.gms.ads.R.layout.admob_empty_layout
            r3.setContentView(r0)
            int r0 = com.google.android.gms.ads.R.id.layout
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.content.Intent r1 = r3.getIntent()
            if (r1 != 0) goto L2d
            r3.finish()
            return
        L2d:
            java.lang.String r2 = "adUnit"
            java.lang.String r1 = r1.getStringExtra(r2)
            if (r1 != 0) goto L39
            r3.finish()
            return
        L39:
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> L45
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> L45
            r4.zze(r1, r2, r0)     // Catch: android.os.RemoteException -> L45
            return
        L45:
            r3.finish()
            return
    }
}
