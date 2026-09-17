package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
class zzfut {
    static final java.lang.String zza = null;
    final com.google.android.gms.internal.ads.zzfus zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;

    static {
            java.util.UUID r0 = new java.util.UUID
            r1 = 0
            r0.<init>(r1, r1)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzfut.zza = r0
            return
    }

    zzfut(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.ads.zzfus r1 = com.google.android.gms.internal.ads.zzfus.zzb(r1)
            r0.zzb = r1
            r0.zzc = r2
            java.lang.String r1 = "_3p"
            java.lang.String r2 = r2.concat(r1)
            r0.zzd = r2
            r0.zze = r3
            java.lang.String r1 = r3.concat(r1)
            r0.zzf = r1
            r0.zzg = r4
            return
    }

    private final java.lang.String zzh(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            if (r5 == 0) goto L26
            if (r6 != 0) goto L5
            goto L26
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r5)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r4.getBytes(r5)
            java.util.UUID r4 = java.util.UUID.nameUUIDFromBytes(r4)
            java.lang.String r4 = r4.toString()
            return r4
        L26:
            java.lang.String r4 = r3.zzg
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is "
            r1.append(r4)
            java.lang.String r4 = "null"
            java.lang.String r2 = "not null"
            if (r5 != 0) goto L3f
            r5 = r4
            goto L40
        L3f:
            r5 = r2
        L40:
            r1.append(r5)
            java.lang.String r5 = ", hashKey is "
            r1.append(r5)
            if (r6 != 0) goto L4b
            goto L4c
        L4b:
            r4 = r2
        L4c:
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    final long zza(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L5
            java.lang.String r4 = r3.zzf
            goto L7
        L5:
            java.lang.String r4 = r3.zze
        L7:
            com.google.android.gms.internal.ads.zzfus r0 = r3.zzb
            r1 = -1
            long r0 = r0.zza(r4, r1)
            return r0
    }

    final com.google.android.gms.internal.ads.zzfur zzb(java.lang.String r9, java.lang.String r10, long r11, boolean r13) throws java.io.IOException {
            r8 = this;
            r0 = 1
            if (r9 == 0) goto L36
            java.util.UUID.fromString(r9)     // Catch: java.lang.IllegalArgumentException -> L30
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfut.zza
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto Lf
            goto L30
        Lf:
            java.lang.String r1 = r8.zze(r0)
            com.google.android.gms.internal.ads.zzfus r2 = r8.zzb
            r3 = 0
            java.lang.String r4 = "paid_3p_hash_key"
            java.lang.String r2 = r2.zzc(r4, r3)
            if (r1 == 0) goto L36
            if (r2 == 0) goto L36
            java.lang.String r2 = r8.zzh(r9, r10, r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2b
            goto L36
        L2b:
            com.google.android.gms.internal.ads.zzfur r9 = r8.zzc(r9, r10)
            return r9
        L30:
            com.google.android.gms.internal.ads.zzfur r9 = new com.google.android.gms.internal.ads.zzfur
            r9.<init>()
            return r9
        L36:
            if (r9 == 0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L89
            long r3 = r8.zza(r0)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L4f
            goto L6e
        L4f:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L64
            com.google.android.gms.internal.ads.zzfus r11 = r8.zzb
            if (r0 == 0) goto L5a
            java.lang.String r12 = r8.zzf
            goto L5c
        L5a:
            java.lang.String r12 = r8.zze
        L5c:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r11.zzd(r12, r1)
            goto L6e
        L64:
            long r3 = r3 + r11
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 < 0) goto L6e
            com.google.android.gms.internal.ads.zzfur r9 = r8.zzc(r9, r10)
            return r9
        L6e:
            java.lang.String r11 = r8.zze(r0)
            if (r11 != 0) goto L7b
            if (r13 != 0) goto L7b
            com.google.android.gms.internal.ads.zzfur r9 = r8.zzc(r9, r10)
            return r9
        L7b:
            com.google.android.gms.internal.ads.zzfur r9 = new com.google.android.gms.internal.ads.zzfur
            long r12 = r8.zza(r0)
            java.time.Instant r10 = java.time.Instant.ofEpochMilli(r12)
            r9.<init>(r11, r10)
            return r9
        L89:
            java.lang.String r9 = r8.zzg
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = ": Invalid negative current timestamp. Updating PAID failed"
            java.lang.String r9 = r9.concat(r11)
            r10.<init>(r9)
            throw r10
    }

    final com.google.android.gms.internal.ads.zzfur zzc(java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r3 = this;
            if (r4 != 0) goto L10
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            r5 = 0
            com.google.android.gms.internal.ads.zzfur r4 = r3.zzd(r4, r5)
            return r4
        L10:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzfus r1 = r3.zzb
            java.lang.String r2 = "paid_3p_hash_key"
            r1.zzd(r2, r0)
            java.lang.String r4 = r3.zzh(r4, r5, r0)
            r5 = 1
            com.google.android.gms.internal.ads.zzfur r4 = r3.zzd(r4, r5)
            return r4
    }

    final com.google.android.gms.internal.ads.zzfur zzd(java.lang.String r6, boolean r7) throws java.io.IOException {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L30
            com.google.android.gms.internal.ads.zzfus r2 = r5.zzb
            if (r7 == 0) goto L11
            java.lang.String r3 = r5.zzf
            goto L13
        L11:
            java.lang.String r3 = r5.zze
        L13:
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r2.zzd(r3, r4)
            com.google.android.gms.internal.ads.zzfus r2 = r5.zzb
            if (r7 == 0) goto L21
            java.lang.String r7 = r5.zzd
            goto L23
        L21:
            java.lang.String r7 = r5.zzc
        L23:
            r2.zzd(r7, r6)
            com.google.android.gms.internal.ads.zzfur r7 = new com.google.android.gms.internal.ads.zzfur
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            r7.<init>(r6, r0)
            return r7
        L30:
            java.lang.String r6 = r5.zzg
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = ": Invalid negative current timestamp. Updating PAID failed"
            java.lang.String r6 = r6.concat(r0)
            r7.<init>(r6)
            throw r7
    }

    final java.lang.String zze(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L5
            java.lang.String r3 = r2.zzd
            goto L7
        L5:
            java.lang.String r3 = r2.zzc
        L7:
            com.google.android.gms.internal.ads.zzfus r0 = r2.zzb
            r1 = 0
            java.lang.String r3 = r0.zzc(r3, r1)
            return r3
    }

    final void zzf(boolean r3) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto L5
            java.lang.String r0 = r2.zzf
            goto L7
        L5:
            java.lang.String r0 = r2.zze
        L7:
            com.google.android.gms.internal.ads.zzfus r1 = r2.zzb
            r1.zze(r0)
            com.google.android.gms.internal.ads.zzfus r0 = r2.zzb
            if (r3 == 0) goto L13
            java.lang.String r3 = r2.zzd
            goto L15
        L13:
            java.lang.String r3 = r2.zzc
        L15:
            r0.zze(r3)
            return
    }

    final boolean zzg(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfus r2 = r1.zzb
            java.lang.String r0 = r1.zzc
            boolean r2 = r2.zzg(r0)
            return r2
    }
}
