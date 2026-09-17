package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzvl implements com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzuv {
    private final com.google.android.gms.internal.ads.zzuw[] zza;
    private final java.util.IdentityHashMap zzb;
    private final java.util.ArrayList zzc;
    private final java.util.HashMap zzd;
    private com.google.android.gms.internal.ads.zzuv zze;
    private com.google.android.gms.internal.ads.zzwy zzf;
    private com.google.android.gms.internal.ads.zzuw[] zzg;
    private com.google.android.gms.internal.ads.zzwp zzh;

    public zzvl(com.google.android.gms.internal.ads.zzuj r6, long[] r7, com.google.android.gms.internal.ads.zzuw... r8) {
            r5 = this;
            r5.<init>()
            r5.zza = r8
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.zzc = r6
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r5.zzd = r6
            com.google.android.gms.internal.ads.zzui r6 = new com.google.android.gms.internal.ads.zzui
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzn()
            r6.<init>(r0, r1)
            r5.zzh = r6
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap
            r6.<init>()
            r5.zzb = r6
            r6 = 0
            com.google.android.gms.internal.ads.zzuw[] r0 = new com.google.android.gms.internal.ads.zzuw[r6]
            r5.zzg = r0
        L2e:
            int r0 = r8.length
            if (r6 >= r0) goto L47
            r0 = r7[r6]
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L44
            com.google.android.gms.internal.ads.zzuw[] r2 = r5.zza
            com.google.android.gms.internal.ads.zzwv r3 = new com.google.android.gms.internal.ads.zzwv
            r4 = r8[r6]
            r3.<init>(r4, r0)
            r2[r6] = r3
        L44:
            int r6 = r6 + 1
            goto L2e
        L47:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zza(long r4, com.google.android.gms.internal.ads.zzlw r6) {
            r3 = this;
            com.google.android.gms.internal.ads.zzuw[] r0 = r3.zzg
            int r1 = r0.length
            r2 = 0
            if (r1 <= 0) goto L9
            r0 = r0[r2]
            goto Ld
        L9:
            com.google.android.gms.internal.ads.zzuw[] r0 = r3.zza
            r0 = r0[r2]
        Ld:
            long r4 = r0.zza(r4, r6)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzwp r0 = r2.zzh
            long r0 = r0.zzb()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzwp r0 = r2.zzh
            long r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzd() {
            r17 = this;
            r0 = r17
            com.google.android.gms.internal.ads.zzuw[] r1 = r0.zzg
            int r2 = r1.length
            r3 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r4
            r6 = 0
        Ld:
            if (r6 >= r2) goto L60
            r9 = r1[r6]
            long r10 = r9.zzd()
            java.lang.String r12 = "Unexpected child seekToUs result."
            int r13 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r13 == 0) goto L4a
            int r13 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r13 != 0) goto L3d
            com.google.android.gms.internal.ads.zzuw[] r7 = r0.zzg
            int r8 = r7.length
            r13 = 0
        L23:
            if (r13 >= r8) goto L3b
            r14 = r7[r13]
            if (r14 != r9) goto L2a
            goto L3b
        L2a:
            long r14 = r14.zze(r10)
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 != 0) goto L35
            int r13 = r13 + 1
            goto L23
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r12)
            throw r1
        L3b:
            r7 = r10
            goto L5d
        L3d:
            int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r9 != 0) goto L42
            goto L5d
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Conflicting discontinuities."
            r1.<init>(r2)
            throw r1
        L4a:
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 == 0) goto L5d
            long r9 = r9.zze(r7)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 != 0) goto L57
            goto L5d
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r12)
            throw r1
        L5d:
            int r6 = r6 + 1
            goto Ld
        L60:
            return r7
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zze(long r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzuw[] r0 = r4.zzg
            r1 = 0
            r0 = r0[r1]
            long r5 = r0.zze(r5)
            r0 = 1
        La:
            com.google.android.gms.internal.ads.zzuw[] r1 = r4.zzg
            int r2 = r1.length
            if (r0 >= r2) goto L24
            r1 = r1[r0]
            long r1 = r1.zze(r5)
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L1c
            int r0 = r0 + 1
            goto La
        L1c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Unexpected child seekToUs result."
            r5.<init>(r6)
            throw r5
        L24:
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzwo
    public final /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzwp r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzuw r1 = (com.google.android.gms.internal.ads.zzuw) r1
            com.google.android.gms.internal.ads.zzuv r1 = r0.zze
            java.util.Objects.requireNonNull(r1)
            r1.zzf(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzg(com.google.android.gms.internal.ads.zzyl[] r22, boolean[] r23, com.google.android.gms.internal.ads.zzwn[] r24, boolean[] r25, long r26) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            int r3 = r1.length
            int[] r4 = new int[r3]
            int[] r3 = new int[r3]
            r5 = 0
            r6 = 0
        Ld:
            int r7 = r1.length
            r8 = 0
            if (r6 >= r7) goto L4a
            r7 = r2[r6]
            if (r7 != 0) goto L16
            goto L1f
        L16:
            java.util.IdentityHashMap r8 = r0.zzb
            java.lang.Object r7 = r8.get(r7)
            r8 = r7
            java.lang.Integer r8 = (java.lang.Integer) r8
        L1f:
            r7 = -1
            if (r8 != 0) goto L24
            r8 = -1
            goto L28
        L24:
            int r8 = r8.intValue()
        L28:
            r4[r6] = r8
            r8 = r1[r6]
            if (r8 == 0) goto L45
            com.google.android.gms.internal.ads.zzcd r7 = r8.zze()
            java.lang.String r7 = r7.zzb
            java.lang.String r8 = ":"
            int r8 = r7.indexOf(r8)
            java.lang.String r7 = r7.substring(r5, r8)
            int r7 = java.lang.Integer.parseInt(r7)
            r3[r6] = r7
            goto L47
        L45:
            r3[r6] = r7
        L47:
            int r6 = r6 + 1
            goto Ld
        L4a:
            java.util.IdentityHashMap r6 = r0.zzb
            r6.clear()
            com.google.android.gms.internal.ads.zzuw[] r6 = r0.zza
            com.google.android.gms.internal.ads.zzwn[] r9 = new com.google.android.gms.internal.ads.zzwn[r7]
            com.google.android.gms.internal.ads.zzwn[] r15 = new com.google.android.gms.internal.ads.zzwn[r7]
            com.google.android.gms.internal.ads.zzyl[] r14 = new com.google.android.gms.internal.ads.zzyl[r7]
            java.util.ArrayList r13 = new java.util.ArrayList
            int r6 = r6.length
            r13.<init>(r6)
            r17 = r26
            r6 = 0
        L60:
            com.google.android.gms.internal.ads.zzuw[] r10 = r0.zza
            int r10 = r10.length
            if (r6 >= r10) goto Lfe
            r10 = 0
        L66:
            int r11 = r1.length
            if (r10 >= r11) goto L99
            r11 = r4[r10]
            if (r11 != r6) goto L70
            r11 = r2[r10]
            goto L71
        L70:
            r11 = r8
        L71:
            r15[r10] = r11
            r11 = r3[r10]
            if (r11 != r6) goto L93
            r11 = r1[r10]
            java.util.Objects.requireNonNull(r11)
            com.google.android.gms.internal.ads.zzcd r12 = r11.zze()
            java.util.HashMap r5 = r0.zzd
            java.lang.Object r5 = r5.get(r12)
            com.google.android.gms.internal.ads.zzcd r5 = (com.google.android.gms.internal.ads.zzcd) r5
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.ads.zzvk r12 = new com.google.android.gms.internal.ads.zzvk
            r12.<init>(r11, r5)
            r14[r10] = r12
            goto L95
        L93:
            r14[r10] = r8
        L95:
            int r10 = r10 + 1
            r5 = 0
            goto L66
        L99:
            com.google.android.gms.internal.ads.zzuw[] r5 = r0.zza
            r10 = r5[r6]
            r11 = r14
            r12 = r23
            r5 = r13
            r13 = r15
            r19 = r14
            r14 = r25
            r20 = r15
            r15 = r17
            long r10 = r10.zzg(r11, r12, r13, r14, r15)
            if (r6 != 0) goto Lb3
            r17 = r10
            goto Lb7
        Lb3:
            int r12 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r12 != 0) goto Lf6
        Lb7:
            r10 = 0
            r11 = 0
        Lb9:
            int r12 = r1.length
            if (r10 >= r12) goto Le3
            r12 = r3[r10]
            r13 = 1
            if (r12 != r6) goto Ld3
            r11 = r20[r10]
            java.util.Objects.requireNonNull(r11)
            r9[r10] = r11
            java.util.IdentityHashMap r12 = r0.zzb
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            r12.put(r11, r14)
            r11 = 1
            goto Le0
        Ld3:
            r12 = r4[r10]
            if (r12 != r6) goto Le0
            r12 = r20[r10]
            if (r12 != 0) goto Ldc
            goto Ldd
        Ldc:
            r13 = 0
        Ldd:
            com.google.android.gms.internal.ads.zzdi.zzf(r13)
        Le0:
            int r10 = r10 + 1
            goto Lb9
        Le3:
            if (r11 == 0) goto Lec
            com.google.android.gms.internal.ads.zzuw[] r10 = r0.zza
            r10 = r10[r6]
            r5.add(r10)
        Lec:
            int r6 = r6 + 1
            r13 = r5
            r14 = r19
            r15 = r20
            r5 = 0
            goto L60
        Lf6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Children enabled at different positions."
            r1.<init>(r2)
            throw r1
        Lfe:
            r5 = r13
            r1 = 0
            java.lang.System.arraycopy(r9, r1, r2, r1, r7)
            com.google.android.gms.internal.ads.zzuw[] r1 = new com.google.android.gms.internal.ads.zzuw[r1]
            java.lang.Object[] r1 = r5.toArray(r1)
            com.google.android.gms.internal.ads.zzuw[] r1 = (com.google.android.gms.internal.ads.zzuw[]) r1
            r0.zzg = r1
            com.google.android.gms.internal.ads.zzvj r1 = new com.google.android.gms.internal.ads.zzvj
            r1.<init>()
            java.util.List r1 = com.google.android.gms.internal.ads.zzgbn.zzb(r5, r1)
            com.google.android.gms.internal.ads.zzui r2 = new com.google.android.gms.internal.ads.zzui
            r2.<init>(r5, r1)
            r0.zzh = r2
            return r17
    }

    @Override // com.google.android.gms.internal.ads.zzuv
    public final void zzh(com.google.android.gms.internal.ads.zzuw r14) {
            r13 = this;
            java.util.ArrayList r0 = r13.zzc
            r0.remove(r14)
            java.util.ArrayList r14 = r13.zzc
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto Le
            return
        Le:
            com.google.android.gms.internal.ads.zzuw[] r14 = r13.zza
            r0 = 0
            r1 = 0
            r2 = 0
        L13:
            int r3 = r14.length
            if (r1 >= r3) goto L22
            r3 = r14[r1]
            com.google.android.gms.internal.ads.zzwy r3 = r3.zzi()
            int r3 = r3.zzb
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L13
        L22:
            com.google.android.gms.internal.ads.zzcd[] r14 = new com.google.android.gms.internal.ads.zzcd[r2]
            r1 = 0
            r2 = 0
        L26:
            com.google.android.gms.internal.ads.zzuw[] r3 = r13.zza
            int r4 = r3.length
            if (r1 >= r4) goto L9a
            r3 = r3[r1]
            com.google.android.gms.internal.ads.zzwy r3 = r3.zzi()
            int r4 = r3.zzb
            r5 = 0
        L34:
            if (r5 >= r4) goto L97
            com.google.android.gms.internal.ads.zzcd r6 = r3.zzb(r5)
            int r7 = r6.zza
            com.google.android.gms.internal.ads.zzaf[] r7 = new com.google.android.gms.internal.ads.zzaf[r7]
            r8 = 0
        L3f:
            int r9 = r6.zza
            java.lang.String r10 = ":"
            if (r8 >= r9) goto L71
            com.google.android.gms.internal.ads.zzaf r9 = r6.zzb(r8)
            com.google.android.gms.internal.ads.zzad r11 = r9.zzb()
            java.lang.String r9 = r9.zza
            if (r9 != 0) goto L53
            java.lang.String r9 = ""
        L53:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r1)
            r12.append(r10)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.zzL(r9)
            com.google.android.gms.internal.ads.zzaf r9 = r11.zzaf()
            r7[r8] = r9
            int r8 = r8 + 1
            goto L3f
        L71:
            com.google.android.gms.internal.ads.zzcd r8 = new com.google.android.gms.internal.ads.zzcd
            java.lang.String r9 = r6.zzb
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r10)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r8.<init>(r9, r7)
            java.util.HashMap r7 = r13.zzd
            r7.put(r8, r6)
            int r6 = r2 + 1
            r14[r2] = r8
            int r5 = r5 + 1
            r2 = r6
            goto L34
        L97:
            int r1 = r1 + 1
            goto L26
        L9a:
            com.google.android.gms.internal.ads.zzwy r0 = new com.google.android.gms.internal.ads.zzwy
            r0.<init>(r14)
            r13.zzf = r0
            com.google.android.gms.internal.ads.zzuv r14 = r13.zze
            java.util.Objects.requireNonNull(r14)
            r14.zzh(r13)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final com.google.android.gms.internal.ads.zzwy zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzwy r0 = r1.zzf
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzj(long r5, boolean r7) {
            r4 = this;
            com.google.android.gms.internal.ads.zzuw[] r7 = r4.zzg
            int r0 = r7.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto Lf
            r3 = r7[r2]
            r3.zzj(r5, r1)
            int r2 = r2 + 1
            goto L5
        Lf:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzk() throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            com.google.android.gms.internal.ads.zzuw[] r1 = r3.zza
            int r2 = r1.length
            if (r0 >= r2) goto Le
            r1 = r1[r0]
            r1.zzk()
            int r0 = r0 + 1
            goto L1
        Le:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzl(com.google.android.gms.internal.ads.zzuv r3, long r4) {
            r2 = this;
            r2.zze = r3
            java.util.ArrayList r3 = r2.zzc
            com.google.android.gms.internal.ads.zzuw[] r0 = r2.zza
            java.util.Collections.addAll(r3, r0)
            r3 = 0
        La:
            com.google.android.gms.internal.ads.zzuw[] r0 = r2.zza
            int r1 = r0.length
            if (r3 >= r1) goto L17
            r0 = r0[r3]
            r0.zzl(r2, r4)
            int r3 = r3 + 1
            goto La
        L17:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final void zzm(long r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzwp r0 = r1.zzh
            r0.zzm(r2)
            return
    }

    public final com.google.android.gms.internal.ads.zzuw zzn(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw[] r0 = r1.zza
            r2 = r0[r2]
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzwv
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzwv r2 = (com.google.android.gms.internal.ads.zzwv) r2
            com.google.android.gms.internal.ads.zzuw r2 = r2.zzn()
        Le:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzo(com.google.android.gms.internal.ads.zzks r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.zzc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
            java.util.ArrayList r0 = r4.zzc
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L10:
            if (r2 >= r0) goto L20
            java.util.ArrayList r3 = r4.zzc
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzuw r3 = (com.google.android.gms.internal.ads.zzuw) r3
            r3.zzo(r5)
            int r2 = r2 + 1
            goto L10
        L20:
            return r1
        L21:
            com.google.android.gms.internal.ads.zzwp r0 = r4.zzh
            boolean r5 = r0.zzo(r5)
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzp() {
            r1 = this;
            com.google.android.gms.internal.ads.zzwp r0 = r1.zzh
            boolean r0 = r0.zzp()
            return r0
    }
}
