package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaw implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzax zza;

    zzaw(com.google.android.gms.ads.internal.util.zzax r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.util.zzax r1 = r0.zza
            android.content.Context r1 = r1.zza
            java.lang.String r2 = "https://support.google.com/dfp_premium/answer/7160685#push"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            com.google.android.gms.ads.internal.util.zzt.zzU(r1, r2)
            return
    }
}
