package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzc {
    final com.google.android.gms.internal.measurement.zzf zza;
    com.google.android.gms.internal.measurement.zzg zzb;
    final com.google.android.gms.internal.measurement.zzab zzc;
    private final com.google.android.gms.internal.measurement.zzz zzd;

    public zzc() {
            r4 = this;
            com.google.android.gms.internal.measurement.zzf r0 = new com.google.android.gms.internal.measurement.zzf
            r0.<init>()
            r4.<init>()
            r4.zza = r0
            com.google.android.gms.internal.measurement.zzg r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzg r1 = r1.zza()
            r4.zzb = r1
            com.google.android.gms.internal.measurement.zzab r1 = new com.google.android.gms.internal.measurement.zzab
            r1.<init>()
            r4.zzc = r1
            com.google.android.gms.internal.measurement.zzz r1 = new com.google.android.gms.internal.measurement.zzz
            r1.<init>()
            r4.zzd = r1
            com.google.android.gms.internal.measurement.zza r1 = new com.google.android.gms.internal.measurement.zza
            r1.<init>(r4)
            com.google.android.gms.internal.measurement.zzj r2 = r0.zzd
            java.lang.String r3 = "internal.registerCallback"
            r2.zza(r3, r1)
            com.google.android.gms.internal.measurement.zzb r1 = new com.google.android.gms.internal.measurement.zzb
            r1.<init>(r4)
            com.google.android.gms.internal.measurement.zzj r0 = r0.zzd
            java.lang.String r2 = "internal.eventLogger"
            r0.zza(r2, r1)
            return
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.zzai zzb(com.google.android.gms.internal.measurement.zzc r1) {
            com.google.android.gms.internal.measurement.zzv r0 = new com.google.android.gms.internal.measurement.zzv
            com.google.android.gms.internal.measurement.zzz r1 = r1.zzd
            r0.<init>(r1)
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzab zza() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzab r0 = r1.zzc
            return r0
    }

    public final void zzc(com.google.android.gms.internal.measurement.zziv r8) throws com.google.android.gms.internal.measurement.zzd {
            r7 = this;
            com.google.android.gms.internal.measurement.zzf r0 = r7.zza     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.internal.measurement.zzg r1 = r0.zzb     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.internal.measurement.zzg r1 = r1.zza()     // Catch: java.lang.Throwable -> Lb1
            r7.zzb = r1     // Catch: java.lang.Throwable -> Lb1
            java.util.List r1 = r8.zzc()     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.internal.measurement.zzg r2 = r7.zzb     // Catch: java.lang.Throwable -> Lb1
            r3 = 0
            com.google.android.gms.internal.measurement.zziz[] r4 = new com.google.android.gms.internal.measurement.zziz[r3]     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object[] r1 = r1.toArray(r4)     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.internal.measurement.zziz[] r1 = (com.google.android.gms.internal.measurement.zziz[]) r1     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.internal.measurement.zzap r1 = r0.zza(r2, r1)     // Catch: java.lang.Throwable -> Lb1
            boolean r1 = r1 instanceof com.google.android.gms.internal.measurement.zzag     // Catch: java.lang.Throwable -> Lb1
            if (r1 != 0) goto La9
            com.google.android.gms.internal.measurement.zzir r8 = r8.zza()     // Catch: java.lang.Throwable -> Lb1
            java.util.List r8 = r8.zzd()     // Catch: java.lang.Throwable -> Lb1
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lb1
        L2d:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Lb1
            if (r1 == 0) goto La8
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.internal.measurement.zzit r1 = (com.google.android.gms.internal.measurement.zzit) r1     // Catch: java.lang.Throwable -> Lb1
            java.util.List r2 = r1.zzc()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = r1.zzb()     // Catch: java.lang.Throwable -> Lb1
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lb1
        L45:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb1
            if (r4 == 0) goto L2d
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.internal.measurement.zziz r4 = (com.google.android.gms.internal.measurement.zziz) r4     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.internal.measurement.zzg r5 = r7.zzb     // Catch: java.lang.Throwable -> Lb1
            r6 = 1
            com.google.android.gms.internal.measurement.zziz[] r6 = new com.google.android.gms.internal.measurement.zziz[r6]     // Catch: java.lang.Throwable -> Lb1
            r6[r3] = r4     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.internal.measurement.zzap r4 = r0.zza(r5, r6)     // Catch: java.lang.Throwable -> Lb1
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzam     // Catch: java.lang.Throwable -> Lb1
            if (r5 == 0) goto La0
            com.google.android.gms.internal.measurement.zzg r5 = r7.zzb     // Catch: java.lang.Throwable -> Lb1
            boolean r6 = r5.zzh(r1)     // Catch: java.lang.Throwable -> Lb1
            if (r6 != 0) goto L6a
            r5 = 0
            goto L74
        L6a:
            com.google.android.gms.internal.measurement.zzap r5 = r5.zzd(r1)     // Catch: java.lang.Throwable -> Lb1
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzai     // Catch: java.lang.Throwable -> Lb1
            if (r6 == 0) goto L90
            com.google.android.gms.internal.measurement.zzai r5 = (com.google.android.gms.internal.measurement.zzai) r5     // Catch: java.lang.Throwable -> Lb1
        L74:
            if (r5 == 0) goto L80
            com.google.android.gms.internal.measurement.zzg r6 = r7.zzb     // Catch: java.lang.Throwable -> Lb1
            java.util.List r4 = java.util.Collections.singletonList(r4)     // Catch: java.lang.Throwable -> Lb1
            r5.zza(r6, r4)     // Catch: java.lang.Throwable -> Lb1
            goto L45
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = "Rule function is undefined: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> Lb1
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lb1
            throw r8     // Catch: java.lang.Throwable -> Lb1
        L90:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = "Invalid function name: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> Lb1
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lb1
            throw r8     // Catch: java.lang.Throwable -> Lb1
        La0:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = "Invalid rule definition"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lb1
            throw r8     // Catch: java.lang.Throwable -> Lb1
        La8:
            return
        La9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = "Program loading failed"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lb1
            throw r8     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r8 = move-exception
            com.google.android.gms.internal.measurement.zzd r0 = new com.google.android.gms.internal.measurement.zzd
            r0.<init>(r8)
            throw r0
    }

    public final void zzd(java.lang.String r2, java.util.concurrent.Callable r3) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzf r0 = r1.zza
            com.google.android.gms.internal.measurement.zzj r0 = r0.zzd
            r0.zza(r2, r3)
            return
    }

    public final boolean zze(com.google.android.gms.internal.measurement.zzaa r6) throws com.google.android.gms.internal.measurement.zzd {
            r5 = this;
            com.google.android.gms.internal.measurement.zzab r0 = r5.zzc     // Catch: java.lang.Throwable -> L35
            r0.zzd(r6)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.measurement.zzf r6 = r5.zza     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.measurement.zzg r6 = r6.zzc     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "runtime.counter"
            com.google.android.gms.internal.measurement.zzah r2 = new com.google.android.gms.internal.measurement.zzah     // Catch: java.lang.Throwable -> L35
            r3 = 0
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Throwable -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L35
            r6.zzg(r1, r2)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.measurement.zzz r6 = r5.zzd     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.measurement.zzg r1 = r5.zzb     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.measurement.zzg r1 = r1.zza()     // Catch: java.lang.Throwable -> L35
            r6.zzb(r1, r0)     // Catch: java.lang.Throwable -> L35
            boolean r6 = r5.zzg()     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto L33
            boolean r6 = r5.zzf()     // Catch: java.lang.Throwable -> L35
            if (r6 == 0) goto L31
            goto L33
        L31:
            r6 = 0
            return r6
        L33:
            r6 = 1
            return r6
        L35:
            r6 = move-exception
            com.google.android.gms.internal.measurement.zzd r0 = new com.google.android.gms.internal.measurement.zzd
            r0.<init>(r6)
            throw r0
    }

    public final boolean zzf() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzab r0 = r1.zzc
            java.util.List r0 = r0.zzc()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final boolean zzg() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzab r0 = r2.zzc
            com.google.android.gms.internal.measurement.zzaa r1 = r0.zzb()
            com.google.android.gms.internal.measurement.zzaa r0 = r0.zza()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }
}
