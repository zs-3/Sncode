package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcfg implements android.content.DialogInterface.OnCancelListener {
    final /* synthetic */ android.webkit.JsResult zza;

    zzcfg(android.webkit.JsResult r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            android.webkit.JsResult r1 = r0.zza
            r1.cancel()
            return
    }
}
