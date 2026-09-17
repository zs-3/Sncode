package com.googlecode.mp4parser.authoring.tracks.h265;

/* loaded from: classes2.dex */
public class H265TrackImpl extends com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack implements com.googlecode.mp4parser.authoring.tracks.h265.H265NalUnitTypes {
    java.util.ArrayList<java.nio.ByteBuffer> pps;
    java.util.ArrayList<com.googlecode.mp4parser.authoring.Sample> samples;
    java.util.ArrayList<java.nio.ByteBuffer> sps;
    com.coremedia.iso.boxes.SampleDescriptionBox stsd;
    java.util.ArrayList<java.nio.ByteBuffer> vps;

    public H265TrackImpl(com.googlecode.mp4parser.DataSource r11) throws java.io.IOException {
            r10 = this;
            r10.<init>(r11)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.sps = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.pps = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.vps = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.samples = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack$LookAhead r1 = new com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack$LookAhead
            r1.<init>(r11)
            r11 = 1
            boolean[] r2 = new boolean[r11]
            boolean[] r3 = new boolean[r11]
            r4 = 0
            r3[r4] = r11
        L31:
            java.nio.ByteBuffer r5 = r10.findNextNal(r1)
            if (r5 != 0) goto L58
            com.coremedia.iso.boxes.SampleDescriptionBox r11 = r10.createSampleDescriptionBox()
            r10.stsd = r11
            java.util.ArrayList<com.googlecode.mp4parser.authoring.Sample> r11 = r10.samples
            int r11 = r11.size()
            long[] r11 = new long[r11]
            r10.decodingTimes = r11
            com.googlecode.mp4parser.authoring.TrackMetaData r11 = r10.getTrackMetaData()
            r0 = 25
            r11.setTimescale(r0)
            long[] r11 = r10.decodingTimes
            r0 = 1
            java.util.Arrays.fill(r11, r0)
            return
        L58:
            com.googlecode.mp4parser.authoring.tracks.h265.H265NalUnitHeader r6 = getNalUnitHeader(r5)
            boolean r7 = r2[r4]
            r8 = 2
            if (r7 == 0) goto L7c
            boolean r7 = r10.isVcl(r6)
            if (r7 == 0) goto L73
            byte r7 = r5.get(r8)
            r7 = r7 & (-128(0xffffffffffffff80, float:NaN))
            if (r7 == 0) goto L7c
            r10.wrapUp(r0, r2, r3)
            goto L7c
        L73:
            int r7 = r6.nalUnitType
            switch(r7) {
                case 32: goto L79;
                case 33: goto L79;
                case 34: goto L79;
                case 35: goto L79;
                case 36: goto L79;
                case 37: goto L79;
                case 38: goto L78;
                case 39: goto L79;
                case 40: goto L78;
                case 41: goto L79;
                case 42: goto L79;
                case 43: goto L79;
                case 44: goto L79;
                case 45: goto L78;
                case 46: goto L78;
                case 47: goto L78;
                case 48: goto L79;
                case 49: goto L79;
                case 50: goto L79;
                case 51: goto L79;
                case 52: goto L79;
                case 53: goto L79;
                case 54: goto L79;
                case 55: goto L79;
                default: goto L78;
            }
        L78:
            goto L7c
        L79:
            r10.wrapUp(r0, r2, r3)
        L7c:
            int r7 = r6.nalUnitType
            r9 = 39
            if (r7 == r9) goto Ld7
            switch(r7) {
                case 32: goto Lc3;
                case 33: goto L9a;
                case 34: goto L86;
                default: goto L85;
            }
        L85:
            goto Le5
        L86:
            r5.position(r8)
            java.util.ArrayList<java.nio.ByteBuffer> r7 = r10.pps
            java.nio.ByteBuffer r8 = r5.slice()
            r7.add(r8)
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.String r8 = "Stored PPS"
            r7.println(r8)
            goto Le5
        L9a:
            r5.position(r8)
            java.util.ArrayList<java.nio.ByteBuffer> r7 = r10.sps
            java.nio.ByteBuffer r8 = r5.slice()
            r7.add(r8)
            r5.position(r11)
            com.googlecode.mp4parser.authoring.tracks.h265.SequenceParameterSetRbsp r7 = new com.googlecode.mp4parser.authoring.tracks.h265.SequenceParameterSetRbsp
            com.googlecode.mp4parser.util.ByteBufferByteChannel r8 = new com.googlecode.mp4parser.util.ByteBufferByteChannel
            java.nio.ByteBuffer r9 = r5.slice()
            r8.<init>(r9)
            java.io.InputStream r8 = java.nio.channels.Channels.newInputStream(r8)
            r7.<init>(r8)
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.String r8 = "Stored SPS"
            r7.println(r8)
            goto Le5
        Lc3:
            r5.position(r8)
            java.util.ArrayList<java.nio.ByteBuffer> r7 = r10.vps
            java.nio.ByteBuffer r8 = r5.slice()
            r7.add(r8)
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.String r8 = "Stored VPS"
            r7.println(r8)
            goto Le5
        Ld7:
            com.googlecode.mp4parser.authoring.tracks.h265.SEIMessage r7 = new com.googlecode.mp4parser.authoring.tracks.h265.SEIMessage
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r8 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            java.nio.ByteBuffer r9 = r5.slice()
            r8.<init>(r9)
            r7.<init>(r8)
        Le5:
            int r7 = r6.nalUnitType
            switch(r7) {
                case 32: goto L102;
                case 33: goto L102;
                case 34: goto L102;
                case 35: goto L102;
                case 36: goto L102;
                case 37: goto L102;
                case 38: goto L102;
                default: goto Lea;
            }
        Lea:
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Adding "
            r8.<init>(r9)
            int r9 = r6.nalUnitType
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.println(r8)
            r0.add(r5)
        L102:
            boolean r5 = r10.isVcl(r6)
            if (r5 == 0) goto L11a
            int r5 = r6.nalUnitType
            r7 = 19
            if (r5 == r7) goto L115
            r7 = 20
            if (r5 == r7) goto L115
            r3[r4] = r4
            goto L11a
        L115:
            boolean r5 = r3[r4]
            r5 = r5 & r11
            r3[r4] = r5
        L11a:
            boolean r5 = r2[r4]
            boolean r6 = r10.isVcl(r6)
            r5 = r5 | r6
            r2[r4] = r5
            goto L31
    }

    private com.coremedia.iso.boxes.SampleDescriptionBox createSampleDescriptionBox() {
            r9 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r0.<init>()
            r9.stsd = r0
            com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r0 = new com.coremedia.iso.boxes.sampleentry.VisualSampleEntry
            java.lang.String r1 = "hvc1"
            r0.<init>(r1)
            r1 = 1
            r0.setDataReferenceIndex(r1)
            r2 = 24
            r0.setDepth(r2)
            r0.setFrameCount(r1)
            r2 = 4634766966517661696(0x4052000000000000, double:72.0)
            r0.setHorizresolution(r2)
            r0.setVertresolution(r2)
            r2 = 640(0x280, float:8.97E-43)
            r0.setWidth(r2)
            r2 = 480(0x1e0, float:6.73E-43)
            r0.setHeight(r2)
            java.lang.String r2 = "HEVC Coding"
            r0.setCompressorname(r2)
            com.mp4parser.iso14496.part15.HevcConfigurationBox r2 = new com.mp4parser.iso14496.part15.HevcConfigurationBox
            r2.<init>()
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array r3 = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array
            r3.<init>()
            r3.array_completeness = r1
            r4 = 33
            r3.nal_unit_type = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.nalUnits = r4
            java.util.ArrayList<java.nio.ByteBuffer> r4 = r9.sps
            java.util.Iterator r4 = r4.iterator()
        L4e:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto Lcf
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array r5 = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array
            r5.<init>()
            r5.array_completeness = r1
            r6 = 34
            r5.nal_unit_type = r6
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5.nalUnits = r4
            java.util.ArrayList<java.nio.ByteBuffer> r4 = r9.pps
            java.util.Iterator r7 = r4.iterator()
        L6c:
            boolean r4 = r7.hasNext()
            if (r4 != 0) goto Lbf
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array r4 = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array
            r4.<init>()
            r4.array_completeness = r1
            r4.nal_unit_type = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.nalUnits = r6
            java.util.ArrayList<java.nio.ByteBuffer> r6 = r9.vps
            java.util.Iterator r8 = r6.iterator()
        L88:
            boolean r6 = r8.hasNext()
            if (r6 != 0) goto Laf
            java.util.List r6 = r2.getArrays()
            r7 = 3
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array[] r7 = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array[r7]
            r8 = 0
            r7[r8] = r3
            r7[r1] = r4
            r1 = 2
            r7[r1] = r5
            java.util.List r1 = java.util.Arrays.asList(r7)
            r6.addAll(r1)
            r0.addBox(r2)
            com.coremedia.iso.boxes.SampleDescriptionBox r1 = r9.stsd
            r1.addBox(r0)
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r9.stsd
            return r0
        Laf:
            java.lang.Object r6 = r8.next()
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.util.List<byte[]> r7 = r4.nalUnits
            byte[] r6 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.toArray(r6)
            r7.add(r6)
            goto L88
        Lbf:
            java.lang.Object r4 = r7.next()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            java.util.List<byte[]> r8 = r5.nalUnits
            byte[] r4 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.toArray(r4)
            r8.add(r4)
            goto L6c
        Lcf:
            java.lang.Object r5 = r4.next()
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            java.util.List<byte[]> r6 = r3.nalUnits
            byte[] r5 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.toArray(r5)
            r6.add(r5)
            goto L4e
    }

    public static com.googlecode.mp4parser.authoring.tracks.h265.H265NalUnitHeader getNalUnitHeader(java.nio.ByteBuffer r2) {
            r0 = 0
            r2.position(r0)
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            com.googlecode.mp4parser.authoring.tracks.h265.H265NalUnitHeader r0 = new com.googlecode.mp4parser.authoring.tracks.h265.H265NalUnitHeader
            r0.<init>()
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r2
            int r1 = r1 >> 15
            r0.forbiddenZeroFlag = r1
            r1 = r2 & 32256(0x7e00, float:4.52E-41)
            int r1 = r1 >> 9
            r0.nalUnitType = r1
            r1 = r2 & 504(0x1f8, float:7.06E-43)
            int r1 = r1 >> 3
            r0.nuhLayerId = r1
            r2 = r2 & 7
            r0.nuhTemporalIdPlusOne = r2
            return r0
    }

    public static void main(java.lang.String[] r2) throws java.io.IOException {
            com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImpl r2 = new com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImpl
            com.googlecode.mp4parser.FileDataSourceImpl r0 = new com.googlecode.mp4parser.FileDataSourceImpl
            java.lang.String r1 = "c:\\content\\test-UHD-HEVC_01_FMV_Med_track1.hvc"
            r0.<init>(r1)
            r2.<init>(r0)
            com.googlecode.mp4parser.authoring.Movie r0 = new com.googlecode.mp4parser.authoring.Movie
            r0.<init>()
            r0.addTrack(r2)
            com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder r2 = new com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder
            r2.<init>()
            com.coremedia.iso.boxes.Container r2 = r2.build(r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.lang.String r1 = "output.mp4"
            r0.<init>(r1)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            r2.writeContainer(r0)
            return
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = "vide"
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.ArrayList<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }

    boolean isVcl(com.googlecode.mp4parser.authoring.tracks.h265.H265NalUnitHeader r2) {
            r1 = this;
            int r2 = r2.nalUnitType
            if (r2 < 0) goto La
            r0 = 31
            if (r2 > r0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    public void wrapUp(java.util.List<java.nio.ByteBuffer> r4, boolean[] r5, boolean[] r6) {
            r3 = this;
            java.util.ArrayList<com.googlecode.mp4parser.authoring.Sample> r0 = r3.samples
            com.googlecode.mp4parser.authoring.Sample r1 = r3.createSampleObject(r4)
            r0.add(r1)
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Create AU from "
            r1.<init>(r2)
            int r2 = r4.size()
            r1.append(r2)
            java.lang.String r2 = " NALs"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            r0 = 0
            boolean r1 = r6[r0]
            if (r1 == 0) goto L32
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.String r2 = "  IDR"
            r1.println(r2)
            goto L37
        L32:
            java.io.PrintStream r1 = java.lang.System.err
            r1.println()
        L37:
            r5[r0] = r0
            r5 = 1
            r6[r0] = r5
            r4.clear()
            return
    }
}
