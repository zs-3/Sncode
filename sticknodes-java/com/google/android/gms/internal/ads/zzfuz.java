package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfuz {
    public static final int zza = 0;
    public static final android.content.ClipData zzb = null;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 <= r1) goto L9
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.gms.internal.ads.zzfuz.zza = r0
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = ""
            android.content.ClipData r0 = android.content.ClipData.newIntent(r1, r0)
            com.google.android.gms.internal.ads.zzfuz.zzb = r0
            return
    }

    public static android.app.PendingIntent zza(android.content.Context r0, int r1, android.content.Intent r2, int r3) {
            r1 = 201326592(0xc000000, float:9.8607613E-32)
            r3 = 0
            android.content.Intent r2 = zzc(r2, r1, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r3, r2, r1)
            return r0
    }

    public static android.app.PendingIntent zzb(android.content.Context r0, int r1, android.content.Intent r2, int r3, int r4) {
            r1 = 0
            android.content.Intent r2 = zzc(r2, r3, r1)
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r0, r1, r2, r3)
            return r0
    }

    private static android.content.Intent zzc(android.content.Intent r8, int r9, int r10) {
            r10 = r9 & 88
            r0 = 1
            r1 = 0
            if (r10 != 0) goto L8
            r10 = 1
            goto L9
        L8:
            r10 = 0
        L9:
            java.lang.String r2 = "Cannot set any dangerous parts of intent to be mutable."
            com.google.android.gms.internal.ads.zzfxz.zzf(r10, r2)
            r10 = r9 & 1
            r2 = 3
            if (r10 == 0) goto L1c
            boolean r10 = zzd(r1, r2)
            if (r10 == 0) goto L1a
            goto L1c
        L1a:
            r10 = 0
            goto L1d
        L1c:
            r10 = 1
        L1d:
            java.lang.String r3 = "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable."
            com.google.android.gms.internal.ads.zzfxz.zzf(r10, r3)
            r10 = r9 & 2
            r3 = 5
            if (r10 == 0) goto L30
            boolean r10 = zzd(r1, r3)
            if (r10 == 0) goto L2e
            goto L30
        L2e:
            r10 = 0
            goto L31
        L30:
            r10 = 1
        L31:
            java.lang.String r4 = "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable."
            com.google.android.gms.internal.ads.zzfxz.zzf(r10, r4)
            r10 = r9 & 4
            r4 = 9
            if (r10 == 0) goto L45
            boolean r10 = zzd(r1, r4)
            if (r10 == 0) goto L43
            goto L45
        L43:
            r10 = 0
            goto L46
        L45:
            r10 = 1
        L46:
            java.lang.String r5 = "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable."
            com.google.android.gms.internal.ads.zzfxz.zzf(r10, r5)
            r10 = r9 & 128(0x80, float:1.794E-43)
            r5 = 17
            if (r10 == 0) goto L5a
            boolean r10 = zzd(r1, r5)
            if (r10 == 0) goto L58
            goto L5a
        L58:
            r10 = 0
            goto L5b
        L5a:
            r10 = 1
        L5b:
            java.lang.String r6 = "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable."
            com.google.android.gms.internal.ads.zzfxz.zzf(r10, r6)
            android.content.ComponentName r10 = r8.getComponent()
            if (r10 == 0) goto L68
            r10 = 1
            goto L69
        L68:
            r10 = 0
        L69:
            java.lang.String r6 = "Must set component on Intent."
            com.google.android.gms.internal.ads.zzfxz.zzf(r10, r6)
            boolean r10 = zzd(r1, r0)
            r6 = 23
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            if (r10 == 0) goto L83
            boolean r10 = zzd(r9, r7)
            r10 = r10 ^ r0
            java.lang.String r0 = "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set."
            com.google.android.gms.internal.ads.zzfxz.zzf(r10, r0)
            goto L94
        L83:
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r6) goto L8f
            boolean r10 = zzd(r9, r7)
            if (r10 == 0) goto L8e
            goto L8f
        L8e:
            r0 = 0
        L8f:
            java.lang.String r10 = "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable."
            com.google.android.gms.internal.ads.zzfxz.zzf(r0, r10)
        L94:
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r6) goto La3
            boolean r8 = zzd(r9, r7)
            if (r8 != 0) goto Lf8
        La3:
            java.lang.String r8 = r10.getPackage()
            if (r8 != 0) goto Lb4
            android.content.ComponentName r8 = r10.getComponent()
            java.lang.String r8 = r8.getPackageName()
            r10.setPackage(r8)
        Lb4:
            boolean r8 = zzd(r1, r2)
            java.lang.String r9 = ""
            if (r8 != 0) goto Lc5
            java.lang.String r8 = r10.getAction()
            if (r8 != 0) goto Lc5
            r10.setAction(r9)
        Lc5:
            boolean r8 = zzd(r1, r4)
            if (r8 != 0) goto Ld4
            java.util.Set r8 = r10.getCategories()
            if (r8 != 0) goto Ld4
            r10.addCategory(r9)
        Ld4:
            boolean r8 = zzd(r1, r3)
            if (r8 != 0) goto Le7
            android.net.Uri r8 = r10.getData()
            if (r8 != 0) goto Le7
            android.net.Uri r8 = android.net.Uri.EMPTY
            java.lang.String r9 = "*/*"
            r10.setDataAndType(r8, r9)
        Le7:
            boolean r8 = zzd(r1, r5)
            if (r8 != 0) goto Lf8
            android.content.ClipData r8 = r10.getClipData()
            if (r8 != 0) goto Lf8
            android.content.ClipData r8 = com.google.android.gms.internal.ads.zzfuz.zzb
            r10.setClipData(r8)
        Lf8:
            return r10
    }

    private static boolean zzd(int r0, int r1) {
            r0 = r0 & r1
            if (r0 != r1) goto L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }
}
