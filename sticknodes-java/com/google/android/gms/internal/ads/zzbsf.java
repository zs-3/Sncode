package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbsf implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsg zza;

    zzbsf(com.google.android.gms.internal.ads.zzbsg r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbsg r1 = r0.zza
            java.lang.String r2 = "Operation denied by user."
            r1.zzh(r2)
            return
    }
}
