package androidx.room;

/* loaded from: classes.dex */
public class RoomMasterTable {
    public static java.lang.String createInsertQuery(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "')"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
