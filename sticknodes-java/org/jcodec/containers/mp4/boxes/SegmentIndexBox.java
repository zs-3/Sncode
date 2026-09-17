package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class SegmentIndexBox extends org.jcodec.containers.mp4.boxes.FullBox {
    public long earliest_presentation_time;
    public long first_offset;
    public long reference_ID;
    public int reference_count;
    public org.jcodec.containers.mp4.boxes.SegmentIndexBox.Reference[] references;
    public int reserved;
    public long timescale;

    public static class Reference {
        public long SAP_delta_time;
        public int SAP_type;
        public boolean reference_type;
        public long referenced_size;
        public boolean starts_with_SAP;
        public long subsegment_duration;

        public Reference() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r11 = this;
                boolean r0 = r11.reference_type
                long r1 = r11.referenced_size
                long r3 = r11.subsegment_duration
                boolean r5 = r11.starts_with_SAP
                int r6 = r11.SAP_type
                long r7 = r11.SAP_delta_time
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "Reference [reference_type="
                r9.append(r10)
                r9.append(r0)
                java.lang.String r0 = ", referenced_size="
                r9.append(r0)
                r9.append(r1)
                java.lang.String r0 = ", subsegment_duration="
                r9.append(r0)
                r9.append(r3)
                java.lang.String r0 = ", starts_with_SAP="
                r9.append(r0)
                r9.append(r5)
                java.lang.String r0 = ", SAP_type="
                r9.append(r0)
                r9.append(r6)
                java.lang.String r0 = ", SAP_delta_time="
                r9.append(r0)
                r9.append(r7)
                java.lang.String r0 = "]"
                r9.append(r0)
                java.lang.String r0 = r9.toString()
                return r0
        }
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "sidx"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r12) {
            r11 = this;
            super.doWrite(r12)
            long r0 = r11.reference_ID
            int r1 = (int) r0
            r12.putInt(r1)
            long r0 = r11.timescale
            int r1 = (int) r0
            r12.putInt(r1)
            byte r0 = r11.version
            if (r0 != 0) goto L20
            long r0 = r11.earliest_presentation_time
            int r1 = (int) r0
            r12.putInt(r1)
            long r0 = r11.first_offset
            int r1 = (int) r0
            r12.putInt(r1)
            goto L2a
        L20:
            long r0 = r11.earliest_presentation_time
            r12.putLong(r0)
            long r0 = r11.first_offset
            r12.putLong(r0)
        L2a:
            int r0 = r11.reserved
            short r0 = (short) r0
            r12.putShort(r0)
            int r0 = r11.reference_count
            short r0 = (short) r0
            r12.putShort(r0)
            r0 = 0
            r1 = 0
        L38:
            int r2 = r11.reference_count
            if (r1 >= r2) goto L70
            org.jcodec.containers.mp4.boxes.SegmentIndexBox$Reference[] r2 = r11.references
            r2 = r2[r1]
            boolean r3 = r2.reference_type
            int r3 = r3 << 31
            long r3 = (long) r3
            long r5 = r2.referenced_size
            long r3 = r3 | r5
            int r4 = (int) r3
            long r5 = r2.subsegment_duration
            int r3 = (int) r5
            boolean r5 = r2.starts_with_SAP
            if (r5 == 0) goto L53
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L54
        L53:
            r5 = 0
        L54:
            int r6 = r2.SAP_type
            r6 = r6 & 7
            int r6 = r6 << 28
            r5 = r5 | r6
            long r5 = (long) r5
            long r7 = r2.SAP_delta_time
            r9 = 268435455(0xfffffff, double:1.326247364E-315)
            long r7 = r7 & r9
            long r5 = r5 | r7
            int r2 = (int) r5
            r12.putInt(r4)
            r12.putInt(r3)
            r12.putInt(r2)
            int r1 = r1 + 1
            goto L38
        L70:
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r20) {
            r19 = this;
            r0 = r19
            super.parse(r20)
            int r1 = r20.getInt()
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r0.reference_ID = r1
            int r1 = r20.getInt()
            long r1 = (long) r1
            long r1 = r1 & r3
            r0.timescale = r1
            byte r1 = r0.version
            if (r1 != 0) goto L2f
            int r1 = r20.getInt()
            long r1 = (long) r1
            long r1 = r1 & r3
            r0.earliest_presentation_time = r1
            int r1 = r20.getInt()
            long r1 = (long) r1
            long r1 = r1 & r3
            r0.first_offset = r1
            goto L3b
        L2f:
            long r1 = r20.getLong()
            r0.earliest_presentation_time = r1
            long r1 = r20.getLong()
            r0.first_offset = r1
        L3b:
            short r1 = r20.getShort()
            r0.reserved = r1
            short r1 = r20.getShort()
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            r0.reference_count = r1
            org.jcodec.containers.mp4.boxes.SegmentIndexBox$Reference[] r1 = new org.jcodec.containers.mp4.boxes.SegmentIndexBox.Reference[r1]
            r0.references = r1
            r1 = 0
            r2 = 0
        L51:
            int r5 = r0.reference_count
            if (r2 >= r5) goto La7
            int r5 = r20.getInt()
            long r5 = (long) r5
            long r5 = r5 & r3
            int r7 = r20.getInt()
            long r7 = (long) r7
            long r7 = r7 & r3
            int r9 = r20.getInt()
            long r9 = (long) r9
            long r9 = r9 & r3
            org.jcodec.containers.mp4.boxes.SegmentIndexBox$Reference r11 = new org.jcodec.containers.mp4.boxes.SegmentIndexBox$Reference
            r11.<init>()
            r12 = 31
            long r13 = r5 >> r12
            r15 = 1
            r17 = 1
            int r18 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r18 != 0) goto L7a
            r13 = 1
            goto L7b
        L7a:
            r13 = 0
        L7b:
            r11.reference_type = r13
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r5 = r5 & r13
            r11.referenced_size = r5
            r11.subsegment_duration = r7
            long r5 = r9 >> r12
            int r7 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r7 != 0) goto L8d
            r5 = 1
            goto L8e
        L8d:
            r5 = 0
        L8e:
            r11.starts_with_SAP = r5
            r5 = 28
            long r5 = r9 >> r5
            r7 = 7
            long r5 = r5 & r7
            int r6 = (int) r5
            r11.SAP_type = r6
            r5 = 268435455(0xfffffff, double:1.326247364E-315)
            long r5 = r5 & r9
            r11.SAP_delta_time = r5
            org.jcodec.containers.mp4.boxes.SegmentIndexBox$Reference[] r5 = r0.references
            r5[r2] = r11
            int r2 = r2 + 1
            goto L51
        La7:
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public java.lang.String toString() {
            r16 = this;
            r0 = r16
            long r1 = r0.reference_ID
            long r3 = r0.timescale
            long r5 = r0.earliest_presentation_time
            long r7 = r0.first_offset
            int r9 = r0.reserved
            int r10 = r0.reference_count
            org.jcodec.containers.mp4.boxes.SegmentIndexBox$Reference[] r11 = r0.references
            java.lang.String r11 = org.jcodec.platform.Platform.arrayToString(r11)
            byte r12 = r0.version
            int r13 = r0.flags
            org.jcodec.containers.mp4.boxes.Header r14 = r0.header
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "SegmentIndexBox [reference_ID="
            r15.append(r0)
            r15.append(r1)
            java.lang.String r0 = ", timescale="
            r15.append(r0)
            r15.append(r3)
            java.lang.String r0 = ", earliest_presentation_time="
            r15.append(r0)
            r15.append(r5)
            java.lang.String r0 = ", first_offset="
            r15.append(r0)
            r15.append(r7)
            java.lang.String r0 = ", reserved="
            r15.append(r0)
            r15.append(r9)
            java.lang.String r0 = ", reference_count="
            r15.append(r0)
            r15.append(r10)
            java.lang.String r0 = ", references="
            r15.append(r0)
            r15.append(r11)
            java.lang.String r0 = ", version="
            r15.append(r0)
            r15.append(r12)
            java.lang.String r0 = ", flags="
            r15.append(r0)
            r15.append(r13)
            java.lang.String r0 = ", header="
            r15.append(r0)
            r15.append(r14)
            java.lang.String r0 = "]"
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            return r0
    }
}
