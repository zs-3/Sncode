package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdk {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = null;
    private static final java.lang.String[] zzc = null;

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [0, 0, 0, 1} // fill-array
            com.google.android.gms.internal.ads.zzdk.zzb = r0
            java.lang.String r0 = ""
            java.lang.String r1 = "A"
            java.lang.String r2 = "B"
            java.lang.String r3 = "C"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.google.android.gms.internal.ads.zzdk.zzc = r0
            return
    }

    public static java.lang.String zza(int r2, int r3, int r4) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 0
            r0[r1] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 1
            r0[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = "avc1.%02X%02X%02X"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    public static java.lang.String zzb(int r3, boolean r4, int r5, int r6, int[] r7, int r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String[] r2 = com.google.android.gms.internal.ads.zzdk.zzc
            r3 = r2[r3]
            r2 = 0
            r1[r2] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r5 = 1
            r1[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r6 = 2
            r1[r6] = r3
            if (r5 == r4) goto L1f
            r3 = 76
            goto L21
        L1f:
            r3 = 72
        L21:
            r4 = 3
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1[r4] = r3
            r3 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r1[r3] = r4
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = "hvc1.%s%d.%X.%c%d"
            java.lang.String r3 = java.lang.String.format(r3, r4, r1)
            r0.<init>(r3)
            r3 = 6
        L3b:
            if (r3 <= 0) goto L45
            int r4 = r3 + (-1)
            r6 = r7[r4]
            if (r6 != 0) goto L45
            r3 = r4
            goto L3b
        L45:
            r4 = 0
        L46:
            if (r4 >= r3) goto L5e
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r8 = r7[r4]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r2] = r8
            java.lang.String r8 = ".%02X"
            java.lang.String r6 = java.lang.String.format(r8, r6)
            r0.append(r6)
            int r4 = r4 + 1
            goto L46
        L5e:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static byte[] zzc(byte[] r4, int r5, int r6) {
            int r0 = r6 + 4
            byte[] r0 = new byte[r0]
            byte[] r1 = com.google.android.gms.internal.ads.zzdk.zzb
            r2 = 0
            r3 = 4
            java.lang.System.arraycopy(r1, r2, r0, r2, r3)
            java.lang.System.arraycopy(r4, r5, r0, r3, r6)
            return r0
    }
}
