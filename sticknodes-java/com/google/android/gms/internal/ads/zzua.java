package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzua implements com.google.android.gms.internal.ads.zzvo {
    private final com.google.android.gms.internal.ads.zzadg zza;
    private com.google.android.gms.internal.ads.zzadb zzb;
    private com.google.android.gms.internal.ads.zzadc zzc;

    public zzua(com.google.android.gms.internal.ads.zzadg r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final int zza(com.google.android.gms.internal.ads.zzadx r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.ads.zzadb r0 = r2.zzb
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzadc r1 = r2.zzc
            java.util.Objects.requireNonNull(r1)
            int r3 = r0.zzb(r1, r3)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final long zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzadc r0 = r2.zzc
            if (r0 == 0) goto L9
            long r0 = r0.zzf()
            return r0
        L9:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzadb r0 = r2.zzb
            if (r0 != 0) goto L5
            goto Le
        L5:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzaig
            if (r1 == 0) goto Le
            com.google.android.gms.internal.ads.zzaig r0 = (com.google.android.gms.internal.ads.zzaig) r0
            r0.zza()
        Le:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void zzd(com.google.android.gms.internal.ads.zzp r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzade r15) throws java.io.IOException {
            r7 = this;
            com.google.android.gms.internal.ads.zzacq r6 = new com.google.android.gms.internal.ads.zzacq
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzadb r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzadg r8 = r7.zza
            com.google.android.gms.internal.ads.zzadb[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            com.google.android.gms.internal.ads.zzgau r13 = com.google.android.gms.internal.ads.zzgax.zzi(r10)
            r14 = 0
            r0 = 1
            if (r10 != r0) goto L24
            r8 = r8[r14]
            r7.zzb = r8
            goto L7f
        L24:
            r1 = 0
        L25:
            if (r1 >= r10) goto L7b
            r2 = r8[r1]
            boolean r3 = r2.zzi(r6)     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            if (r3 == 0) goto L38
            r7.zzb = r2     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r6.zzj()
            goto L7b
        L38:
            java.util.List r2 = r2.zzd()     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            r13.zzh(r2)     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            com.google.android.gms.internal.ads.zzadb r2 = r7.zzb
            if (r2 != 0) goto L71
            long r2 = r6.zzf()
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 != 0) goto L6f
            goto L71
        L4c:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzadb r9 = r7.zzb
            if (r9 != 0) goto L59
            long r9 = r6.zzf()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L5a
        L59:
            r14 = 1
        L5a:
            com.google.android.gms.internal.ads.zzdi.zzf(r14)
            r6.zzj()
            throw r8
        L61:
            com.google.android.gms.internal.ads.zzadb r2 = r7.zzb
            if (r2 != 0) goto L71
            long r2 = r6.zzf()
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 != 0) goto L6f
            goto L71
        L6f:
            r2 = 0
            goto L72
        L71:
            r2 = 1
        L72:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            r6.zzj()
            int r1 = r1 + 1
            goto L25
        L7b:
            com.google.android.gms.internal.ads.zzadb r10 = r7.zzb
            if (r10 == 0) goto L85
        L7f:
            com.google.android.gms.internal.ads.zzadb r8 = r7.zzb
            r8.zze(r15)
            return
        L85:
            com.google.android.gms.internal.ads.zzwz r10 = new com.google.android.gms.internal.ads.zzwz
            com.google.android.gms.internal.ads.zzgax r8 = com.google.android.gms.internal.ads.zzgax.zzm(r8)
            com.google.android.gms.internal.ads.zztz r11 = new com.google.android.gms.internal.ads.zztz
            r11.<init>()
            java.util.List r8 = com.google.android.gms.internal.ads.zzgbn.zzb(r8, r11)
            java.util.Iterator r8 = r8.iterator()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = ", "
            com.google.android.gms.internal.ads.zzfxr.zzc(r11, r8, r12)
            java.lang.String r8 = r11.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            com.google.android.gms.internal.ads.zzgax r11 = r13.zzi()
            r10.<init>(r8, r9, r11)
            throw r10
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void zze() {
            r2 = this;
            com.google.android.gms.internal.ads.zzadb r0 = r2.zzb
            r1 = 0
            if (r0 == 0) goto L7
            r2.zzb = r1
        L7:
            r2.zzc = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void zzf(long r2, long r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzadb r0 = r1.zzb
            java.util.Objects.requireNonNull(r0)
            r0.zzf(r2, r4)
            return
    }
}
