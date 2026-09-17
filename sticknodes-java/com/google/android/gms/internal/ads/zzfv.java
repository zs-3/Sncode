package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfv implements java.lang.Comparable {
    private final com.google.android.gms.internal.ads.zzek zza;
    private long zzb;
    private long zzc;

    public zzfv() {
            r2 = this;
            r2.<init>()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzb = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>()
            r2.zza = r0
            return
    }

    static /* bridge */ /* synthetic */ long zza(com.google.android.gms.internal.ads.zzfv r2) {
            long r0 = r2.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzek zzb(com.google.android.gms.internal.ads.zzfv r0) {
            com.google.android.gms.internal.ads.zzek r0 = r0.zza
            return r0
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzfv r5 = (com.google.android.gms.internal.ads.zzfv) r5
            long r0 = r4.zzb
            long r2 = r5.zzb
            int r0 = java.lang.Long.compare(r0, r2)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            long r0 = r4.zzc
            long r2 = r5.zzc
            int r5 = java.lang.Long.compare(r0, r2)
            return r5
    }

    public final void zzc(long r5, long r7, com.google.android.gms.internal.ads.zzek r9) {
            r4 = this;
            r0 = 0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            com.google.android.gms.internal.ads.zzdi.zzf(r1)
            r4.zzb = r5
            r4.zzc = r7
            com.google.android.gms.internal.ads.zzek r5 = r4.zza
            int r6 = r9.zzb()
            r5.zzI(r6)
            byte[] r5 = r9.zzN()
            int r6 = r9.zzd()
            com.google.android.gms.internal.ads.zzek r7 = r4.zza
            byte[] r7 = r7.zzN()
            int r8 = r9.zzb()
            java.lang.System.arraycopy(r5, r6, r7, r0, r8)
            return
    }
}
