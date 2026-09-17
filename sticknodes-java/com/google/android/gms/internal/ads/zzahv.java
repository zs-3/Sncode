package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzahv {
    private final byte[] zza;
    private final java.util.ArrayDeque zzb;
    private final com.google.android.gms.internal.ads.zzaic zzc;
    private com.google.android.gms.internal.ads.zzahw zzd;
    private int zze;
    private int zzf;
    private long zzg;

    public zzahv() {
            r1 = this;
            r1.<init>()
            r0 = 8
            byte[] r0 = new byte[r0]
            r1.zza = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.zzb = r0
            com.google.android.gms.internal.ads.zzaic r0 = new com.google.android.gms.internal.ads.zzaic
            r0.<init>()
            r1.zzc = r0
            return
    }

    private final long zzd(com.google.android.gms.internal.ads.zzadc r7, int r8) throws java.io.IOException {
            r6 = this;
            byte[] r0 = r6.zza
            r1 = 0
            r7.zzi(r0, r1, r8)
            r2 = 0
        L8:
            if (r1 >= r8) goto L18
            r7 = 8
            long r2 = r2 << r7
            byte[] r7 = r6.zza
            r7 = r7[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r4 = (long) r7
            long r2 = r2 | r4
            int r1 = r1 + 1
            goto L8
        L18:
            return r2
    }

    public final void zza(com.google.android.gms.internal.ads.zzahw r1) {
            r0 = this;
            r0.zzd = r1
            return
    }

    public final void zzb() {
            r1 = this;
            r0 = 0
            r1.zze = r0
            java.util.ArrayDeque r0 = r1.zzb
            r0.clear()
            com.google.android.gms.internal.ads.zzaic r0 = r1.zzc
            r0.zze()
            return
    }

    public final boolean zzc(com.google.android.gms.internal.ads.zzadc r14) throws java.io.IOException {
            r13 = this;
            com.google.android.gms.internal.ads.zzahw r0 = r13.zzd
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
        L5:
            java.util.ArrayDeque r0 = r13.zzb
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzahu r0 = (com.google.android.gms.internal.ads.zzahu) r0
            r1 = 1
            if (r0 == 0) goto L33
            long r2 = r14.zzf()
            long r4 = com.google.android.gms.internal.ads.zzahu.zzb(r0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L1d
            goto L33
        L1d:
            com.google.android.gms.internal.ads.zzahw r14 = r13.zzd
            java.util.ArrayDeque r0 = r13.zzb
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.zzahu r0 = (com.google.android.gms.internal.ads.zzahu) r0
            int r0 = com.google.android.gms.internal.ads.zzahu.zza(r0)
            com.google.android.gms.internal.ads.zzahy r14 = (com.google.android.gms.internal.ads.zzahy) r14
            com.google.android.gms.internal.ads.zzaia r14 = r14.zza
            r14.zzj(r0)
            return r1
        L33:
            int r0 = r13.zze
            r2 = 4
            r3 = 0
            if (r0 != 0) goto L94
            com.google.android.gms.internal.ads.zzaic r0 = r13.zzc
            long r4 = r0.zzd(r14, r1, r3, r2)
            r6 = -2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L87
            r14.zzj()
        L48:
            byte[] r0 = r13.zza
            r14.zzh(r0, r3, r2)
            byte[] r0 = r13.zza
            r0 = r0[r3]
            int r0 = com.google.android.gms.internal.ads.zzaic.zzb(r0)
            r4 = -1
            if (r0 == r4) goto L83
            if (r0 > r2) goto L83
            byte[] r4 = r13.zza
            long r4 = com.google.android.gms.internal.ads.zzaic.zzc(r4, r0, r3)
            int r5 = (int) r4
            com.google.android.gms.internal.ads.zzahw r4 = r13.zzd
            com.google.android.gms.internal.ads.zzahy r4 = (com.google.android.gms.internal.ads.zzahy) r4
            com.google.android.gms.internal.ads.zzaia r4 = r4.zza
            r4 = 357149030(0x1549a966, float:4.072526E-26)
            r6 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r5 == r4) goto L7e
            r4 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r5 == r4) goto L7e
            r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r5 == r4) goto L7e
            if (r5 != r6) goto L83
            r5 = 374648427(0x1654ae6b, float:1.718026E-25)
        L7e:
            r14.zzk(r0)
            long r4 = (long) r5
            goto L87
        L83:
            r14.zzk(r1)
            goto L48
        L87:
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L8e
            return r3
        L8e:
            int r0 = (int) r4
            r13.zzf = r0
            r13.zze = r1
            goto L96
        L94:
            if (r0 != r1) goto La3
        L96:
            com.google.android.gms.internal.ads.zzaic r0 = r13.zzc
            r4 = 8
            long r4 = r0.zzd(r14, r3, r1, r4)
            r13.zzg = r4
            r0 = 2
            r13.zze = r0
        La3:
            com.google.android.gms.internal.ads.zzahw r0 = r13.zzd
            int r4 = r13.zzf
            com.google.android.gms.internal.ads.zzahy r0 = (com.google.android.gms.internal.ads.zzahy) r0
            com.google.android.gms.internal.ads.zzaia r5 = r0.zza
            r6 = 8
            r8 = 0
            switch(r4) {
                case 131: goto L165;
                case 134: goto L124;
                case 136: goto L165;
                case 155: goto L165;
                case 159: goto L165;
                case 160: goto L101;
                case 161: goto Lf8;
                case 163: goto Lf8;
                case 165: goto Lf8;
                case 166: goto L101;
                case 174: goto L101;
                case 176: goto L165;
                case 179: goto L165;
                case 181: goto Lbb;
                case 183: goto L101;
                case 186: goto L165;
                case 187: goto L101;
                case 215: goto L165;
                case 224: goto L101;
                case 225: goto L101;
                case 231: goto L165;
                case 238: goto L165;
                case 241: goto L165;
                case 251: goto L165;
                case 16868: goto L101;
                case 16871: goto L165;
                case 16877: goto Lf8;
                case 16980: goto L165;
                case 16981: goto Lf8;
                case 17026: goto L124;
                case 17029: goto L165;
                case 17143: goto L165;
                case 17545: goto Lbb;
                case 18401: goto L165;
                case 18402: goto Lf8;
                case 18407: goto L101;
                case 18408: goto L165;
                case 19899: goto L101;
                case 20529: goto L165;
                case 20530: goto L165;
                case 20532: goto L101;
                case 20533: goto L101;
                case 21358: goto L124;
                case 21419: goto Lf8;
                case 21420: goto L165;
                case 21432: goto L165;
                case 21680: goto L165;
                case 21682: goto L165;
                case 21690: goto L165;
                case 21930: goto L165;
                case 21936: goto L101;
                case 21938: goto L165;
                case 21945: goto L165;
                case 21946: goto L165;
                case 21947: goto L165;
                case 21948: goto L165;
                case 21949: goto L165;
                case 21968: goto L101;
                case 21969: goto Lbb;
                case 21970: goto Lbb;
                case 21971: goto Lbb;
                case 21972: goto Lbb;
                case 21973: goto Lbb;
                case 21974: goto Lbb;
                case 21975: goto Lbb;
                case 21976: goto Lbb;
                case 21977: goto Lbb;
                case 21978: goto Lbb;
                case 21998: goto L165;
                case 22186: goto L165;
                case 22203: goto L165;
                case 25152: goto L101;
                case 25188: goto L165;
                case 25506: goto Lf8;
                case 28032: goto L101;
                case 30113: goto L101;
                case 30114: goto L165;
                case 30320: goto L101;
                case 30321: goto L165;
                case 30322: goto Lf8;
                case 30323: goto Lbb;
                case 30324: goto Lbb;
                case 30325: goto Lbb;
                case 2274716: goto L124;
                case 2352003: goto L165;
                case 2807729: goto L165;
                case 290298740: goto L101;
                case 357149030: goto L101;
                case 374648427: goto L101;
                case 408125543: goto L101;
                case 440786851: goto L101;
                case 475249515: goto L101;
                case 524531317: goto L101;
                default: goto Lb1;
            }
        Lb1:
            long r0 = r13.zzg
            int r1 = (int) r0
            r14.zzk(r1)
            r13.zze = r3
            goto L5
        Lbb:
            long r9 = r13.zzg
            r11 = 4
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 == 0) goto Lde
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r5 != 0) goto Lc8
            goto Lde
        Lc8:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Invalid float size: "
            r14.append(r0)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzbo r14 = com.google.android.gms.internal.ads.zzbo.zza(r14, r8)
            throw r14
        Lde:
            int r5 = (int) r9
            long r6 = r13.zzd(r14, r5)
            if (r5 != r2) goto Lec
            int r14 = (int) r6
            float r14 = java.lang.Float.intBitsToFloat(r14)
            double r5 = (double) r14
            goto Lf0
        Lec:
            double r5 = java.lang.Double.longBitsToDouble(r6)
        Lf0:
            com.google.android.gms.internal.ads.zzaia r14 = r0.zza
            r14.zzk(r4, r5)
            r13.zze = r3
            return r1
        Lf8:
            long r6 = r13.zzg
            int r0 = (int) r6
            r5.zzh(r4, r0, r14)
            r13.zze = r3
            return r1
        L101:
            long r9 = r14.zzf()
            long r5 = r13.zzg
            long r5 = r5 + r9
            java.util.ArrayDeque r14 = r13.zzb
            com.google.android.gms.internal.ads.zzahu r0 = new com.google.android.gms.internal.ads.zzahu
            r0.<init>(r4, r5, r8)
            r14.push(r0)
            com.google.android.gms.internal.ads.zzahw r14 = r13.zzd
            int r7 = r13.zzf
            long r4 = r13.zzg
            com.google.android.gms.internal.ads.zzahy r14 = (com.google.android.gms.internal.ads.zzahy) r14
            com.google.android.gms.internal.ads.zzaia r6 = r14.zza
            r8 = r9
            r10 = r4
            r6.zzm(r7, r8, r10)
            r13.zze = r3
            return r1
        L124:
            long r5 = r13.zzg
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 > 0) goto L14f
            int r2 = (int) r5
            if (r2 != 0) goto L133
            java.lang.String r14 = ""
            goto L147
        L133:
            byte[] r5 = new byte[r2]
            r14.zzi(r5, r3, r2)
        L138:
            if (r2 <= 0) goto L142
            int r14 = r2 + (-1)
            r6 = r5[r14]
            if (r6 != 0) goto L142
            r2 = r14
            goto L138
        L142:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r5, r3, r2)
        L147:
            com.google.android.gms.internal.ads.zzaia r0 = r0.zza
            r0.zzn(r4, r14)
            r13.zze = r3
            return r1
        L14f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "String element size: "
            r14.append(r0)
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzbo r14 = com.google.android.gms.internal.ads.zzbo.zza(r14, r8)
            throw r14
        L165:
            long r9 = r13.zzg
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 > 0) goto L178
            int r2 = (int) r9
            long r5 = r13.zzd(r14, r2)
            com.google.android.gms.internal.ads.zzaia r14 = r0.zza
            r14.zzl(r4, r5)
            r13.zze = r3
            return r1
        L178:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Invalid integer size: "
            r14.append(r0)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzbo r14 = com.google.android.gms.internal.ads.zzbo.zza(r14, r8)
            throw r14
    }
}
