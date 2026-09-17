package com.google.android.gms.drive.metadata;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CustomPropertyKeyCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class CustomPropertyKey extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.CustomPropertyKey> CREATOR = null;
    public static final int PRIVATE = 1;
    public static final int PUBLIC = 0;
    private static final java.util.regex.Pattern zzja = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final int visibility;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final java.lang.String zziz;

    static {
            com.google.android.gms.drive.metadata.zzc r0 = new com.google.android.gms.drive.metadata.zzc
            r0.<init>()
            com.google.android.gms.drive.metadata.CustomPropertyKey.CREATOR = r0
            java.lang.String r0 = "[\\w.!@$%^&*()/-]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.drive.metadata.CustomPropertyKey.zzja = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public CustomPropertyKey(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "key"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            java.util.regex.Pattern r0 = com.google.android.gms.drive.metadata.CustomPropertyKey.zzja
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
            java.lang.String r1 = "key name characters must be alphanumeric or one of .!@$%^&*()-_/"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            r0 = 1
            if (r4 == 0) goto L1e
            if (r4 != r0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            java.lang.String r1 = "visibility must be either PUBLIC or PRIVATE"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            r2.zziz = r3
            r2.visibility = r4
            return
    }

    public static com.google.android.gms.drive.metadata.CustomPropertyKey fromJson(org.json.JSONObject r3) throws org.json.JSONException {
            com.google.android.gms.drive.metadata.CustomPropertyKey r0 = new com.google.android.gms.drive.metadata.CustomPropertyKey
            java.lang.String r1 = "key"
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r2 = "visibility"
            int r3 = r3.getInt(r2)
            r0.<init>(r1, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r4.getClass()
            if (r2 == r3) goto L12
            goto L29
        L12:
            com.google.android.gms.drive.metadata.CustomPropertyKey r5 = (com.google.android.gms.drive.metadata.CustomPropertyKey) r5
            java.lang.String r2 = r5.getKey()
            java.lang.String r3 = r4.zziz
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            int r5 = r5.getVisibility()
            int r2 = r4.visibility
            if (r5 != r2) goto L29
            return r0
        L29:
            return r1
    }

    public java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.zziz
            return r0
    }

    public int getVisibility() {
            r1 = this;
            int r0 = r1.visibility
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.zziz
            int r1 = r4.visibility
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + 11
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            int r0 = r0.hashCode()
            return r0
    }

    public org.json.JSONObject toJson() throws org.json.JSONException {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r3.getKey()
            java.lang.String r2 = "key"
            r0.put(r2, r1)
            int r1 = r3.getVisibility()
            java.lang.String r2 = "visibility"
            r0.put(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.zziz
            int r1 = r4.visibility
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + 31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "CustomPropertyKey("
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ","
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.zziz
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            int r0 = r3.visibility
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
