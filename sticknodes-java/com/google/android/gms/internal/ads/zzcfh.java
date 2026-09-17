package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcfh implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.webkit.JsResult zza;

    zzcfh(android.webkit.JsResult r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            android.webkit.JsResult r1 = r0.zza
            r1.cancel()
            return
    }
}
