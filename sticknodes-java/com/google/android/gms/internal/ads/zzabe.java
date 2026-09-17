package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzabe {
    private final com.google.android.gms.internal.ads.zzaaz zza;
    private final com.google.android.gms.internal.ads.zzaax zzb;
    private final com.google.android.gms.internal.ads.zzeq zzc;
    private final com.google.android.gms.internal.ads.zzeq zzd;
    private final com.google.android.gms.internal.ads.zzec zze;
    private com.google.android.gms.internal.ads.zzcp zzf;
    private com.google.android.gms.internal.ads.zzcp zzg;
    private long zzh;
    private long zzi;
    private final com.google.android.gms.internal.ads.zzzz zzj;

    public zzabe(com.google.android.gms.internal.ads.zzzz r1, com.google.android.gms.internal.ads.zzaaz r2) {
            r0 = this;
            r0.<init>()
            r0.zzj = r1
            r0.zza = r2
            com.google.android.gms.internal.ads.zzaax r1 = new com.google.android.gms.internal.ads.zzaax
            r1.<init>()
            r0.zzb = r1
            com.google.android.gms.internal.ads.zzeq r1 = new com.google.android.gms.internal.ads.zzeq
            r2 = 10
            r1.<init>(r2)
            r0.zzc = r1
            com.google.android.gms.internal.ads.zzeq r1 = new com.google.android.gms.internal.ads.zzeq
            r1.<init>(r2)
            r0.zzd = r1
            com.google.android.gms.internal.ads.zzec r1 = new com.google.android.gms.internal.ads.zzec
            r2 = 16
            r1.<init>(r2)
            r0.zze = r1
            com.google.android.gms.internal.ads.zzcp r1 = com.google.android.gms.internal.ads.zzcp.zza
            r0.zzg = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzi = r1
            return
    }

    private static java.lang.Object zzg(com.google.android.gms.internal.ads.zzeq r2) {
            int r0 = r2.zza()
            r1 = 1
            if (r0 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
        Ld:
            int r0 = r2.zza()
            if (r0 <= r1) goto L17
            r2.zzb()
            goto Ld
        L17:
            java.lang.Object r2 = r2.zzb()
            java.util.Objects.requireNonNull(r2)
            return r2
    }

    public final void zza() {
            r5 = this;
            com.google.android.gms.internal.ads.zzec r0 = r5.zze
            r0.zzc()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.zzi = r0
            com.google.android.gms.internal.ads.zzeq r0 = r5.zzd
            int r1 = r0.zza()
            if (r1 <= 0) goto L29
            java.lang.Object r0 = zzg(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            com.google.android.gms.internal.ads.zzeq r2 = r5.zzd
            r3 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.zzd(r3, r0)
        L29:
            com.google.android.gms.internal.ads.zzcp r0 = r5.zzf
            if (r0 != 0) goto L3e
            com.google.android.gms.internal.ads.zzeq r0 = r5.zzc
            int r1 = r0.zza()
            if (r1 <= 0) goto L3d
            java.lang.Object r0 = zzg(r0)
            com.google.android.gms.internal.ads.zzcp r0 = (com.google.android.gms.internal.ads.zzcp) r0
            r5.zzf = r0
        L3d:
            return
        L3e:
            com.google.android.gms.internal.ads.zzeq r0 = r5.zzc
            r0.zze()
            return
    }

    public final void zzb(long r1, long r3) {
            r0 = this;
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.google.android.gms.internal.ads.zzeq r4 = r0.zzd
            r4.zzd(r1, r3)
            return
    }

    public final void zzc(long r17, long r19) throws com.google.android.gms.internal.ads.zzij {
            r16 = this;
            r0 = r16
            com.google.android.gms.internal.ads.zzec r1 = r0.zze
            boolean r2 = r1.zzd()
            if (r2 != 0) goto L13e
            com.google.android.gms.internal.ads.zzeq r2 = r0.zzd
            long r14 = r1.zza()
            java.lang.Object r1 = r2.zzc(r14)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L2d
            long r2 = r1.longValue()
            long r4 = r0.zzh
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L2d
            long r1 = r1.longValue()
            r0.zzh = r1
            com.google.android.gms.internal.ads.zzaaz r1 = r0.zza
            r1.zzf()
        L2d:
            com.google.android.gms.internal.ads.zzaaz r3 = r0.zza
            long r10 = r0.zzh
            r12 = 0
            com.google.android.gms.internal.ads.zzaax r13 = r0.zzb
            r4 = r14
            r6 = r17
            r8 = r19
            int r1 = r3.zza(r4, r6, r8, r10, r12, r13)
            r2 = 0
            if (r1 == 0) goto L77
            r3 = 1
            if (r1 == r3) goto L77
            r3 = 2
            if (r1 == r3) goto L4e
            r3 = 3
            if (r1 == r3) goto L4e
            r3 = 4
            if (r1 == r3) goto L4e
            goto L13e
        L4e:
            r0.zzi = r14
            com.google.android.gms.internal.ads.zzec r1 = r0.zze
            r1.zzb()
            com.google.android.gms.internal.ads.zzzz r1 = r0.zzj
            com.google.android.gms.internal.ads.zzaak r3 = r1.zza
            java.util.concurrent.CopyOnWriteArraySet r3 = com.google.android.gms.internal.ads.zzaak.zzi(r3)
            java.util.Iterator r3 = r3.iterator()
        L61:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L73
            java.lang.Object r4 = r3.next()
            com.google.android.gms.internal.ads.zzaaa r4 = (com.google.android.gms.internal.ads.zzaaa) r4
            com.google.android.gms.internal.ads.zzaak r5 = r1.zza
            r4.zzb(r5)
            goto L61
        L73:
            com.google.android.gms.internal.ads.zzdi.zzb(r2)
            throw r2
        L77:
            r0.zzi = r14
            com.google.android.gms.internal.ads.zzec r1 = r0.zze
            long r3 = r1.zzb()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            long r4 = r1.longValue()
            com.google.android.gms.internal.ads.zzeq r1 = r0.zzc
            java.lang.Object r1 = r1.zzc(r4)
            com.google.android.gms.internal.ads.zzcp r1 = (com.google.android.gms.internal.ads.zzcp) r1
            if (r1 != 0) goto L92
            goto Ldf
        L92:
            com.google.android.gms.internal.ads.zzcp r3 = com.google.android.gms.internal.ads.zzcp.zza
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Ldf
            com.google.android.gms.internal.ads.zzcp r3 = r0.zzg
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Ldf
            r0.zzg = r1
            com.google.android.gms.internal.ads.zzzz r3 = r0.zzj
            com.google.android.gms.internal.ads.zzad r6 = new com.google.android.gms.internal.ads.zzad
            r6.<init>()
            int r7 = r1.zzb
            r6.zzae(r7)
            int r7 = r1.zzc
            r6.zzJ(r7)
            java.lang.String r7 = "video/raw"
            r6.zzZ(r7)
            com.google.android.gms.internal.ads.zzaf r6 = r6.zzaf()
            com.google.android.gms.internal.ads.zzaak r7 = r3.zza
            com.google.android.gms.internal.ads.zzaak.zzl(r7, r6)
            com.google.android.gms.internal.ads.zzaak r6 = r3.zza
            java.util.concurrent.CopyOnWriteArraySet r6 = com.google.android.gms.internal.ads.zzaak.zzi(r6)
            java.util.Iterator r6 = r6.iterator()
        Lcd:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Ldf
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.ads.zzaaa r7 = (com.google.android.gms.internal.ads.zzaaa) r7
            com.google.android.gms.internal.ads.zzaak r8 = r3.zza
            r7.zzc(r8, r1)
            goto Lcd
        Ldf:
            com.google.android.gms.internal.ads.zzzz r1 = r0.zzj
            com.google.android.gms.internal.ads.zzaaz r3 = r0.zza
            boolean r3 = r3.zzp()
            if (r3 == 0) goto L10b
            com.google.android.gms.internal.ads.zzaak r3 = r1.zza
            android.util.Pair r6 = com.google.android.gms.internal.ads.zzaak.zza(r3)
            if (r6 == 0) goto L10b
            java.util.concurrent.CopyOnWriteArraySet r3 = com.google.android.gms.internal.ads.zzaak.zzi(r3)
            java.util.Iterator r3 = r3.iterator()
        Lf9:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L10b
            java.lang.Object r6 = r3.next()
            com.google.android.gms.internal.ads.zzaaa r6 = (com.google.android.gms.internal.ads.zzaaa) r6
            com.google.android.gms.internal.ads.zzaak r7 = r1.zza
            r6.zza(r7)
            goto Lf9
        L10b:
            com.google.android.gms.internal.ads.zzaak r3 = r1.zza
            com.google.android.gms.internal.ads.zzaaw r6 = com.google.android.gms.internal.ads.zzaak.zzf(r3)
            if (r6 == 0) goto L13a
            com.google.android.gms.internal.ads.zzaf r6 = com.google.android.gms.internal.ads.zzaak.zzc(r3)
            if (r6 != 0) goto L123
            com.google.android.gms.internal.ads.zzad r3 = new com.google.android.gms.internal.ads.zzad
            r3.<init>()
            com.google.android.gms.internal.ads.zzaf r3 = r3.zzaf()
            goto L127
        L123:
            com.google.android.gms.internal.ads.zzaf r3 = com.google.android.gms.internal.ads.zzaak.zzc(r3)
        L127:
            r8 = r3
            com.google.android.gms.internal.ads.zzaak r1 = r1.zza
            com.google.android.gms.internal.ads.zzaaw r3 = com.google.android.gms.internal.ads.zzaak.zzf(r1)
            com.google.android.gms.internal.ads.zzdj r1 = com.google.android.gms.internal.ads.zzaak.zze(r1)
            long r6 = r1.zzc()
            r9 = 0
            r3.zza(r4, r6, r8, r9)
        L13a:
            com.google.android.gms.internal.ads.zzdi.zzb(r2)
            throw r2
        L13e:
            return
    }

    public final void zzd(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            com.google.android.gms.internal.ads.zzaaz r0 = r1.zza
            r0.zzn(r2)
            return
    }

    public final boolean zze(long r6) {
            r5 = this;
            long r0 = r5.zzi
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L11
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 < 0) goto L11
            r6 = 1
            return r6
        L11:
            r6 = 0
            return r6
    }

    public final boolean zzf(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaaz r2 = r1.zza
            r0 = 0
            boolean r2 = r2.zzo(r0)
            return r2
    }
}
