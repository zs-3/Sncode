package com.google.android.gms.fido.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public enum Transport extends java.lang.Enum<com.google.android.gms.fido.common.Transport> implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final com.google.android.gms.fido.common.Transport BLUETOOTH_CLASSIC = null;
    public static final com.google.android.gms.fido.common.Transport BLUETOOTH_LOW_ENERGY = null;
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.common.Transport> CREATOR = null;
    public static final com.google.android.gms.fido.common.Transport HYBRID = null;
    public static final com.google.android.gms.fido.common.Transport INTERNAL = null;
    public static final com.google.android.gms.fido.common.Transport NFC = null;
    public static final com.google.android.gms.fido.common.Transport USB = null;
    private static final /* synthetic */ com.google.android.gms.fido.common.Transport[] zza = null;
    private final java.lang.String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedTransportException extends java.lang.Exception {
        public UnsupportedTransportException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            com.google.android.gms.fido.common.Transport r0 = new com.google.android.gms.fido.common.Transport
            java.lang.String r1 = "BLUETOOTH_CLASSIC"
            r2 = 0
            java.lang.String r3 = "bt"
            r0.<init>(r1, r2, r3)
            com.google.android.gms.fido.common.Transport.BLUETOOTH_CLASSIC = r0
            com.google.android.gms.fido.common.Transport r1 = new com.google.android.gms.fido.common.Transport
            java.lang.String r3 = "BLUETOOTH_LOW_ENERGY"
            r4 = 1
            java.lang.String r5 = "ble"
            r1.<init>(r3, r4, r5)
            com.google.android.gms.fido.common.Transport.BLUETOOTH_LOW_ENERGY = r1
            com.google.android.gms.fido.common.Transport r3 = new com.google.android.gms.fido.common.Transport
            java.lang.String r5 = "NFC"
            r6 = 2
            java.lang.String r7 = "nfc"
            r3.<init>(r5, r6, r7)
            com.google.android.gms.fido.common.Transport.NFC = r3
            com.google.android.gms.fido.common.Transport r5 = new com.google.android.gms.fido.common.Transport
            java.lang.String r7 = "USB"
            r8 = 3
            java.lang.String r9 = "usb"
            r5.<init>(r7, r8, r9)
            com.google.android.gms.fido.common.Transport.USB = r5
            com.google.android.gms.fido.common.Transport r7 = new com.google.android.gms.fido.common.Transport
            java.lang.String r9 = "INTERNAL"
            r10 = 4
            java.lang.String r11 = "internal"
            r7.<init>(r9, r10, r11)
            com.google.android.gms.fido.common.Transport.INTERNAL = r7
            com.google.android.gms.fido.common.Transport r9 = new com.google.android.gms.fido.common.Transport
            java.lang.String r11 = "HYBRID"
            r12 = 5
            java.lang.String r13 = "cable"
            r9.<init>(r11, r12, r13)
            com.google.android.gms.fido.common.Transport.HYBRID = r9
            r11 = 6
            com.google.android.gms.fido.common.Transport[] r11 = new com.google.android.gms.fido.common.Transport[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.google.android.gms.fido.common.Transport.zza = r11
            com.google.android.gms.fido.common.zza r0 = new com.google.android.gms.fido.common.zza
            r0.<init>()
            com.google.android.gms.fido.common.Transport.CREATOR = r0
            return
    }

    Transport(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzb = r3
            return
    }

    public static com.google.android.gms.fido.common.Transport fromString(java.lang.String r6) throws com.google.android.gms.fido.common.Transport.UnsupportedTransportException {
            com.google.android.gms.fido.common.Transport[] r0 = values()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L7:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            java.lang.String r5 = r4.zzb
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L14
            return r4
        L14:
            int r3 = r3 + 1
            goto L7
        L17:
            java.lang.String r0 = "hybrid"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L22
            com.google.android.gms.fido.common.Transport r6 = com.google.android.gms.fido.common.Transport.HYBRID
            return r6
        L22:
            com.google.android.gms.fido.common.Transport$UnsupportedTransportException r0 = new com.google.android.gms.fido.common.Transport$UnsupportedTransportException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            java.lang.String r6 = "Transport %s not supported"
            java.lang.String r6 = java.lang.String.format(r6, r1)
            r0.<init>(r6)
            throw r0
    }

    public static java.util.List<com.google.android.gms.fido.common.Transport> parseTransports(org.json.JSONArray r4) throws org.json.JSONException {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.util.HashSet r0 = new java.util.HashSet
            int r1 = r4.length()
            r0.<init>(r1)
            r1 = 0
        Le:
            int r2 = r4.length()
            if (r1 >= r2) goto L36
            java.lang.String r2 = r4.getString(r1)
            if (r2 == 0) goto L33
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L33
            com.google.android.gms.fido.common.Transport r3 = fromString(r2)     // Catch: com.google.android.gms.fido.common.Transport.UnsupportedTransportException -> L28
            r0.add(r3)     // Catch: com.google.android.gms.fido.common.Transport.UnsupportedTransportException -> L28
            goto L33
        L28:
            java.lang.String r3 = "Ignoring unrecognized transport "
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "Transport"
            android.util.Log.w(r3, r2)
        L33:
            int r1 = r1 + 1
            goto Le
        L36:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            return r4
    }

    public static com.google.android.gms.fido.common.Transport valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.fido.common.Transport> r0 = com.google.android.gms.fido.common.Transport.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.gms.fido.common.Transport r1 = (com.google.android.gms.fido.common.Transport) r1
            return r1
    }

    public static com.google.android.gms.fido.common.Transport[] values() {
            com.google.android.gms.fido.common.Transport[] r0 = com.google.android.gms.fido.common.Transport.zza
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.fido.common.Transport[] r0 = (com.google.android.gms.fido.common.Transport[]) r0
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.zzb
            r1.writeString(r2)
            return
    }
}
