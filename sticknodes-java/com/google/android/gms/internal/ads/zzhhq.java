package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzhhq extends com.google.android.gms.internal.ads.zzhht implements com.google.android.gms.internal.ads.zzarp {
    protected final java.lang.String zza;

    public zzhhq(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = "moov"
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final void zzb(com.google.android.gms.internal.ads.zzhhu r3, java.nio.ByteBuffer r4, long r5, com.google.android.gms.internal.ads.zzarm r7) throws java.io.IOException {
            r2 = this;
            r3.zzb()
            r4.remaining()
            r4.remaining()
            r2.zzc = r3
            long r0 = r3.zzb()
            r2.zze = r0
            long r0 = r3.zzb()
            long r0 = r0 + r5
            r3.zze(r0)
            long r3 = r3.zzb()
            r2.zzf = r3
            r2.zzb = r7
            return
    }
}
