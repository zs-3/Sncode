package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public abstract class zzde extends com.google.android.gms.internal.consent_sdk.zzda implements java.util.Set {
    private transient com.google.android.gms.internal.consent_sdk.zzdd zza;

    zzde() {
            r0 = this;
            r0.<init>()
            return
    }

    static int zzf(int r6) {
            r0 = 2
            int r6 = java.lang.Math.max(r6, r0)
            r0 = 751619276(0x2ccccccc, float:5.8207657E-12)
            if (r6 >= r0) goto L20
            int r0 = r6 + (-1)
            int r0 = java.lang.Integer.highestOneBit(r0)
        L10:
            int r0 = r0 + r0
            double r1 = (double) r0
            r3 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r1 = r1 * r3
            double r3 = (double) r6
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1f
            goto L10
        L1f:
            return r0
        L20:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r6 >= r0) goto L25
            return r0
        L25:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "collection too large"
            r6.<init>(r0)
            throw r6
    }

    public static com.google.android.gms.internal.consent_sdk.zzde zzi() {
            com.google.android.gms.internal.consent_sdk.zzdh r0 = com.google.android.gms.internal.consent_sdk.zzdh.zza
            return r0
    }

    public static com.google.android.gms.internal.consent_sdk.zzde zzj(java.lang.Object r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r3 = "IABTCF_TCString"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "IABGPP_HDR_GppString"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "IABGPP_GppSID"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "IABUSPrivacy_String"
            r1[r2] = r3
            com.google.android.gms.internal.consent_sdk.zzde r0 = zzl(r0, r1)
            return r0
    }

    private static com.google.android.gms.internal.consent_sdk.zzde zzl(int r13, java.lang.Object... r14) {
            if (r13 == 0) goto L89
            r0 = 0
            r1 = 1
            if (r13 == r1) goto L7e
            int r2 = zzf(r13)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            int r7 = r2 + (-1)
            r3 = 0
            r5 = 0
            r8 = 0
        L11:
            if (r3 >= r13) goto L51
            r4 = r14[r3]
            if (r4 == 0) goto L3a
            int r9 = r4.hashCode()
            int r10 = com.google.android.gms.internal.consent_sdk.zzcz.zza(r9)
        L1f:
            r11 = r10 & r7
            r12 = r6[r11]
            if (r12 != 0) goto L2e
            int r10 = r8 + 1
            r14[r8] = r4
            r6[r11] = r4
            int r5 = r5 + r9
            r8 = r10
            goto L37
        L2e:
            boolean r11 = r12.equals(r4)
            if (r11 != 0) goto L37
            int r10 = r10 + 1
            goto L1f
        L37:
            int r3 = r3 + 1
            goto L11
        L3a:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "at index "
            r14.append(r0)
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L51:
            r3 = 0
            java.util.Arrays.fill(r14, r8, r13, r3)
            if (r8 != r1) goto L62
            r13 = r14[r0]
            java.util.Objects.requireNonNull(r13)
            com.google.android.gms.internal.consent_sdk.zzdi r14 = new com.google.android.gms.internal.consent_sdk.zzdi
            r14.<init>(r13)
            return r14
        L62:
            int r2 = r2 / 2
            int r13 = zzf(r8)
            if (r13 < r2) goto L79
            r13 = 3
            if (r8 >= r13) goto L71
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r8)
        L71:
            r4 = r14
            com.google.android.gms.internal.consent_sdk.zzdh r13 = new com.google.android.gms.internal.consent_sdk.zzdh
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r13
        L79:
            com.google.android.gms.internal.consent_sdk.zzde r13 = zzl(r8, r14)
            return r13
        L7e:
            r13 = r14[r0]
            java.util.Objects.requireNonNull(r13)
            com.google.android.gms.internal.consent_sdk.zzdi r14 = new com.google.android.gms.internal.consent_sdk.zzdi
            r14.<init>(r13)
            return r14
        L89:
            com.google.android.gms.internal.consent_sdk.zzdh r13 = com.google.android.gms.internal.consent_sdk.zzdh.zza
            return r13
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.consent_sdk.zzde
            r2 = 0
            if (r1 == 0) goto L24
            boolean r1 = r4.zzk()
            if (r1 == 0) goto L24
            r1 = r5
            com.google.android.gms.internal.consent_sdk.zzde r1 = (com.google.android.gms.internal.consent_sdk.zzde) r1
            boolean r1 = r1.zzk()
            if (r1 == 0) goto L24
            int r1 = r4.hashCode()
            int r3 = r5.hashCode()
            if (r1 != r3) goto L23
            goto L24
        L23:
            return r2
        L24:
            if (r5 != r4) goto L27
            goto L40
        L27:
            boolean r1 = r5 instanceof java.util.Set
            if (r1 == 0) goto L3f
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L3f
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L3f
            if (r1 != r3) goto L3f
            boolean r5 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L3f
            if (r5 != 0) goto L3e
            goto L3f
        L3e:
            return r0
        L3f:
            r0 = 0
        L40:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r4 = this;
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
            r2 = 0
        L6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r0.next()
            if (r3 == 0) goto L17
            int r3 = r3.hashCode()
            goto L18
        L17:
            r3 = 0
        L18:
            int r2 = r2 + r3
            goto L6
        L1a:
            return r2
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzdj r0 = r1.zzd()
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    public abstract com.google.android.gms.internal.consent_sdk.zzdj zzd();

    public final com.google.android.gms.internal.consent_sdk.zzdd zzg() {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzdd r0 = r1.zza
            if (r0 != 0) goto La
            com.google.android.gms.internal.consent_sdk.zzdd r0 = r1.zzh()
            r1.zza = r0
        La:
            return r0
    }

    com.google.android.gms.internal.consent_sdk.zzdd zzh() {
            r2 = this;
            java.lang.Object[] r0 = r2.toArray()
            int r1 = com.google.android.gms.internal.consent_sdk.zzdd.zzd
            int r1 = r0.length
            com.google.android.gms.internal.consent_sdk.zzdd r0 = com.google.android.gms.internal.consent_sdk.zzdd.zzg(r0, r1)
            return r0
    }

    boolean zzk() {
            r1 = this;
            r0 = 0
            return r0
    }
}
