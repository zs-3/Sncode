package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbse implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsg zza;

    zzbse(com.google.android.gms.internal.ads.zzbsg r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbsg r1 = r0.zza
            android.content.Intent r2 = r1.zzb()
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r1 = com.google.android.gms.internal.ads.zzbsg.zza(r1)
            com.google.android.gms.ads.internal.util.zzt.zzT(r1, r2)
            return
    }
}
