package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzanj implements com.google.android.gms.internal.ads.zzamz {
    private final com.google.android.gms.internal.ads.zzek zza;
    private com.google.android.gms.internal.ads.zzaeh zzb;
    private boolean zzc;
    private long zzd;
    private int zze;
    private int zzf;

    public zzanj() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 10
            r0.<init>(r1)
            r2.zza = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzd = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(com.google.android.gms.internal.ads.zzek r8) {
            r7 = this;
            com.google.android.gms.internal.ads.zzaeh r0 = r7.zzb
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            boolean r0 = r7.zzc
            if (r0 != 0) goto La
            return
        La:
            int r0 = r8.zzb()
            int r1 = r7.zzf
            r2 = 10
            if (r1 >= r2) goto L71
            int r1 = 10 - r1
            int r1 = java.lang.Math.min(r0, r1)
            byte[] r3 = r8.zzN()
            int r4 = r8.zzd()
            com.google.android.gms.internal.ads.zzek r5 = r7.zza
            byte[] r5 = r5.zzN()
            int r6 = r7.zzf
            java.lang.System.arraycopy(r3, r4, r5, r6, r1)
            int r3 = r7.zzf
            int r3 = r3 + r1
            if (r3 != r2) goto L71
            com.google.android.gms.internal.ads.zzek r1 = r7.zza
            r3 = 0
            r1.zzL(r3)
            com.google.android.gms.internal.ads.zzek r1 = r7.zza
            int r1 = r1.zzm()
            r4 = 73
            if (r1 != r4) goto L67
            com.google.android.gms.internal.ads.zzek r1 = r7.zza
            int r1 = r1.zzm()
            r4 = 68
            if (r1 != r4) goto L67
            com.google.android.gms.internal.ads.zzek r1 = r7.zza
            int r1 = r1.zzm()
            r4 = 51
            if (r1 == r4) goto L57
            goto L67
        L57:
            com.google.android.gms.internal.ads.zzek r1 = r7.zza
            r3 = 3
            r1.zzM(r3)
            com.google.android.gms.internal.ads.zzek r1 = r7.zza
            int r1 = r1.zzl()
            int r1 = r1 + r2
            r7.zze = r1
            goto L71
        L67:
            java.lang.String r8 = "Id3Reader"
            java.lang.String r0 = "Discarding invalid ID3 tag"
            com.google.android.gms.internal.ads.zzea.zzf(r8, r0)
            r7.zzc = r3
            return
        L71:
            int r1 = r7.zze
            int r2 = r7.zzf
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.gms.internal.ads.zzaeh r1 = r7.zzb
            r1.zzq(r8, r0)
            int r8 = r7.zzf
            int r8 = r8 + r0
            r7.zzf = r8
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(com.google.android.gms.internal.ads.zzade r3, com.google.android.gms.internal.ads.zzaon r4) {
            r2 = this;
            r4.zzc()
            int r0 = r4.zza()
            r1 = 5
            com.google.android.gms.internal.ads.zzaeh r3 = r3.zzw(r0, r1)
            r2.zzb = r3
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r4 = r4.zzb()
            r0.zzL(r4)
            java.lang.String r4 = "application/id3"
            r0.zzZ(r4)
            com.google.android.gms.internal.ads.zzaf r4 = r0.zzaf()
            r3.zzl(r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean r9) {
            r8 = this;
            com.google.android.gms.internal.ads.zzaeh r9 = r8.zzb
            com.google.android.gms.internal.ads.zzdi.zzb(r9)
            boolean r9 = r8.zzc
            if (r9 == 0) goto L32
            int r9 = r8.zze
            if (r9 == 0) goto L32
            int r0 = r8.zzf
            if (r0 == r9) goto L12
            goto L32
        L12:
            long r0 = r8.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            com.google.android.gms.internal.ads.zzaeh r1 = r8.zzb
            long r2 = r8.zzd
            r4 = 1
            int r5 = r8.zze
            r6 = 0
            r7 = 0
            r1.zzs(r2, r4, r5, r6, r7)
            r8.zzc = r9
        L32:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long r1, int r3) {
            r0 = this;
            r3 = r3 & 4
            if (r3 != 0) goto L5
            return
        L5:
            r3 = 1
            r0.zzc = r3
            r0.zzd = r1
            r1 = 0
            r0.zze = r1
            r0.zzf = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
            r2 = this;
            r0 = 0
            r2.zzc = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzd = r0
            return
    }
}
