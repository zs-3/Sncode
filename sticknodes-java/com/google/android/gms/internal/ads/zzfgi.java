package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfgi {
    public final int zza;
    public final int zzb;
    public final boolean zzc;

    public zzfgi(int r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    static java.util.List zza(android.util.JsonReader r6) throws java.lang.IllegalStateException, java.io.IOException, java.lang.NumberFormatException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.beginArray()
        L8:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L55
            r6.beginObject()
            r1 = 0
            r2 = 0
            r3 = 0
        L14:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L49
            java.lang.String r4 = r6.nextName()
            java.lang.String r5 = "width"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L2b
            int r1 = r6.nextInt()
            goto L14
        L2b:
            java.lang.String r5 = "height"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L38
            int r2 = r6.nextInt()
            goto L14
        L38:
            java.lang.String r5 = "is_fluid_height"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L45
            boolean r3 = r6.nextBoolean()
            goto L14
        L45:
            r6.skipValue()
            goto L14
        L49:
            r6.endObject()
            com.google.android.gms.internal.ads.zzfgi r4 = new com.google.android.gms.internal.ads.zzfgi
            r4.<init>(r1, r2, r3)
            r0.add(r4)
            goto L8
        L55:
            r6.endArray()
            return r0
    }
}
