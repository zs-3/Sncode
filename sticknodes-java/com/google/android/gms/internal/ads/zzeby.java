package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeby extends com.google.android.gms.internal.ads.zzbvp {
    final /* synthetic */ com.google.android.gms.internal.ads.zzebz zza;

    protected zzeby(com.google.android.gms.internal.ads.zzebz r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zze(com.google.android.gms.ads.internal.util.zzbb r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzebz r0 = r1.zza
            com.google.android.gms.internal.ads.zzcas r0 = r0.zza
            com.google.android.gms.ads.internal.util.zzba r2 = r2.zza()
            r0.zzd(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzf(android.os.ParcelFileDescriptor r2) {
            r1 = this;
            android.os.ParcelFileDescriptor$AutoCloseInputStream r0 = new android.os.ParcelFileDescriptor$AutoCloseInputStream
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzebz r2 = r1.zza
            com.google.android.gms.internal.ads.zzcas r2 = r2.zza
            r2.zzc(r0)
            return
    }
}
