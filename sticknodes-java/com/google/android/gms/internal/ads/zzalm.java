package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzalm {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzalm(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            r0.zzk = r11
            return
    }

    public static com.google.android.gms.internal.ads.zzalm zza(java.lang.String r17) {
            r0 = 7
            r1 = r17
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r2 = ","
            java.lang.String[] r1 = android.text.TextUtils.split(r1, r2)
            r2 = 0
            r3 = -1
            r4 = 0
            r6 = -1
            r7 = -1
            r8 = -1
            r9 = -1
            r10 = -1
            r11 = -1
            r12 = -1
            r13 = -1
            r14 = -1
            r15 = -1
        L1a:
            int r5 = r1.length
            if (r4 >= r5) goto Lb3
            r5 = r1[r4]
            java.lang.String r5 = r5.trim()
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfxi.zza(r5)
            int r16 = r5.hashCode()
            switch(r16) {
                case -1178781136: goto L8c;
                case -1026963764: goto L82;
                case -192095652: goto L77;
                case -70925746: goto L6d;
                case 3029637: goto L63;
                case 3373707: goto L59;
                case 366554320: goto L4f;
                case 767321349: goto L44;
                case 1767875043: goto L3a;
                case 1988365454: goto L30;
                default: goto L2e;
            }
        L2e:
            goto L96
        L30:
            java.lang.String r0 = "outlinecolour"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L96
            r0 = 3
            goto L97
        L3a:
            java.lang.String r0 = "alignment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L96
            r0 = 1
            goto L97
        L44:
            java.lang.String r0 = "borderstyle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L96
            r0 = 9
            goto L97
        L4f:
            java.lang.String r0 = "fontsize"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L96
            r0 = 4
            goto L97
        L59:
            java.lang.String r0 = "name"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L96
            r0 = 0
            goto L97
        L63:
            java.lang.String r0 = "bold"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L96
            r0 = 5
            goto L97
        L6d:
            java.lang.String r0 = "primarycolour"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L96
            r0 = 2
            goto L97
        L77:
            java.lang.String r0 = "strikeout"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L96
            r0 = 8
            goto L97
        L82:
            java.lang.String r0 = "underline"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L96
            r0 = 7
            goto L97
        L8c:
            java.lang.String r0 = "italic"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L96
            r0 = 6
            goto L97
        L96:
            r0 = -1
        L97:
            switch(r0) {
                case 0: goto Lad;
                case 1: goto Lab;
                case 2: goto La9;
                case 3: goto La7;
                case 4: goto La5;
                case 5: goto La3;
                case 6: goto La1;
                case 7: goto L9f;
                case 8: goto L9d;
                case 9: goto L9b;
                default: goto L9a;
            }
        L9a:
            goto Lae
        L9b:
            r15 = r4
            goto Lae
        L9d:
            r14 = r4
            goto Lae
        L9f:
            r13 = r4
            goto Lae
        La1:
            r12 = r4
            goto Lae
        La3:
            r11 = r4
            goto Lae
        La5:
            r10 = r4
            goto Lae
        La7:
            r9 = r4
            goto Lae
        La9:
            r8 = r4
            goto Lae
        Lab:
            r7 = r4
            goto Lae
        Lad:
            r6 = r4
        Lae:
            int r4 = r4 + 1
            r0 = 7
            goto L1a
        Lb3:
            if (r6 == r3) goto Lbf
            com.google.android.gms.internal.ads.zzalm r0 = new com.google.android.gms.internal.ads.zzalm
            r1 = r5
            r5 = r0
            r16 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        Lbf:
            r0 = 0
            return r0
    }
}
