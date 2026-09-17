package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzat implements java.lang.Iterable, com.google.android.gms.internal.measurement.zzap {
    private final java.lang.String zza;

    public zzat(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.zza = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "StringValue cannot be null."
            r2.<init>(r0)
            throw r2
    }

    static /* bridge */ /* synthetic */ java.lang.String zzb(com.google.android.gms.internal.measurement.zzat r0) {
            java.lang.String r0 = r0.zza
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.measurement.zzat
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.measurement.zzat r2 = (com.google.android.gms.internal.measurement.zzat) r2
            java.lang.String r0 = r1.zza
            java.lang.String r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzas r0 = new com.google.android.gms.internal.measurement.zzas
            r0.<init>(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.String r2 = r3.zza
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String r22, com.google.android.gms.internal.measurement.zzg r23, java.util.List r24) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r4 = "charAt"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "concat"
            java.lang.String r7 = "indexOf"
            java.lang.String r8 = "replace"
            java.lang.String r9 = "substring"
            java.lang.String r10 = "split"
            java.lang.String r11 = "slice"
            java.lang.String r12 = "match"
            java.lang.String r13 = "lastIndexOf"
            java.lang.String r14 = "toLocaleUpperCase"
            java.lang.String r15 = "search"
            java.lang.String r2 = "toLowerCase"
            java.lang.String r0 = "toLocaleLowerCase"
            java.lang.String r3 = "toString"
            r16 = r4
            java.lang.String r4 = "hasOwnProperty"
            r17 = r14
            java.lang.String r14 = "toUpperCase"
            r18 = r14
            if (r5 != 0) goto Laf
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto Laf
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto Laf
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto Laf
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto Laf
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto Laf
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto Laf
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto Laf
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto Laf
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto Laf
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto Laf
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto Laf
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto Laf
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto Laf
            r5 = r18
            boolean r18 = r5.equals(r1)
            r14 = r17
            if (r18 != 0) goto Lb3
            boolean r17 = r14.equals(r1)
            if (r17 != 0) goto Lb3
            r17 = r4
            java.lang.String r4 = "trim"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L9d
            goto Lb5
        L9d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "%s is not a String function"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        Laf:
            r14 = r17
            r5 = r18
        Lb3:
            r17 = r4
        Lb5:
            int r4 = r22.hashCode()
            r19 = r3
            switch(r4) {
                case -1789698943: goto L16f;
                case -1776922004: goto L15d;
                case -1464939364: goto L14e;
                case -1361633751: goto L140;
                case -1354795244: goto L132;
                case -1137582698: goto L127;
                case -906336856: goto L11f;
                case -726908483: goto L116;
                case -467511597: goto L10e;
                case -399551817: goto L105;
                case 3568674: goto Lfa;
                case 103668165: goto Lf2;
                case 109526418: goto Le9;
                case 109648666: goto Le0;
                case 530542161: goto Ld7;
                case 1094496948: goto Lcf;
                case 1943291465: goto Lc6;
                default: goto Lbe;
            }
        Lbe:
            r4 = r16
        Lc0:
            r3 = r17
            r6 = r19
            goto L17d
        Lc6:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto Lbe
            r1 = 3
            goto L12f
        Lcf:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto Lbe
            r1 = 6
            goto L12f
        Ld7:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto Lbe
            r1 = 10
            goto L12f
        Le0:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto Lbe
            r1 = 9
            goto L12f
        Le9:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto Lbe
            r1 = 8
            goto L12f
        Lf2:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto Lbe
            r1 = 5
            goto L12f
        Lfa:
            java.lang.String r4 = "trim"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lbe
            r1 = 16
            goto L12f
        L105:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto Lbe
            r1 = 15
            goto L12f
        L10e:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto Lbe
            r1 = 4
            goto L12f
        L116:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto Lbe
            r1 = 11
            goto L12f
        L11f:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto Lbe
            r1 = 7
            goto L12f
        L127:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lbe
            r1 = 13
        L12f:
            r4 = r16
            goto L158
        L132:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto Lbe
            r4 = r16
            r3 = r17
            r6 = r19
            r1 = 1
            goto L17e
        L140:
            r4 = r16
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lc0
            r3 = r17
            r6 = r19
            r1 = 0
            goto L17e
        L14e:
            r4 = r16
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lc0
            r1 = 12
        L158:
            r3 = r17
            r6 = r19
            goto L17e
        L15d:
            r4 = r16
            r6 = r19
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L16c
            r1 = 14
            r3 = r17
            goto L17e
        L16c:
            r3 = r17
            goto L17d
        L16f:
            r4 = r16
            r3 = r17
            r6 = r19
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L17d
            r1 = 2
            goto L17e
        L17d:
            r1 = -1
        L17e:
            java.lang.String r17 = "undefined"
            r20 = r3
            r19 = r4
            switch(r1) {
                case 0: goto L639;
                case 1: goto L5ff;
                case 2: goto L5b5;
                case 3: goto L55f;
                case 4: goto L501;
                case 5: goto L4b1;
                case 6: goto L420;
                case 7: goto L3d4;
                case 8: goto L33c;
                case 9: goto L286;
                case 10: goto L209;
                case 11: goto L1f4;
                case 12: goto L1de;
                case 13: goto L1c7;
                case 14: goto L1bd;
                case 15: goto L1a6;
                case 16: goto L191;
                default: goto L187;
            }
        L187:
            r0 = r21
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Command not supported"
            r1.<init>(r2)
            throw r1
        L191:
            r1 = r24
            r3 = 0
            com.google.android.gms.internal.measurement.zzh.zzh(r5, r3, r1)
            r0 = r21
            java.lang.String r1 = r0.zza
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = r1.trim()
            r2.<init>(r1)
            goto L681
        L1a6:
            r3 = 0
            r0 = r21
            r1 = r24
            com.google.android.gms.internal.measurement.zzh.zzh(r5, r3, r1)
            java.lang.String r1 = r0.zza
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toUpperCase(r3)
            r2.<init>(r1)
            goto L681
        L1bd:
            r3 = 0
            r0 = r21
            r1 = r24
            com.google.android.gms.internal.measurement.zzh.zzh(r6, r3, r1)
            goto L637
        L1c7:
            r3 = 0
            r0 = r21
            r1 = r24
            com.google.android.gms.internal.measurement.zzh.zzh(r2, r3, r1)
            java.lang.String r1 = r0.zza
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r3)
            r2.<init>(r1)
            goto L681
        L1de:
            r3 = 0
            r1 = r24
            r2 = r0
            r0 = r21
            com.google.android.gms.internal.measurement.zzh.zzh(r2, r3, r1)
            java.lang.String r1 = r0.zza
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = r1.toLowerCase()
            r2.<init>(r1)
            goto L681
        L1f4:
            r3 = 0
            r0 = r21
            r1 = r24
            com.google.android.gms.internal.measurement.zzh.zzh(r14, r3, r1)
            java.lang.String r1 = r0.zza
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = r1.toUpperCase()
            r2.<init>(r1)
            goto L681
        L209:
            r0 = r21
            r1 = r24
            r2 = 2
            r3 = 0
            com.google.android.gms.internal.measurement.zzh.zzj(r9, r2, r1)
            java.lang.String r2 = r0.zza
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L234
            java.lang.Object r4 = r1.get(r3)
            com.google.android.gms.internal.measurement.zzap r4 = (com.google.android.gms.internal.measurement.zzap) r4
            r3 = r23
            com.google.android.gms.internal.measurement.zzap r4 = r3.zzb(r4)
            java.lang.Double r4 = r4.zzh()
            double r4 = r4.doubleValue()
            double r4 = com.google.android.gms.internal.measurement.zzh.zza(r4)
            int r4 = (int) r4
            goto L237
        L234:
            r3 = r23
            r4 = 0
        L237:
            int r5 = r24.size()
            r6 = 1
            if (r5 <= r6) goto L256
            java.lang.Object r1 = r1.get(r6)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r3.zzb(r1)
            java.lang.Double r1 = r1.zzh()
            double r5 = r1.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.zzh.zza(r5)
            int r1 = (int) r5
            goto L25a
        L256:
            int r1 = r2.length()
        L25a:
            r3 = 0
            int r4 = java.lang.Math.max(r4, r3)
            int r5 = r2.length()
            int r4 = java.lang.Math.min(r4, r5)
            int r1 = java.lang.Math.max(r1, r3)
            int r3 = r2.length()
            int r1 = java.lang.Math.min(r1, r3)
            com.google.android.gms.internal.measurement.zzat r3 = new com.google.android.gms.internal.measurement.zzat
            int r5 = java.lang.Math.min(r4, r1)
            int r1 = java.lang.Math.max(r4, r1)
            java.lang.String r1 = r2.substring(r5, r1)
            r3.<init>(r1)
            goto L4ae
        L286:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 2
            com.google.android.gms.internal.measurement.zzh.zzj(r10, r2, r1)
            java.lang.String r2 = r0.zza
            int r4 = r2.length()
            if (r4 != 0) goto L2a9
            com.google.android.gms.internal.measurement.zzae r2 = new com.google.android.gms.internal.measurement.zzae
            r1 = 1
            com.google.android.gms.internal.measurement.zzap[] r1 = new com.google.android.gms.internal.measurement.zzap[r1]
            r4 = 0
            r1[r4] = r0
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2.<init>(r1)
            goto L681
        L2a9:
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r6 = r24.isEmpty()
            if (r6 == 0) goto L2ba
            r5.add(r0)
            goto L335
        L2ba:
            java.lang.Object r6 = r1.get(r4)
            com.google.android.gms.internal.measurement.zzap r6 = (com.google.android.gms.internal.measurement.zzap) r6
            com.google.android.gms.internal.measurement.zzap r4 = r3.zzb(r6)
            java.lang.String r4 = r4.zzi()
            int r6 = r24.size()
            r7 = 1
            if (r6 <= r7) goto L2e6
            java.lang.Object r1 = r1.get(r7)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r3.zzb(r1)
            java.lang.Double r1 = r1.zzh()
            double r6 = r1.doubleValue()
            long r6 = com.google.android.gms.internal.measurement.zzh.zzd(r6)
            goto L2e9
        L2e6:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L2e9:
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L2f6
            com.google.android.gms.internal.measurement.zzae r2 = new com.google.android.gms.internal.measurement.zzae
            r2.<init>()
            goto L681
        L2f6:
            java.lang.String r1 = java.util.regex.Pattern.quote(r4)
            int r3 = (int) r6
            r8 = 1
            int r3 = r3 + r8
            java.lang.String[] r1 = r2.split(r1, r3)
            int r2 = r1.length
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L31d
            if (r2 <= 0) goto L31d
            r3 = 0
            r3 = r1[r3]
            boolean r14 = r3.isEmpty()
            int r3 = r2 + (-1)
            r4 = r1[r3]
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L31f
            r3 = r2
            goto L31f
        L31d:
            r3 = r2
            r14 = 0
        L31f:
            long r8 = (long) r2
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 <= 0) goto L326
            int r3 = r3 + (-1)
        L326:
            if (r14 >= r3) goto L335
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            r4 = r1[r14]
            r2.<init>(r4)
            r5.add(r2)
            int r14 = r14 + 1
            goto L326
        L335:
            com.google.android.gms.internal.measurement.zzae r2 = new com.google.android.gms.internal.measurement.zzae
            r2.<init>(r5)
            goto L681
        L33c:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 2
            com.google.android.gms.internal.measurement.zzh.zzj(r11, r2, r1)
            java.lang.String r2 = r0.zza
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L362
            r4 = 0
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.measurement.zzap r5 = (com.google.android.gms.internal.measurement.zzap) r5
            com.google.android.gms.internal.measurement.zzap r4 = r3.zzb(r5)
            java.lang.Double r4 = r4.zzh()
            double r4 = r4.doubleValue()
            goto L364
        L362:
            r4 = 0
        L364:
            double r4 = com.google.android.gms.internal.measurement.zzh.zza(r4)
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L379
            int r8 = r2.length()
            double r8 = (double) r8
            double r8 = r8 + r4
            double r4 = java.lang.Math.max(r8, r6)
            goto L382
        L379:
            int r6 = r2.length()
            double r6 = (double) r6
            double r4 = java.lang.Math.min(r4, r6)
        L382:
            int r6 = r24.size()
            r7 = 1
            if (r6 <= r7) goto L39c
            java.lang.Object r1 = r1.get(r7)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r3.zzb(r1)
            java.lang.Double r1 = r1.zzh()
            double r6 = r1.doubleValue()
            goto L3a1
        L39c:
            int r1 = r2.length()
            double r6 = (double) r1
        L3a1:
            double r6 = com.google.android.gms.internal.measurement.zzh.zza(r6)
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L3b6
            int r1 = r2.length()
            double r10 = (double) r1
            double r10 = r10 + r6
            double r6 = java.lang.Math.max(r10, r8)
            goto L3bf
        L3b6:
            int r1 = r2.length()
            double r8 = (double) r1
            double r6 = java.lang.Math.min(r6, r8)
        L3bf:
            int r1 = (int) r4
            int r3 = (int) r6
            int r3 = r3 - r1
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            int r3 = r3 + r1
            com.google.android.gms.internal.measurement.zzat r4 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = r2.substring(r1, r3)
            r4.<init>(r1)
            r2 = r4
            goto L681
        L3d4:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 1
            r4 = 0
            com.google.android.gms.internal.measurement.zzh.zzj(r15, r2, r1)
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L3f3
            java.lang.Object r1 = r1.get(r4)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r3.zzb(r1)
            java.lang.String r17 = r1.zzi()
        L3f3:
            java.lang.String r1 = r0.zza
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r17)
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.find()
            if (r2 == 0) goto L413
            com.google.android.gms.internal.measurement.zzah r2 = new com.google.android.gms.internal.measurement.zzah
            int r1 = r1.start()
            double r3 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L681
        L413:
            com.google.android.gms.internal.measurement.zzah r2 = new com.google.android.gms.internal.measurement.zzah
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L681
        L420:
            r2 = 2
            r0 = r21
            r3 = r23
            r1 = r24
            com.google.android.gms.internal.measurement.zzh.zzj(r8, r2, r1)
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.zzf
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L452
            r4 = 0
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.measurement.zzap r5 = (com.google.android.gms.internal.measurement.zzap) r5
            com.google.android.gms.internal.measurement.zzap r4 = r3.zzb(r5)
            java.lang.String r17 = r4.zzi()
            int r4 = r24.size()
            r5 = 1
            if (r4 <= r5) goto L452
            java.lang.Object r1 = r1.get(r5)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r2 = r3.zzb(r1)
        L452:
            r1 = r17
            java.lang.String r4 = r0.zza
            int r5 = r4.indexOf(r1)
            if (r5 < 0) goto L637
            boolean r6 = r2 instanceof com.google.android.gms.internal.measurement.zzai
            if (r6 == 0) goto L485
            com.google.android.gms.internal.measurement.zzai r2 = (com.google.android.gms.internal.measurement.zzai) r2
            r6 = 3
            com.google.android.gms.internal.measurement.zzap[] r6 = new com.google.android.gms.internal.measurement.zzap[r6]
            com.google.android.gms.internal.measurement.zzat r7 = new com.google.android.gms.internal.measurement.zzat
            r7.<init>(r1)
            r8 = 0
            r6[r8] = r7
            double r7 = (double) r5
            com.google.android.gms.internal.measurement.zzah r9 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r9.<init>(r7)
            r7 = 1
            r6[r7] = r9
            r7 = 2
            r6[r7] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            com.google.android.gms.internal.measurement.zzap r2 = r2.zza(r3, r6)
        L485:
            com.google.android.gms.internal.measurement.zzat r3 = new com.google.android.gms.internal.measurement.zzat
            r6 = 0
            java.lang.String r6 = r4.substring(r6, r5)
            java.lang.String r2 = r2.zzi()
            int r1 = r1.length()
            int r5 = r5 + r1
            java.lang.String r1 = r4.substring(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
        L4ae:
            r2 = r3
            goto L681
        L4b1:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 1
            com.google.android.gms.internal.measurement.zzh.zzj(r12, r2, r1)
            java.lang.String r2 = r0.zza
            int r4 = r24.size()
            if (r4 > 0) goto L4c6
            java.lang.String r1 = ""
            goto L4d5
        L4c6:
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r3.zzb(r1)
            java.lang.String r1 = r1.zzi()
        L4d5:
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r2 = r1.find()
            if (r2 == 0) goto L4fd
            com.google.android.gms.internal.measurement.zzae r2 = new com.google.android.gms.internal.measurement.zzae
            r3 = 1
            com.google.android.gms.internal.measurement.zzap[] r3 = new com.google.android.gms.internal.measurement.zzap[r3]
            com.google.android.gms.internal.measurement.zzat r4 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = r1.group()
            r4.<init>(r1)
            r5 = 0
            r3[r5] = r4
            java.util.List r1 = java.util.Arrays.asList(r3)
            r2.<init>(r1)
            goto L681
        L4fd:
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.zzg
            goto L681
        L501:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 2
            r5 = 0
            com.google.android.gms.internal.measurement.zzh.zzj(r13, r2, r1)
            java.lang.String r4 = r0.zza
            int r6 = r24.size()
            if (r6 > 0) goto L515
            goto L523
        L515:
            java.lang.Object r5 = r1.get(r5)
            com.google.android.gms.internal.measurement.zzap r5 = (com.google.android.gms.internal.measurement.zzap) r5
            com.google.android.gms.internal.measurement.zzap r5 = r3.zzb(r5)
            java.lang.String r17 = r5.zzi()
        L523:
            r5 = r17
            int r6 = r24.size()
            if (r6 >= r2) goto L52e
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L541
        L52e:
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r3.zzb(r1)
            java.lang.Double r1 = r1.zzh()
            double r1 = r1.doubleValue()
        L541:
            boolean r3 = java.lang.Double.isNaN(r1)
            if (r3 == 0) goto L54a
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L54e
        L54a:
            double r1 = com.google.android.gms.internal.measurement.zzh.zza(r1)
        L54e:
            int r1 = (int) r1
            com.google.android.gms.internal.measurement.zzah r2 = new com.google.android.gms.internal.measurement.zzah
            int r1 = r4.lastIndexOf(r5, r1)
            double r3 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L681
        L55f:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 2
            r8 = 0
            com.google.android.gms.internal.measurement.zzh.zzj(r7, r2, r1)
            java.lang.String r4 = r0.zza
            int r5 = r24.size()
            if (r5 > 0) goto L574
            goto L583
        L574:
            r5 = 0
            java.lang.Object r5 = r1.get(r5)
            com.google.android.gms.internal.measurement.zzap r5 = (com.google.android.gms.internal.measurement.zzap) r5
            com.google.android.gms.internal.measurement.zzap r5 = r3.zzb(r5)
            java.lang.String r17 = r5.zzi()
        L583:
            r5 = r17
            int r6 = r24.size()
            if (r6 >= r2) goto L58d
            r1 = r8
            goto L5a0
        L58d:
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r3.zzb(r1)
            java.lang.Double r1 = r1.zzh()
            double r1 = r1.doubleValue()
        L5a0:
            double r1 = com.google.android.gms.internal.measurement.zzh.zza(r1)
            int r1 = (int) r1
            com.google.android.gms.internal.measurement.zzah r2 = new com.google.android.gms.internal.measurement.zzah
            int r1 = r4.indexOf(r5, r1)
            double r3 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L681
        L5b5:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = r20
            r4 = 1
            com.google.android.gms.internal.measurement.zzh.zzh(r2, r4, r1)
            java.lang.String r2 = r0.zza
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r3.zzb(r1)
            java.lang.String r3 = r1.zzi()
            java.lang.String r4 = "length"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L5de
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.zzk
            goto L681
        L5de:
            java.lang.Double r1 = r1.zzh()
            double r3 = r1.doubleValue()
            double r5 = java.lang.Math.floor(r3)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L5fb
            int r1 = (int) r3
            if (r1 < 0) goto L5fb
            int r2 = r2.length()
            if (r1 >= r2) goto L5fb
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.zzk
            goto L681
        L5fb:
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.zzl
            goto L681
        L5ff:
            r0 = r21
            r3 = r23
            r1 = r24
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L637
            java.lang.String r2 = r0.zza
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r14 = 0
        L613:
            int r2 = r24.size()
            if (r14 >= r2) goto L62d
            java.lang.Object r2 = r1.get(r14)
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            com.google.android.gms.internal.measurement.zzap r2 = r3.zzb(r2)
            java.lang.String r2 = r2.zzi()
            r4.append(r2)
            int r14 = r14 + 1
            goto L613
        L62d:
            java.lang.String r1 = r4.toString()
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            r2.<init>(r1)
            goto L681
        L637:
            r2 = r0
            goto L681
        L639:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = r19
            r4 = 1
            com.google.android.gms.internal.measurement.zzh.zzj(r2, r4, r1)
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L664
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r3.zzb(r1)
            java.lang.Double r1 = r1.zzh()
            double r1 = r1.doubleValue()
            double r1 = com.google.android.gms.internal.measurement.zzh.zza(r1)
            int r14 = (int) r1
            goto L666
        L664:
            r2 = 0
            r14 = 0
        L666:
            java.lang.String r1 = r0.zza
            if (r14 < 0) goto L67f
            int r2 = r1.length()
            if (r14 < r2) goto L671
            goto L67f
        L671:
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            char r1 = r1.charAt(r14)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
            goto L681
        L67f:
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.zzm
        L681:
            return r2
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = r2.zza
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
            r1 = this;
            java.lang.String r0 = r1.zza
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
            r2 = this;
            java.lang.String r0 = r2.zza
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L14
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Ld
            return r0
        Ld:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L14:
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzar r0 = new com.google.android.gms.internal.measurement.zzar
            r0.<init>(r1)
            return r0
    }
}
