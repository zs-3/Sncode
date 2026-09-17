package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzghk {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzgot zzb;
    private boolean zzc;

    public zzghk() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zza = r0
            com.google.android.gms.internal.ads.zzgot r0 = com.google.android.gms.internal.ads.zzgot.zza
            r1.zzb = r0
            r0 = 0
            r1.zzc = r0
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzghk r0) {
            r0.zzd()
            return
    }

    private final void zzd() {
            r3 = this;
            java.util.List r0 = r3.zza
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzghi r1 = (com.google.android.gms.internal.ads.zzghi) r1
            r2 = 0
            com.google.android.gms.internal.ads.zzghi.zzi(r1, r2)
            goto L6
        L17:
            return
    }

    public final com.google.android.gms.internal.ads.zzghk zza(com.google.android.gms.internal.ads.zzghi r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzghk r0 = com.google.android.gms.internal.ads.zzghi.zzf(r2)
            if (r0 != 0) goto L18
            boolean r0 = com.google.android.gms.internal.ads.zzghi.zzj(r2)
            if (r0 == 0) goto Lf
            r1.zzd()
        Lf:
            com.google.android.gms.internal.ads.zzghi.zzh(r2, r1)
            java.util.List r0 = r1.zza
            r0.add(r2)
            return r1
        L18:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Entry has already been added to a KeysetHandle.Builder"
            r2.<init>(r0)
            throw r2
    }

    public final com.google.android.gms.internal.ads.zzgho zzb() throws java.security.GeneralSecurityException {
            r23 = this;
            r0 = r23
            boolean r1 = r0.zzc
            if (r1 != 0) goto L1ed
            r1 = 1
            r0.zzc = r1
            java.util.List r2 = r0.zza
            com.google.android.gms.internal.ads.zzgwk r3 = com.google.android.gms.internal.ads.zzgwn.zzd()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r2 = r2.size()
            r4.<init>(r2)
            java.util.List r2 = r0.zza
            r5 = 0
            r6 = 0
        L1c:
            int r7 = r2.size()
            int r7 = r7 + (-1)
            if (r6 >= r7) goto L51
            int r7 = r6 + 1
            java.lang.Object r6 = r2.get(r6)
            com.google.android.gms.internal.ads.zzghi r6 = (com.google.android.gms.internal.ads.zzghi) r6
            com.google.android.gms.internal.ads.zzghj r6 = com.google.android.gms.internal.ads.zzghi.zze(r6)
            com.google.android.gms.internal.ads.zzghj r8 = com.google.android.gms.internal.ads.zzghj.zza()
            if (r6 != r8) goto L4f
            java.lang.Object r6 = r2.get(r7)
            com.google.android.gms.internal.ads.zzghi r6 = (com.google.android.gms.internal.ads.zzghi) r6
            com.google.android.gms.internal.ads.zzghj r6 = com.google.android.gms.internal.ads.zzghi.zze(r6)
            com.google.android.gms.internal.ads.zzghj r8 = com.google.android.gms.internal.ads.zzghj.zza()
            if (r6 != r8) goto L47
            goto L4f
        L47:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'."
            r1.<init>(r2)
            throw r1
        L4f:
            r6 = r7
            goto L1c
        L51:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r6 = r0.zza
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
        L5d:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L1ca
            java.lang.Object r9 = r6.next()
            com.google.android.gms.internal.ads.zzghi r9 = (com.google.android.gms.internal.ads.zzghi) r9
            com.google.android.gms.internal.ads.zzghi.zzb(r9)
            com.google.android.gms.internal.ads.zzghj r10 = com.google.android.gms.internal.ads.zzghi.zze(r9)
            if (r10 == 0) goto L1c2
            com.google.android.gms.internal.ads.zzghj r10 = com.google.android.gms.internal.ads.zzghi.zze(r9)
            com.google.android.gms.internal.ads.zzghj r11 = com.google.android.gms.internal.ads.zzghj.zza()
            r12 = 3
            r13 = 4
            if (r10 != r11) goto Lb9
            r10 = 0
        L7f:
            if (r10 == 0) goto L8b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            boolean r11 = r2.contains(r11)
            if (r11 == 0) goto Lbd
        L8b:
            java.security.SecureRandom r10 = new java.security.SecureRandom
            r10.<init>()
            byte[] r11 = new byte[r13]
            r14 = 0
        L93:
            if (r14 != 0) goto Lb7
            r10.nextBytes(r11)
            r14 = r11[r5]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = r11[r1]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r16 = 2
            r5 = r11[r16]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r13 = r11[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 24
            int r15 = r15 << 16
            r14 = r14 | r15
            int r5 = r5 << 8
            r5 = r5 | r14
            r14 = r5 | r13
            r5 = 0
            r13 = 4
            goto L93
        Lb7:
            r10 = r14
            goto L7f
        Lb9:
            com.google.android.gms.internal.ads.zzghi.zze(r9)
            r10 = 0
        Lbd:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            boolean r11 = r2.contains(r5)
            if (r11 != 0) goto L1a6
            r2.add(r5)
            com.google.android.gms.internal.ads.zzghi.zza(r9)
            com.google.android.gms.internal.ads.zzghs r11 = com.google.android.gms.internal.ads.zzghi.zzg(r9)
            boolean r11 = r11.zza()
            if (r1 == r11) goto Ld9
            r11 = 0
            goto Lda
        Ld9:
            r11 = r5
        Lda:
            com.google.android.gms.internal.ads.zzgpg r13 = com.google.android.gms.internal.ads.zzgpg.zzb()
            com.google.android.gms.internal.ads.zzghs r14 = com.google.android.gms.internal.ads.zzghi.zzg(r9)
            com.google.android.gms.internal.ads.zzghd r11 = r13.zza(r14, r11)
            com.google.android.gms.internal.ads.zzghm r13 = new com.google.android.gms.internal.ads.zzghm
            com.google.android.gms.internal.ads.zzghf r19 = com.google.android.gms.internal.ads.zzghi.zzb(r9)
            boolean r21 = com.google.android.gms.internal.ads.zzghi.zzj(r9)
            r22 = 0
            r17 = r13
            r18 = r11
            r20 = r10
            r17.<init>(r18, r19, r20, r21, r22)
            com.google.android.gms.internal.ads.zzghf r14 = com.google.android.gms.internal.ads.zzghi.zzb(r9)
            com.google.android.gms.internal.ads.zzgpq r15 = com.google.android.gms.internal.ads.zzgpq.zzc()
            java.lang.Class<com.google.android.gms.internal.ads.zzgqr> r1 = com.google.android.gms.internal.ads.zzgqr.class
            com.google.android.gms.internal.ads.zzghw r12 = com.google.android.gms.internal.ads.zzghw.zza()
            com.google.android.gms.internal.ads.zzgqw r1 = r15.zzd(r11, r1, r12)
            com.google.android.gms.internal.ads.zzgqr r1 = (com.google.android.gms.internal.ads.zzgqr) r1
            java.lang.Integer r11 = r1.zzf()
            if (r11 == 0) goto L124
            int r11 = r11.intValue()
            if (r11 != r10) goto L11c
            goto L124
        L11c:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Wrong ID set for key with ID requirement"
            r1.<init>(r2)
            throw r1
        L124:
            com.google.android.gms.internal.ads.zzghf r11 = com.google.android.gms.internal.ads.zzghf.zza
            boolean r12 = r11.equals(r14)
            if (r12 == 0) goto L12e
            r12 = 3
            goto L141
        L12e:
            com.google.android.gms.internal.ads.zzghf r12 = com.google.android.gms.internal.ads.zzghf.zzb
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L138
            r12 = 4
            goto L141
        L138:
            com.google.android.gms.internal.ads.zzghf r12 = com.google.android.gms.internal.ads.zzghf.zzc
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L19e
            r12 = 5
        L141:
            com.google.android.gms.internal.ads.zzgwl r14 = com.google.android.gms.internal.ads.zzgwm.zzd()
            com.google.android.gms.internal.ads.zzgvz r15 = com.google.android.gms.internal.ads.zzgwb.zza()
            java.lang.String r7 = r1.zzg()
            r15.zzb(r7)
            com.google.android.gms.internal.ads.zzgzs r7 = r1.zze()
            r15.zzc(r7)
            com.google.android.gms.internal.ads.zzgwa r7 = r1.zzb()
            r15.zza(r7)
            r14.zza(r15)
            r14.zzd(r12)
            r14.zzb(r10)
            com.google.android.gms.internal.ads.zzgxf r1 = r1.zzc()
            r14.zzc(r1)
            com.google.android.gms.internal.ads.zzhbe r1 = r14.zzbn()
            com.google.android.gms.internal.ads.zzgwm r1 = (com.google.android.gms.internal.ads.zzgwm) r1
            r3.zza(r1)
            boolean r1 = com.google.android.gms.internal.ads.zzghi.zzj(r9)
            if (r1 == 0) goto L197
            if (r8 != 0) goto L18f
            com.google.android.gms.internal.ads.zzghf r1 = com.google.android.gms.internal.ads.zzghi.zzb(r9)
            if (r1 != r11) goto L187
            r8 = r5
            goto L197
        L187:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Primary key is not enabled"
            r1.<init>(r2)
            throw r1
        L18f:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Two primaries were set"
            r1.<init>(r2)
            throw r1
        L197:
            r4.add(r13)
            r1 = 1
            r5 = 0
            goto L5d
        L19e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unknown key status"
            r1.<init>(r2)
            throw r1
        L1a6:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Id "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = " is used twice in the keyset"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1c2:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "No ID was set (with withFixedId or withRandomId)"
            r1.<init>(r2)
            throw r1
        L1ca:
            if (r8 == 0) goto L1e5
            int r1 = r8.intValue()
            r3.zzb(r1)
            com.google.android.gms.internal.ads.zzhbe r1 = r3.zzbn()
            com.google.android.gms.internal.ads.zzgwn r1 = (com.google.android.gms.internal.ads.zzgwn) r1
            com.google.android.gms.internal.ads.zzgho.zze(r1)
            com.google.android.gms.internal.ads.zzgot r2 = r0.zzb
            com.google.android.gms.internal.ads.zzgho r3 = new com.google.android.gms.internal.ads.zzgho
            r5 = 0
            r3.<init>(r1, r4, r2, r5)
            return r3
        L1e5:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "No primary was set"
            r1.<init>(r2)
            throw r1
        L1ed:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "KeysetHandle.Builder#build must only be called once"
            r1.<init>(r2)
            throw r1
    }
}
