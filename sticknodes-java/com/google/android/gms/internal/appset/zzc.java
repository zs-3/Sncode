package com.google.android.gms.internal.appset;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public final class zzc {
    private static final java.lang.ClassLoader zza = null;

    static {
            java.lang.Class<com.google.android.gms.internal.appset.zzc> r0 = com.google.android.gms.internal.appset.zzc.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            com.google.android.gms.internal.appset.zzc.zza = r0
            return
    }

    private zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends android.os.Parcelable> T zza(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
            int r0 = r1.readInt()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.createFromParcel(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            return r1
    }

    public static void zzb(android.os.Parcel r1, android.os.Parcelable r2) {
            r0 = 1
            r1.writeInt(r0)
            r0 = 0
            r2.writeToParcel(r1, r0)
            return
    }

    public static void zzc(android.os.Parcel r0, android.os.IInterface r1) {
            r0.writeStrongBinder(r1)
            return
    }
}
