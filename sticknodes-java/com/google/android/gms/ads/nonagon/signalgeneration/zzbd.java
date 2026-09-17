package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbd {
    public final java.lang.String zza;
    public java.lang.String zzb;
    public com.google.android.gms.internal.ads.zzbwa zzc;
    public android.os.Bundle zzd;
    private long zze;
    private long zzf;

    public zzbd(android.util.JsonReader r8, com.google.android.gms.internal.ads.zzbwa r9) throws java.io.IOException {
            r7 = this;
            r7.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r7.zzd = r0
            r0 = -1
            r7.zze = r0
            r7.zzf = r0
            r7.zzc = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r8.beginObject()
            java.lang.String r0 = ""
            r1 = r0
        L1d:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L9b
            java.lang.String r2 = r8.nextName()
            if (r2 != 0) goto L2a
            r2 = r0
        L2a:
            int r3 = r2.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -1573145462: goto L53;
                case -995427962: goto L49;
                case -271442291: goto L3f;
                case 1725551537: goto L35;
                default: goto L34;
            }
        L34:
            goto L5d
        L35:
            java.lang.String r3 = "end_time"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5d
            r2 = 3
            goto L5e
        L3f:
            java.lang.String r3 = "signal_dictionary"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5d
            r2 = 1
            goto L5e
        L49:
            java.lang.String r3 = "params"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5d
            r2 = 0
            goto L5e
        L53:
            java.lang.String r3 = "start_time"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5d
            r2 = 2
            goto L5e
        L5d:
            r2 = -1
        L5e:
            if (r2 == 0) goto L96
            if (r2 == r6) goto L78
            if (r2 == r5) goto L71
            if (r2 == r4) goto L6a
            r8.skipValue()
            goto L1d
        L6a:
            long r2 = r8.nextLong()
            r7.zzf = r2
            goto L1d
        L71:
            long r2 = r8.nextLong()
            r7.zze = r2
            goto L1d
        L78:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r8.beginObject()
        L80:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L92
            java.lang.String r2 = r8.nextName()
            java.lang.String r3 = r8.nextString()
            r9.put(r2, r3)
            goto L80
        L92:
            r8.endObject()
            goto L1d
        L96:
            java.lang.String r1 = r8.nextString()
            goto L1d
        L9b:
            r7.zza = r1
            r8.endObject()
            java.util.Set r8 = r9.entrySet()
            java.util.Iterator r8 = r8.iterator()
        La8:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Ld2
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r0 = r9.getKey()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r9.getValue()
            if (r0 == 0) goto La8
            android.os.Bundle r0 = r7.zzd
            java.lang.Object r1 = r9.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            r0.putString(r1, r9)
            goto La8
        Ld2:
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzcf
            com.google.android.gms.internal.ads.zzbct r9 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r8 = r9.zza(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L106
            com.google.android.gms.internal.ads.zzbwa r8 = r7.zzc
            if (r8 == 0) goto L106
            android.os.Bundle r8 = r8.zzm
            if (r8 == 0) goto L106
            com.google.android.gms.internal.ads.zzdtm r9 = com.google.android.gms.internal.ads.zzdtm.zzh
            java.lang.String r9 = r9.zza()
            long r0 = r7.zze
            r8.putLong(r9, r0)
            com.google.android.gms.internal.ads.zzbwa r8 = r7.zzc
            android.os.Bundle r8 = r8.zzm
            com.google.android.gms.internal.ads.zzdtm r9 = com.google.android.gms.internal.ads.zzdtm.zzi
            java.lang.String r9 = r9.zza()
            long r0 = r7.zzf
            r8.putLong(r9, r0)
        L106:
            return
    }
}
