package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes.dex */
public final class zzc {
    private static final java.lang.ClassLoader zza = null;

    static {
            java.lang.Class<com.google.android.gms.internal.auth-api-phone.zzc> r0 = com.google.android.gms.internal.p001authapiphone.zzc.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            com.google.android.gms.internal.p001authapiphone.zzc.zza = r0
            return
    }

    private zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.Parcelable zza(android.os.Parcel r1, android.os.Parcelable.Creator r2) {
            int r0 = r1.readInt()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.createFromParcel(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            return r1
    }

    public static void zzb(android.os.Parcel r3) {
            int r3 = r3.dataAvail()
            if (r3 > 0) goto L7
            return
        L7:
            android.os.BadParcelableException r0 = new android.os.BadParcelableException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Parcel data not fully consumed, unread size: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static void zzc(android.os.Parcel r0, android.os.IInterface r1) {
            android.os.IBinder r1 = r1.asBinder()
            r0.writeStrongBinder(r1)
            return
    }
}
