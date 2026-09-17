package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzakb implements com.google.android.gms.internal.ads.zzadb {
    private com.google.android.gms.internal.ads.zzade zza;
    private com.google.android.gms.internal.ads.zzakj zzb;
    private boolean zzc;

    public zzakb() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean zza(com.google.android.gms.internal.ads.zzadc r9) throws java.io.IOException {
            r8 = this;
            com.google.android.gms.internal.ads.zzakd r0 = new com.google.android.gms.internal.ads.zzakd
            r0.<init>()
            r1 = 1
            boolean r2 = r0.zzb(r9, r1)
            r3 = 0
            if (r2 == 0) goto L70
            int r2 = r0.zza
            r4 = 2
            r2 = r2 & r4
            if (r2 == r4) goto L14
            goto L70
        L14:
            int r0 = r0.zze
            r2 = 8
            int r0 = java.lang.Math.min(r0, r2)
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r2.<init>(r0)
            byte[] r4 = r2.zzN()
            r9.zzh(r4, r3, r0)
            r2.zzL(r3)
            int r9 = r2.zzb()
            r0 = 5
            if (r9 < r0) goto L4d
            int r9 = r2.zzm()
            r0 = 127(0x7f, float:1.78E-43)
            if (r9 != r0) goto L4d
            long r4 = r2.zzu()
            r6 = 1179402563(0x464c4143, double:5.82702289E-315)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L4d
            com.google.android.gms.internal.ads.zzaka r9 = new com.google.android.gms.internal.ads.zzaka
            r9.<init>()
            r8.zzb = r9
            goto L6f
        L4d:
            r2.zzL(r3)
            boolean r9 = com.google.android.gms.internal.ads.zzaen.zzd(r1, r2, r1)     // Catch: com.google.android.gms.internal.ads.zzbo -> L5e
            if (r9 == 0) goto L5f
            com.google.android.gms.internal.ads.zzakl r9 = new com.google.android.gms.internal.ads.zzakl
            r9.<init>()
            r8.zzb = r9
            goto L6f
        L5e:
        L5f:
            r2.zzL(r3)
            boolean r9 = com.google.android.gms.internal.ads.zzakf.zzd(r2)
            if (r9 == 0) goto L70
            com.google.android.gms.internal.ads.zzakf r9 = new com.google.android.gms.internal.ads.zzakf
            r9.<init>()
            r8.zzb = r9
        L6f:
            return r1
        L70:
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r5, com.google.android.gms.internal.ads.zzadx r6) throws java.io.IOException {
            r4 = this;
            com.google.android.gms.internal.ads.zzade r0 = r4.zza
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            com.google.android.gms.internal.ads.zzakj r0 = r4.zzb
            if (r0 != 0) goto L1b
            boolean r0 = r4.zza(r5)
            if (r0 == 0) goto L13
            r5.zzj()
            goto L1b
        L13:
            r5 = 0
            java.lang.String r6 = "Failed to determine bitstream type"
            com.google.android.gms.internal.ads.zzbo r5 = com.google.android.gms.internal.ads.zzbo.zza(r6, r5)
            throw r5
        L1b:
            boolean r0 = r4.zzc
            if (r0 != 0) goto L35
            com.google.android.gms.internal.ads.zzade r0 = r4.zza
            r1 = 0
            r2 = 1
            com.google.android.gms.internal.ads.zzaeh r0 = r0.zzw(r1, r2)
            com.google.android.gms.internal.ads.zzade r1 = r4.zza
            r1.zzD()
            com.google.android.gms.internal.ads.zzakj r1 = r4.zzb
            com.google.android.gms.internal.ads.zzade r3 = r4.zza
            r1.zzh(r3, r0)
            r4.zzc = r2
        L35:
            com.google.android.gms.internal.ads.zzakj r0 = r4.zzb
            int r5 = r0.zze(r5, r6)
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ com.google.android.gms.internal.ads.zzadb zzc() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ java.util.List zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(com.google.android.gms.internal.ads.zzade r1) {
            r0 = this;
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r2, long r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzakj r0 = r1.zzb
            if (r0 == 0) goto L7
            r0.zzj(r2, r4)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r1) throws java.io.IOException {
            r0 = this;
            boolean r1 = r0.zza(r1)     // Catch: com.google.android.gms.internal.ads.zzbo -> L5
            return r1
        L5:
            r1 = 0
            return r1
    }
}
