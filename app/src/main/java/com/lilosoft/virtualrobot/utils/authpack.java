package com.lilosoft.virtualrobot.utils;

import java.security.MessageDigest;

public class authpack {

    public static int sha1_32(byte[] buf) {
        int ret = 0;
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(buf);
            return ((int) (digest[0] & 0xff) << 24) + ((int) (digest[1] & 0xff) << 16) + ((int) (digest[2] & 0xff) << 8) + ((int) (digest[3] & 0xff) << 0);
        } catch (Exception e) {
        }
        return ret;
    }


    public static byte[] A() {
        byte[] buf = new byte[1184];
        int i = 0;
        for (i = -97; i < -86; i++) {
            buf[0] = (byte) i;
            if (sha1_32(buf) == -1930493707) {
                break;
            }
        }
        for (i = -58; i < -47; i++) {
            buf[1] = (byte) i;
            if (sha1_32(buf) == -452545756) {
                break;
            }
        }
        for (i = -85; i < -71; i++) {
            buf[2] = (byte) i;
            if (sha1_32(buf) == -930231013) {
                break;
            }
        }
        for (i = -40; i < -24; i++) {
            buf[3] = (byte) i;
            if (sha1_32(buf) == 333772810) {
                break;
            }
        }
        for (i = 78; i < 98; i++) {
            buf[4] = (byte) i;
            if (sha1_32(buf) == -265086137) {
                break;
            }
        }
        for (i = 46; i < 76; i++) {
            buf[5] = (byte) i;
            if (sha1_32(buf) == 128983607) {
                break;
            }
        }
        for (i = 28; i < 52; i++) {
            buf[6] = (byte) i;
            if (sha1_32(buf) == -981975473) {
                break;
            }
        }
        for (i = 124; i < 128; i++) {
            buf[7] = (byte) i;
            if (sha1_32(buf) == 2127127268) {
                break;
            }
        }
        for (i = 66; i < 76; i++) {
            buf[8] = (byte) i;
            if (sha1_32(buf) == -1473451897) {
                break;
            }
        }
        for (i = -89; i < -59; i++) {
            buf[9] = (byte) i;
            if (sha1_32(buf) == -1239832480) {
                break;
            }
        }
        for (i = 88; i < 104; i++) {
            buf[10] = (byte) i;
            if (sha1_32(buf) == -161811649) {
                break;
            }
        }
        for (i = -52; i < -29; i++) {
            buf[11] = (byte) i;
            if (sha1_32(buf) == -893400179) {
                break;
            }
        }
        for (i = 25; i < 41; i++) {
            buf[12] = (byte) i;
            if (sha1_32(buf) == -1382879225) {
                break;
            }
        }
        for (i = 66; i < 91; i++) {
            buf[13] = (byte) i;
            if (sha1_32(buf) == 134106246) {
                break;
            }
        }
        for (i = -20; i < 0; i++) {
            buf[14] = (byte) i;
            if (sha1_32(buf) == 1952624107) {
                break;
            }
        }
        for (i = 87; i < 98; i++) {
            buf[15] = (byte) i;
            if (sha1_32(buf) == 688155268) {
                break;
            }
        }
        for (i = -21; i < -11; i++) {
            buf[16] = (byte) i;
            if (sha1_32(buf) == 53540710) {
                break;
            }
        }
        for (i = 22; i < 41; i++) {
            buf[17] = (byte) i;
            if (sha1_32(buf) == -1513156717) {
                break;
            }
        }
        for (i = 28; i < 34; i++) {
            buf[18] = (byte) i;
            if (sha1_32(buf) == -1638211519) {
                break;
            }
        }
        for (i = -115; i < -106; i++) {
            buf[19] = (byte) i;
            if (sha1_32(buf) == 926327341) {
                break;
            }
        }
        for (i = 87; i < 111; i++) {
            buf[20] = (byte) i;
            if (sha1_32(buf) == -1836656654) {
                break;
            }
        }
        for (i = 92; i < 107; i++) {
            buf[21] = (byte) i;
            if (sha1_32(buf) == -903886216) {
                break;
            }
        }
        for (i = -67; i < -52; i++) {
            buf[22] = (byte) i;
            if (sha1_32(buf) == -1918833486) {
                break;
            }
        }
        for (i = 48; i < 64; i++) {
            buf[23] = (byte) i;
            if (sha1_32(buf) == 1667704938) {
                break;
            }
        }
        for (i = 111; i < 128; i++) {
            buf[24] = (byte) i;
            if (sha1_32(buf) == -1591358235) {
                break;
            }
        }
        for (i = -74; i < -61; i++) {
            buf[25] = (byte) i;
            if (sha1_32(buf) == -997194057) {
                break;
            }
        }
        for (i = -128; i < -112; i++) {
            buf[26] = (byte) i;
            if (sha1_32(buf) == -2085330148) {
                break;
            }
        }
        for (i = -3; i < 14; i++) {
            buf[27] = (byte) i;
            if (sha1_32(buf) == 2045049082) {
                break;
            }
        }
        for (i = -6; i < -2; i++) {
            buf[28] = (byte) i;
            if (sha1_32(buf) == 921948681) {
                break;
            }
        }
        for (i = -71; i < -58; i++) {
            buf[29] = (byte) i;
            if (sha1_32(buf) == 252050142) {
                break;
            }
        }
        for (i = -94; i < -87; i++) {
            buf[30] = (byte) i;
            if (sha1_32(buf) == 218047676) {
                break;
            }
        }
        for (i = 6; i < 15; i++) {
            buf[31] = (byte) i;
            if (sha1_32(buf) == -1876544779) {
                break;
            }
        }
        for (i = 68; i < 92; i++) {
            buf[32] = (byte) i;
            if (sha1_32(buf) == -1208090803) {
                break;
            }
        }
        for (i = -32; i < -17; i++) {
            buf[33] = (byte) i;
            if (sha1_32(buf) == 1740147823) {
                break;
            }
        }
        for (i = -17; i < 1; i++) {
            buf[34] = (byte) i;
            if (sha1_32(buf) == -1790665467) {
                break;
            }
        }
        for (i = -128; i < -124; i++) {
            buf[35] = (byte) i;
            if (sha1_32(buf) == 1841734939) {
                break;
            }
        }
        for (i = 47; i < 57; i++) {
            buf[36] = (byte) i;
            if (sha1_32(buf) == -158411320) {
                break;
            }
        }
        for (i = -59; i < -53; i++) {
            buf[37] = (byte) i;
            if (sha1_32(buf) == -1168526884) {
                break;
            }
        }
        for (i = -4; i < 11; i++) {
            buf[38] = (byte) i;
            if (sha1_32(buf) == 1602271939) {
                break;
            }
        }
        for (i = 78; i < 85; i++) {
            buf[39] = (byte) i;
            if (sha1_32(buf) == -1168546495) {
                break;
            }
        }
        for (i = -10; i < 4; i++) {
            buf[40] = (byte) i;
            if (sha1_32(buf) == -840895842) {
                break;
            }
        }
        for (i = 66; i < 86; i++) {
            buf[41] = (byte) i;
            if (sha1_32(buf) == 1187362745) {
                break;
            }
        }
        for (i = 57; i < 78; i++) {
            buf[42] = (byte) i;
            if (sha1_32(buf) == 938545288) {
                break;
            }
        }
        for (i = 115; i < 125; i++) {
            buf[43] = (byte) i;
            if (sha1_32(buf) == -1455989816) {
                break;
            }
        }
        for (i = 12; i < 34; i++) {
            buf[44] = (byte) i;
            if (sha1_32(buf) == 223777206) {
                break;
            }
        }
        for (i = 34; i < 35; i++) {
            buf[45] = (byte) i;
            if (sha1_32(buf) == -359374355) {
                break;
            }
        }
        for (i = 87; i < 109; i++) {
            buf[46] = (byte) i;
            if (sha1_32(buf) == -1560177197) {
                break;
            }
        }
        for (i = 78; i < 96; i++) {
            buf[47] = (byte) i;
            if (sha1_32(buf) == 358335362) {
                break;
            }
        }
        for (i = -64; i < -46; i++) {
            buf[48] = (byte) i;
            if (sha1_32(buf) == 556187285) {
                break;
            }
        }
        for (i = 14; i < 26; i++) {
            buf[49] = (byte) i;
            if (sha1_32(buf) == -1453363122) {
                break;
            }
        }
        for (i = -121; i < -107; i++) {
            buf[50] = (byte) i;
            if (sha1_32(buf) == 256542620) {
                break;
            }
        }
        for (i = -128; i < -116; i++) {
            buf[51] = (byte) i;
            if (sha1_32(buf) == 1753270457) {
                break;
            }
        }
        for (i = 37; i < 61; i++) {
            buf[52] = (byte) i;
            if (sha1_32(buf) == 1511907807) {
                break;
            }
        }
        for (i = 15; i < 39; i++) {
            buf[53] = (byte) i;
            if (sha1_32(buf) == 1264935536) {
                break;
            }
        }
        for (i = -103; i < -94; i++) {
            buf[54] = (byte) i;
            if (sha1_32(buf) == -758780451) {
                break;
            }
        }
        for (i = 102; i < 128; i++) {
            buf[55] = (byte) i;
            if (sha1_32(buf) == 1839801255) {
                break;
            }
        }
        for (i = 90; i < 115; i++) {
            buf[56] = (byte) i;
            if (sha1_32(buf) == -1992326621) {
                break;
            }
        }
        for (i = 32; i < 56; i++) {
            buf[57] = (byte) i;
            if (sha1_32(buf) == -1062409446) {
                break;
            }
        }
        for (i = 12; i < 34; i++) {
            buf[58] = (byte) i;
            if (sha1_32(buf) == -860196223) {
                break;
            }
        }
        for (i = -117; i < -104; i++) {
            buf[59] = (byte) i;
            if (sha1_32(buf) == 1978073788) {
                break;
            }
        }
        for (i = -30; i < -12; i++) {
            buf[60] = (byte) i;
            if (sha1_32(buf) == 1802166323) {
                break;
            }
        }
        for (i = -82; i < -59; i++) {
            buf[61] = (byte) i;
            if (sha1_32(buf) == -59550196) {
                break;
            }
        }
        for (i = -90; i < -75; i++) {
            buf[62] = (byte) i;
            if (sha1_32(buf) == 1128321166) {
                break;
            }
        }
        for (i = 122; i < 128; i++) {
            buf[63] = (byte) i;
            if (sha1_32(buf) == 426525301) {
                break;
            }
        }
        for (i = 37; i < 52; i++) {
            buf[64] = (byte) i;
            if (sha1_32(buf) == -1333184252) {
                break;
            }
        }
        for (i = -11; i < -7; i++) {
            buf[65] = (byte) i;
            if (sha1_32(buf) == 1727229142) {
                break;
            }
        }
        for (i = 77; i < 85; i++) {
            buf[66] = (byte) i;
            if (sha1_32(buf) == 391330114) {
                break;
            }
        }
        for (i = 67; i < 95; i++) {
            buf[67] = (byte) i;
            if (sha1_32(buf) == 93748275) {
                break;
            }
        }
        for (i = -116; i < -97; i++) {
            buf[68] = (byte) i;
            if (sha1_32(buf) == 2095537293) {
                break;
            }
        }
        for (i = 83; i < 99; i++) {
            buf[69] = (byte) i;
            if (sha1_32(buf) == -1306776366) {
                break;
            }
        }
        for (i = -98; i < -76; i++) {
            buf[70] = (byte) i;
            if (sha1_32(buf) == -27257224) {
                break;
            }
        }
        for (i = -86; i < -75; i++) {
            buf[71] = (byte) i;
            if (sha1_32(buf) == 1395926205) {
                break;
            }
        }
        for (i = -39; i < -29; i++) {
            buf[72] = (byte) i;
            if (sha1_32(buf) == -1388051238) {
                break;
            }
        }
        for (i = -52; i < -35; i++) {
            buf[73] = (byte) i;
            if (sha1_32(buf) == -1328172236) {
                break;
            }
        }
        for (i = -77; i < -57; i++) {
            buf[74] = (byte) i;
            if (sha1_32(buf) == -1187319967) {
                break;
            }
        }
        for (i = -34; i < -19; i++) {
            buf[75] = (byte) i;
            if (sha1_32(buf) == 95271987) {
                break;
            }
        }
        for (i = -53; i < -43; i++) {
            buf[76] = (byte) i;
            if (sha1_32(buf) == 2069633152) {
                break;
            }
        }
        for (i = 56; i < 73; i++) {
            buf[77] = (byte) i;
            if (sha1_32(buf) == 1238897287) {
                break;
            }
        }
        for (i = -93; i < -71; i++) {
            buf[78] = (byte) i;
            if (sha1_32(buf) == 710385230) {
                break;
            }
        }
        for (i = 109; i < 128; i++) {
            buf[79] = (byte) i;
            if (sha1_32(buf) == 382252965) {
                break;
            }
        }
        for (i = -87; i < -83; i++) {
            buf[80] = (byte) i;
            if (sha1_32(buf) == -1872338820) {
                break;
            }
        }
        for (i = -77; i < -62; i++) {
            buf[81] = (byte) i;
            if (sha1_32(buf) == 1770457483) {
                break;
            }
        }
        for (i = -128; i < -116; i++) {
            buf[82] = (byte) i;
            if (sha1_32(buf) == 641559605) {
                break;
            }
        }
        for (i = -19; i < -17; i++) {
            buf[83] = (byte) i;
            if (sha1_32(buf) == -575646065) {
                break;
            }
        }
        for (i = 92; i < 112; i++) {
            buf[84] = (byte) i;
            if (sha1_32(buf) == 1568973568) {
                break;
            }
        }
        for (i = 127; i < 128; i++) {
            buf[85] = (byte) i;
            if (sha1_32(buf) == -1728835115) {
                break;
            }
        }
        for (i = -33; i < -14; i++) {
            buf[86] = (byte) i;
            if (sha1_32(buf) == 2143652227) {
                break;
            }
        }
        for (i = 46; i < 56; i++) {
            buf[87] = (byte) i;
            if (sha1_32(buf) == 721087995) {
                break;
            }
        }
        for (i = -5; i < 18; i++) {
            buf[88] = (byte) i;
            if (sha1_32(buf) == -501094621) {
                break;
            }
        }
        for (i = 38; i < 53; i++) {
            buf[89] = (byte) i;
            if (sha1_32(buf) == 416196824) {
                break;
            }
        }
        for (i = -95; i < -71; i++) {
            buf[90] = (byte) i;
            if (sha1_32(buf) == -879210312) {
                break;
            }
        }
        for (i = 65; i < 81; i++) {
            buf[91] = (byte) i;
            if (sha1_32(buf) == 466701849) {
                break;
            }
        }
        for (i = -86; i < -69; i++) {
            buf[92] = (byte) i;
            if (sha1_32(buf) == 1011189201) {
                break;
            }
        }
        for (i = 106; i < 113; i++) {
            buf[93] = (byte) i;
            if (sha1_32(buf) == 1825305230) {
                break;
            }
        }
        for (i = -10; i < -5; i++) {
            buf[94] = (byte) i;
            if (sha1_32(buf) == -489405421) {
                break;
            }
        }
        for (i = -28; i < -17; i++) {
            buf[95] = (byte) i;
            if (sha1_32(buf) == 427630776) {
                break;
            }
        }
        for (i = -94; i < -71; i++) {
            buf[96] = (byte) i;
            if (sha1_32(buf) == -1344058241) {
                break;
            }
        }
        for (i = -8; i < 12; i++) {
            buf[97] = (byte) i;
            if (sha1_32(buf) == 550552868) {
                break;
            }
        }
        for (i = -126; i < -98; i++) {
            buf[98] = (byte) i;
            if (sha1_32(buf) == 1123502277) {
                break;
            }
        }
        for (i = 80; i < 99; i++) {
            buf[99] = (byte) i;
            if (sha1_32(buf) == 1995880554) {
                break;
            }
        }
        for (i = 87; i < 97; i++) {
            buf[100] = (byte) i;
            if (sha1_32(buf) == -800127511) {
                break;
            }
        }
        for (i = 36; i < 50; i++) {
            buf[101] = (byte) i;
            if (sha1_32(buf) == -1399605270) {
                break;
            }
        }
        for (i = 28; i < 53; i++) {
            buf[102] = (byte) i;
            if (sha1_32(buf) == -683702836) {
                break;
            }
        }
        for (i = -89; i < -73; i++) {
            buf[103] = (byte) i;
            if (sha1_32(buf) == -1556377259) {
                break;
            }
        }
        for (i = 110; i < 120; i++) {
            buf[104] = (byte) i;
            if (sha1_32(buf) == -185851986) {
                break;
            }
        }
        for (i = -78; i < -66; i++) {
            buf[105] = (byte) i;
            if (sha1_32(buf) == 263512340) {
                break;
            }
        }
        for (i = -52; i < -43; i++) {
            buf[106] = (byte) i;
            if (sha1_32(buf) == 57123843) {
                break;
            }
        }
        for (i = -104; i < -93; i++) {
            buf[107] = (byte) i;
            if (sha1_32(buf) == -1341449169) {
                break;
            }
        }
        for (i = -38; i < -25; i++) {
            buf[108] = (byte) i;
            if (sha1_32(buf) == 1421244344) {
                break;
            }
        }
        for (i = -4; i < 22; i++) {
            buf[109] = (byte) i;
            if (sha1_32(buf) == 1889147911) {
                break;
            }
        }
        for (i = -82; i < -65; i++) {
            buf[110] = (byte) i;
            if (sha1_32(buf) == 452927892) {
                break;
            }
        }
        for (i = -102; i < -86; i++) {
            buf[111] = (byte) i;
            if (sha1_32(buf) == -1114065920) {
                break;
            }
        }
        for (i = 42; i < 46; i++) {
            buf[112] = (byte) i;
            if (sha1_32(buf) == -1284180850) {
                break;
            }
        }
        for (i = -128; i < -109; i++) {
            buf[113] = (byte) i;
            if (sha1_32(buf) == -1634132049) {
                break;
            }
        }
        for (i = -8; i < 4; i++) {
            buf[114] = (byte) i;
            if (sha1_32(buf) == -263588493) {
                break;
            }
        }
        for (i = 37; i < 57; i++) {
            buf[115] = (byte) i;
            if (sha1_32(buf) == -1979098218) {
                break;
            }
        }
        for (i = -70; i < -52; i++) {
            buf[116] = (byte) i;
            if (sha1_32(buf) == 1145274999) {
                break;
            }
        }
        for (i = 66; i < 89; i++) {
            buf[117] = (byte) i;
            if (sha1_32(buf) == 1802977663) {
                break;
            }
        }
        for (i = -65; i < -50; i++) {
            buf[118] = (byte) i;
            if (sha1_32(buf) == 1381529695) {
                break;
            }
        }
        for (i = 119; i < 128; i++) {
            buf[119] = (byte) i;
            if (sha1_32(buf) == 1654980616) {
                break;
            }
        }
        for (i = -5; i < 19; i++) {
            buf[120] = (byte) i;
            if (sha1_32(buf) == 1729450811) {
                break;
            }
        }
        for (i = 54; i < 69; i++) {
            buf[121] = (byte) i;
            if (sha1_32(buf) == 751446055) {
                break;
            }
        }
        for (i = 83; i < 105; i++) {
            buf[122] = (byte) i;
            if (sha1_32(buf) == -1295884499) {
                break;
            }
        }
        for (i = -52; i < -36; i++) {
            buf[123] = (byte) i;
            if (sha1_32(buf) == 1354137784) {
                break;
            }
        }
        for (i = 77; i < 97; i++) {
            buf[124] = (byte) i;
            if (sha1_32(buf) == -1168558429) {
                break;
            }
        }
        for (i = -128; i < -118; i++) {
            buf[125] = (byte) i;
            if (sha1_32(buf) == 1602101688) {
                break;
            }
        }
        for (i = -96; i < -74; i++) {
            buf[126] = (byte) i;
            if (sha1_32(buf) == -1796148052) {
                break;
            }
        }
        for (i = -128; i < -117; i++) {
            buf[127] = (byte) i;
            if (sha1_32(buf) == 795553510) {
                break;
            }
        }
        for (i = -83; i < -65; i++) {
            buf[128] = (byte) i;
            if (sha1_32(buf) == 1129673063) {
                break;
            }
        }
        for (i = 25; i < 44; i++) {
            buf[129] = (byte) i;
            if (sha1_32(buf) == 10271870) {
                break;
            }
        }
        for (i = -90; i < -77; i++) {
            buf[130] = (byte) i;
            if (sha1_32(buf) == 566970728) {
                break;
            }
        }
        for (i = -114; i < -104; i++) {
            buf[131] = (byte) i;
            if (sha1_32(buf) == -1698616407) {
                break;
            }
        }
        for (i = -8; i < 8; i++) {
            buf[132] = (byte) i;
            if (sha1_32(buf) == 270956937) {
                break;
            }
        }
        for (i = 58; i < 71; i++) {
            buf[133] = (byte) i;
            if (sha1_32(buf) == -1746856736) {
                break;
            }
        }
        for (i = -14; i < 6; i++) {
            buf[134] = (byte) i;
            if (sha1_32(buf) == 1986639589) {
                break;
            }
        }
        for (i = -62; i < -59; i++) {
            buf[135] = (byte) i;
            if (sha1_32(buf) == -526595295) {
                break;
            }
        }
        for (i = 9; i < 19; i++) {
            buf[136] = (byte) i;
            if (sha1_32(buf) == 1221266118) {
                break;
            }
        }
        for (i = -128; i < -105; i++) {
            buf[137] = (byte) i;
            if (sha1_32(buf) == 526951898) {
                break;
            }
        }
        for (i = -121; i < -112; i++) {
            buf[138] = (byte) i;
            if (sha1_32(buf) == 1446805593) {
                break;
            }
        }
        for (i = 10; i < 34; i++) {
            buf[139] = (byte) i;
            if (sha1_32(buf) == 796988947) {
                break;
            }
        }
        for (i = 105; i < 109; i++) {
            buf[140] = (byte) i;
            if (sha1_32(buf) == -487295696) {
                break;
            }
        }
        for (i = 25; i < 45; i++) {
            buf[141] = (byte) i;
            if (sha1_32(buf) == 1353245937) {
                break;
            }
        }
        for (i = -110; i < -96; i++) {
            buf[142] = (byte) i;
            if (sha1_32(buf) == 1494053226) {
                break;
            }
        }
        for (i = -60; i < -39; i++) {
            buf[143] = (byte) i;
            if (sha1_32(buf) == -181167965) {
                break;
            }
        }
        for (i = 31; i < 47; i++) {
            buf[144] = (byte) i;
            if (sha1_32(buf) == 1102564986) {
                break;
            }
        }
        for (i = 34; i < 53; i++) {
            buf[145] = (byte) i;
            if (sha1_32(buf) == -2030182216) {
                break;
            }
        }
        for (i = -124; i < -103; i++) {
            buf[146] = (byte) i;
            if (sha1_32(buf) == 690605088) {
                break;
            }
        }
        for (i = -100; i < -75; i++) {
            buf[147] = (byte) i;
            if (sha1_32(buf) == 1809466674) {
                break;
            }
        }
        for (i = -123; i < -108; i++) {
            buf[148] = (byte) i;
            if (sha1_32(buf) == 20074662) {
                break;
            }
        }
        for (i = 90; i < 109; i++) {
            buf[149] = (byte) i;
            if (sha1_32(buf) == -932528294) {
                break;
            }
        }
        for (i = -125; i < -120; i++) {
            buf[150] = (byte) i;
            if (sha1_32(buf) == 1104301172) {
                break;
            }
        }
        for (i = -15; i < 14; i++) {
            buf[151] = (byte) i;
            if (sha1_32(buf) == 1104301172) {
                break;
            }
        }
        for (i = 17; i < 24; i++) {
            buf[152] = (byte) i;
            if (sha1_32(buf) == 811329284) {
                break;
            }
        }
        for (i = -39; i < -24; i++) {
            buf[153] = (byte) i;
            if (sha1_32(buf) == -801057617) {
                break;
            }
        }
        for (i = -42; i < -38; i++) {
            buf[154] = (byte) i;
            if (sha1_32(buf) == 1362685585) {
                break;
            }
        }
        for (i = -76; i < -64; i++) {
            buf[155] = (byte) i;
            if (sha1_32(buf) == -2091995633) {
                break;
            }
        }
        for (i = 90; i < 93; i++) {
            buf[156] = (byte) i;
            if (sha1_32(buf) == -1446905059) {
                break;
            }
        }
        for (i = -111; i < -97; i++) {
            buf[157] = (byte) i;
            if (sha1_32(buf) == 1286929927) {
                break;
            }
        }
        for (i = -22; i < -5; i++) {
            buf[158] = (byte) i;
            if (sha1_32(buf) == -950226828) {
                break;
            }
        }
        for (i = 2; i < 26; i++) {
            buf[159] = (byte) i;
            if (sha1_32(buf) == -704948654) {
                break;
            }
        }
        for (i = -47; i < -39; i++) {
            buf[160] = (byte) i;
            if (sha1_32(buf) == 353612379) {
                break;
            }
        }
        for (i = 113; i < 128; i++) {
            buf[161] = (byte) i;
            if (sha1_32(buf) == 211425278) {
                break;
            }
        }
        for (i = 43; i < 66; i++) {
            buf[162] = (byte) i;
            if (sha1_32(buf) == 1015765654) {
                break;
            }
        }
        for (i = -40; i < -28; i++) {
            buf[163] = (byte) i;
            if (sha1_32(buf) == 949025288) {
                break;
            }
        }
        for (i = 58; i < 69; i++) {
            buf[164] = (byte) i;
            if (sha1_32(buf) == 1601650751) {
                break;
            }
        }
        for (i = 105; i < 128; i++) {
            buf[165] = (byte) i;
            if (sha1_32(buf) == -1543004233) {
                break;
            }
        }
        for (i = -128; i < -125; i++) {
            buf[166] = (byte) i;
            if (sha1_32(buf) == 7348522) {
                break;
            }
        }
        for (i = 14; i < 22; i++) {
            buf[167] = (byte) i;
            if (sha1_32(buf) == 392838486) {
                break;
            }
        }
        for (i = -5; i < 17; i++) {
            buf[168] = (byte) i;
            if (sha1_32(buf) == 996703086) {
                break;
            }
        }
        for (i = -21; i < -6; i++) {
            buf[169] = (byte) i;
            if (sha1_32(buf) == 1948091781) {
                break;
            }
        }
        for (i = 42; i < 60; i++) {
            buf[170] = (byte) i;
            if (sha1_32(buf) == -334848080) {
                break;
            }
        }
        for (i = 61; i < 69; i++) {
            buf[171] = (byte) i;
            if (sha1_32(buf) == -549545915) {
                break;
            }
        }
        for (i = -84; i < -66; i++) {
            buf[172] = (byte) i;
            if (sha1_32(buf) == 1898533511) {
                break;
            }
        }
        for (i = -28; i < -9; i++) {
            buf[173] = (byte) i;
            if (sha1_32(buf) == -360346099) {
                break;
            }
        }
        for (i = 1; i < 31; i++) {
            buf[174] = (byte) i;
            if (sha1_32(buf) == 731333302) {
                break;
            }
        }
        for (i = -6; i < 18; i++) {
            buf[175] = (byte) i;
            if (sha1_32(buf) == -2083226510) {
                break;
            }
        }
        for (i = 65; i < 78; i++) {
            buf[176] = (byte) i;
            if (sha1_32(buf) == -1014076341) {
                break;
            }
        }
        for (i = -117; i < -106; i++) {
            buf[177] = (byte) i;
            if (sha1_32(buf) == -1456995411) {
                break;
            }
        }
        for (i = -28; i < -10; i++) {
            buf[178] = (byte) i;
            if (sha1_32(buf) == 817039766) {
                break;
            }
        }
        for (i = -15; i < 1; i++) {
            buf[179] = (byte) i;
            if (sha1_32(buf) == 1191287688) {
                break;
            }
        }
        for (i = 23; i < 47; i++) {
            buf[180] = (byte) i;
            if (sha1_32(buf) == -636697720) {
                break;
            }
        }
        for (i = -114; i < -92; i++) {
            buf[181] = (byte) i;
            if (sha1_32(buf) == -1735040068) {
                break;
            }
        }
        for (i = -119; i < -102; i++) {
            buf[182] = (byte) i;
            if (sha1_32(buf) == -1281147184) {
                break;
            }
        }
        for (i = -69; i < -55; i++) {
            buf[183] = (byte) i;
            if (sha1_32(buf) == -1588823219) {
                break;
            }
        }
        for (i = -67; i < -57; i++) {
            buf[184] = (byte) i;
            if (sha1_32(buf) == 380867080) {
                break;
            }
        }
        for (i = -24; i < -7; i++) {
            buf[185] = (byte) i;
            if (sha1_32(buf) == 2102700643) {
                break;
            }
        }
        for (i = -108; i < -90; i++) {
            buf[186] = (byte) i;
            if (sha1_32(buf) == 1100477613) {
                break;
            }
        }
        for (i = 42; i < 72; i++) {
            buf[187] = (byte) i;
            if (sha1_32(buf) == 991827477) {
                break;
            }
        }
        for (i = -23; i < -17; i++) {
            buf[188] = (byte) i;
            if (sha1_32(buf) == -370153137) {
                break;
            }
        }
        for (i = -108; i < -90; i++) {
            buf[189] = (byte) i;
            if (sha1_32(buf) == -2063479547) {
                break;
            }
        }
        for (i = -118; i < -108; i++) {
            buf[190] = (byte) i;
            if (sha1_32(buf) == 816929113) {
                break;
            }
        }
        for (i = -124; i < -114; i++) {
            buf[191] = (byte) i;
            if (sha1_32(buf) == 1160180968) {
                break;
            }
        }
        for (i = -7; i < 14; i++) {
            buf[192] = (byte) i;
            if (sha1_32(buf) == 1444793557) {
                break;
            }
        }
        for (i = 35; i < 58; i++) {
            buf[193] = (byte) i;
            if (sha1_32(buf) == -953389154) {
                break;
            }
        }
        for (i = -53; i < -46; i++) {
            buf[194] = (byte) i;
            if (sha1_32(buf) == 1008907777) {
                break;
            }
        }
        for (i = -38; i < -16; i++) {
            buf[195] = (byte) i;
            if (sha1_32(buf) == -851072730) {
                break;
            }
        }
        for (i = -20; i < -15; i++) {
            buf[196] = (byte) i;
            if (sha1_32(buf) == -460981724) {
                break;
            }
        }
        for (i = -68; i < -55; i++) {
            buf[197] = (byte) i;
            if (sha1_32(buf) == -282154228) {
                break;
            }
        }
        for (i = -18; i < -1; i++) {
            buf[198] = (byte) i;
            if (sha1_32(buf) == -1322294723) {
                break;
            }
        }
        for (i = -90; i < -84; i++) {
            buf[199] = (byte) i;
            if (sha1_32(buf) == 861043856) {
                break;
            }
        }
        for (i = 85; i < 103; i++) {
            buf[200] = (byte) i;
            if (sha1_32(buf) == -853576088) {
                break;
            }
        }
        for (i = -39; i < -27; i++) {
            buf[201] = (byte) i;
            if (sha1_32(buf) == 1416403251) {
                break;
            }
        }
        for (i = -128; i < -121; i++) {
            buf[202] = (byte) i;
            if (sha1_32(buf) == 1183131731) {
                break;
            }
        }
        for (i = 13; i < 21; i++) {
            buf[203] = (byte) i;
            if (sha1_32(buf) == 119981306) {
                break;
            }
        }
        for (i = 23; i < 39; i++) {
            buf[204] = (byte) i;
            if (sha1_32(buf) == -276706487) {
                break;
            }
        }
        for (i = -112; i < -94; i++) {
            buf[205] = (byte) i;
            if (sha1_32(buf) == 1454981520) {
                break;
            }
        }
        for (i = -48; i < -31; i++) {
            buf[206] = (byte) i;
            if (sha1_32(buf) == 1806764268) {
                break;
            }
        }
        for (i = -116; i < -97; i++) {
            buf[207] = (byte) i;
            if (sha1_32(buf) == -1380396718) {
                break;
            }
        }
        for (i = 115; i < 128; i++) {
            buf[208] = (byte) i;
            if (sha1_32(buf) == -1727571206) {
                break;
            }
        }
        for (i = -29; i < -22; i++) {
            buf[209] = (byte) i;
            if (sha1_32(buf) == 752803482) {
                break;
            }
        }
        for (i = 20; i < 39; i++) {
            buf[210] = (byte) i;
            if (sha1_32(buf) == -1592182548) {
                break;
            }
        }
        for (i = -100; i < -84; i++) {
            buf[211] = (byte) i;
            if (sha1_32(buf) == 2021793928) {
                break;
            }
        }
        for (i = 39; i < 53; i++) {
            buf[212] = (byte) i;
            if (sha1_32(buf) == 951286899) {
                break;
            }
        }
        for (i = 7; i < 25; i++) {
            buf[213] = (byte) i;
            if (sha1_32(buf) == 638561063) {
                break;
            }
        }
        for (i = 67; i < 88; i++) {
            buf[214] = (byte) i;
            if (sha1_32(buf) == -2067535936) {
                break;
            }
        }
        for (i = -128; i < -118; i++) {
            buf[215] = (byte) i;
            if (sha1_32(buf) == -191860386) {
                break;
            }
        }
        for (i = 95; i < 100; i++) {
            buf[216] = (byte) i;
            if (sha1_32(buf) == -1415975062) {
                break;
            }
        }
        for (i = 102; i < 128; i++) {
            buf[217] = (byte) i;
            if (sha1_32(buf) == -57179778) {
                break;
            }
        }
        for (i = 113; i < 128; i++) {
            buf[218] = (byte) i;
            if (sha1_32(buf) == -1021514708) {
                break;
            }
        }
        for (i = -104; i < -83; i++) {
            buf[219] = (byte) i;
            if (sha1_32(buf) == -264767551) {
                break;
            }
        }
        for (i = -118; i < -92; i++) {
            buf[220] = (byte) i;
            if (sha1_32(buf) == 1519534615) {
                break;
            }
        }
        for (i = -94; i < -73; i++) {
            buf[221] = (byte) i;
            if (sha1_32(buf) == -1366509985) {
                break;
            }
        }
        for (i = -47; i < -32; i++) {
            buf[222] = (byte) i;
            if (sha1_32(buf) == 385918724) {
                break;
            }
        }
        for (i = -69; i < -53; i++) {
            buf[223] = (byte) i;
            if (sha1_32(buf) == 1461679832) {
                break;
            }
        }
        for (i = -128; i < -116; i++) {
            buf[224] = (byte) i;
            if (sha1_32(buf) == 251107600) {
                break;
            }
        }
        for (i = 117; i < 126; i++) {
            buf[225] = (byte) i;
            if (sha1_32(buf) == -969149117) {
                break;
            }
        }
        for (i = 23; i < 31; i++) {
            buf[226] = (byte) i;
            if (sha1_32(buf) == 869846900) {
                break;
            }
        }
        for (i = -70; i < -57; i++) {
            buf[227] = (byte) i;
            if (sha1_32(buf) == 1633423249) {
                break;
            }
        }
        for (i = -63; i < -60; i++) {
            buf[228] = (byte) i;
            if (sha1_32(buf) == -1714693167) {
                break;
            }
        }
        for (i = -49; i < -28; i++) {
            buf[229] = (byte) i;
            if (sha1_32(buf) == 656912255) {
                break;
            }
        }
        for (i = 33; i < 41; i++) {
            buf[230] = (byte) i;
            if (sha1_32(buf) == 1765041998) {
                break;
            }
        }
        for (i = 14; i < 38; i++) {
            buf[231] = (byte) i;
            if (sha1_32(buf) == -1113716077) {
                break;
            }
        }
        for (i = -128; i < -119; i++) {
            buf[232] = (byte) i;
            if (sha1_32(buf) == -722974000) {
                break;
            }
        }
        for (i = 55; i < 65; i++) {
            buf[233] = (byte) i;
            if (sha1_32(buf) == 299038836) {
                break;
            }
        }
        for (i = -128; i < -115; i++) {
            buf[234] = (byte) i;
            if (sha1_32(buf) == 1224984814) {
                break;
            }
        }
        for (i = -128; i < -113; i++) {
            buf[235] = (byte) i;
            if (sha1_32(buf) == 337860548) {
                break;
            }
        }
        for (i = -30; i < -11; i++) {
            buf[236] = (byte) i;
            if (sha1_32(buf) == -635758648) {
                break;
            }
        }
        for (i = 18; i < 41; i++) {
            buf[237] = (byte) i;
            if (sha1_32(buf) == 336241154) {
                break;
            }
        }
        for (i = -30; i < -3; i++) {
            buf[238] = (byte) i;
            if (sha1_32(buf) == -1252224516) {
                break;
            }
        }
        for (i = 61; i < 83; i++) {
            buf[239] = (byte) i;
            if (sha1_32(buf) == -1288102848) {
                break;
            }
        }
        for (i = -8; i < -4; i++) {
            buf[240] = (byte) i;
            if (sha1_32(buf) == 20491674) {
                break;
            }
        }
        for (i = -128; i < -117; i++) {
            buf[241] = (byte) i;
            if (sha1_32(buf) == 857096499) {
                break;
            }
        }
        for (i = 85; i < 103; i++) {
            buf[242] = (byte) i;
            if (sha1_32(buf) == -1253975747) {
                break;
            }
        }
        for (i = 79; i < 87; i++) {
            buf[243] = (byte) i;
            if (sha1_32(buf) == 1312660578) {
                break;
            }
        }
        for (i = 94; i < 110; i++) {
            buf[244] = (byte) i;
            if (sha1_32(buf) == 1021369925) {
                break;
            }
        }
        for (i = -93; i < -77; i++) {
            buf[245] = (byte) i;
            if (sha1_32(buf) == -1712535073) {
                break;
            }
        }
        for (i = 39; i < 56; i++) {
            buf[246] = (byte) i;
            if (sha1_32(buf) == -2009376742) {
                break;
            }
        }
        for (i = -25; i < -3; i++) {
            buf[247] = (byte) i;
            if (sha1_32(buf) == 1581678655) {
                break;
            }
        }
        for (i = -85; i < -75; i++) {
            buf[248] = (byte) i;
            if (sha1_32(buf) == 1263543571) {
                break;
            }
        }
        for (i = 3; i < 18; i++) {
            buf[249] = (byte) i;
            if (sha1_32(buf) == -620798483) {
                break;
            }
        }
        for (i = -123; i < -120; i++) {
            buf[250] = (byte) i;
            if (sha1_32(buf) == 1382907173) {
                break;
            }
        }
        for (i = 110; i < 128; i++) {
            buf[251] = (byte) i;
            if (sha1_32(buf) == -1185289752) {
                break;
            }
        }
        for (i = -119; i < -113; i++) {
            buf[252] = (byte) i;
            if (sha1_32(buf) == 845176655) {
                break;
            }
        }
        for (i = -102; i < -89; i++) {
            buf[253] = (byte) i;
            if (sha1_32(buf) == 1421243907) {
                break;
            }
        }
        for (i = 119; i < 128; i++) {
            buf[254] = (byte) i;
            if (sha1_32(buf) == 554079121) {
                break;
            }
        }
        for (i = 77; i < 95; i++) {
            buf[255] = (byte) i;
            if (sha1_32(buf) == -883881870) {
                break;
            }
        }
        for (i = -40; i < -26; i++) {
            buf[256] = (byte) i;
            if (sha1_32(buf) == 1106603339) {
                break;
            }
        }
        for (i = -25; i < -4; i++) {
            buf[257] = (byte) i;
            if (sha1_32(buf) == 11376528) {
                break;
            }
        }
        for (i = 104; i < 126; i++) {
            buf[258] = (byte) i;
            if (sha1_32(buf) == -332269576) {
                break;
            }
        }
        for (i = 104; i < 118; i++) {
            buf[259] = (byte) i;
            if (sha1_32(buf) == -1622756015) {
                break;
            }
        }
        for (i = 83; i < 100; i++) {
            buf[260] = (byte) i;
            if (sha1_32(buf) == 130224848) {
                break;
            }
        }
        for (i = 101; i < 114; i++) {
            buf[261] = (byte) i;
            if (sha1_32(buf) == -1587123664) {
                break;
            }
        }
        for (i = -76; i < -61; i++) {
            buf[262] = (byte) i;
            if (sha1_32(buf) == -1069657170) {
                break;
            }
        }
        for (i = -6; i < 12; i++) {
            buf[263] = (byte) i;
            if (sha1_32(buf) == 81056411) {
                break;
            }
        }
        for (i = 25; i < 30; i++) {
            buf[264] = (byte) i;
            if (sha1_32(buf) == 387267979) {
                break;
            }
        }
        for (i = -56; i < -38; i++) {
            buf[265] = (byte) i;
            if (sha1_32(buf) == -900743654) {
                break;
            }
        }
        for (i = 53; i < 60; i++) {
            buf[266] = (byte) i;
            if (sha1_32(buf) == -158684803) {
                break;
            }
        }
        for (i = 38; i < 65; i++) {
            buf[267] = (byte) i;
            if (sha1_32(buf) == 54797572) {
                break;
            }
        }
        for (i = -50; i < -31; i++) {
            buf[268] = (byte) i;
            if (sha1_32(buf) == 18118519) {
                break;
            }
        }
        for (i = 93; i < 103; i++) {
            buf[269] = (byte) i;
            if (sha1_32(buf) == -56189294) {
                break;
            }
        }
        for (i = -30; i < -20; i++) {
            buf[270] = (byte) i;
            if (sha1_32(buf) == -1818276165) {
                break;
            }
        }
        for (i = -104; i < -88; i++) {
            buf[271] = (byte) i;
            if (sha1_32(buf) == -1555025956) {
                break;
            }
        }
        for (i = -43; i < -24; i++) {
            buf[272] = (byte) i;
            if (sha1_32(buf) == -1811799904) {
                break;
            }
        }
        for (i = 109; i < 128; i++) {
            buf[273] = (byte) i;
            if (sha1_32(buf) == 1210638388) {
                break;
            }
        }
        for (i = 63; i < 76; i++) {
            buf[274] = (byte) i;
            if (sha1_32(buf) == -774553567) {
                break;
            }
        }
        for (i = -66; i < -41; i++) {
            buf[275] = (byte) i;
            if (sha1_32(buf) == -1234749114) {
                break;
            }
        }
        for (i = 117; i < 128; i++) {
            buf[276] = (byte) i;
            if (sha1_32(buf) == -1069060020) {
                break;
            }
        }
        for (i = -16; i < 7; i++) {
            buf[277] = (byte) i;
            if (sha1_32(buf) == 1595747261) {
                break;
            }
        }
        for (i = 80; i < 96; i++) {
            buf[278] = (byte) i;
            if (sha1_32(buf) == -869807517) {
                break;
            }
        }
        for (i = 5; i < 25; i++) {
            buf[279] = (byte) i;
            if (sha1_32(buf) == -1732459402) {
                break;
            }
        }
        for (i = -16; i < 15; i++) {
            buf[280] = (byte) i;
            if (sha1_32(buf) == 1657851255) {
                break;
            }
        }
        for (i = -110; i < -92; i++) {
            buf[281] = (byte) i;
            if (sha1_32(buf) == 1590234224) {
                break;
            }
        }
        for (i = 55; i < 80; i++) {
            buf[282] = (byte) i;
            if (sha1_32(buf) == 223824751) {
                break;
            }
        }
        for (i = -15; i < 11; i++) {
            buf[283] = (byte) i;
            if (sha1_32(buf) == 223824751) {
                break;
            }
        }
        for (i = 124; i < 126; i++) {
            buf[284] = (byte) i;
            if (sha1_32(buf) == -525637968) {
                break;
            }
        }
        for (i = -93; i < -85; i++) {
            buf[285] = (byte) i;
            if (sha1_32(buf) == 1030368705) {
                break;
            }
        }
        for (i = -47; i < -38; i++) {
            buf[286] = (byte) i;
            if (sha1_32(buf) == 723822470) {
                break;
            }
        }
        for (i = 53; i < 62; i++) {
            buf[287] = (byte) i;
            if (sha1_32(buf) == 1075472060) {
                break;
            }
        }
        for (i = 34; i < 51; i++) {
            buf[288] = (byte) i;
            if (sha1_32(buf) == -1302518737) {
                break;
            }
        }
        for (i = -13; i < 13; i++) {
            buf[289] = (byte) i;
            if (sha1_32(buf) == 1804276599) {
                break;
            }
        }
        for (i = 69; i < 75; i++) {
            buf[290] = (byte) i;
            if (sha1_32(buf) == 904164615) {
                break;
            }
        }
        for (i = -29; i < -9; i++) {
            buf[291] = (byte) i;
            if (sha1_32(buf) == 919135086) {
                break;
            }
        }
        for (i = 64; i < 89; i++) {
            buf[292] = (byte) i;
            if (sha1_32(buf) == -1668236985) {
                break;
            }
        }
        for (i = -54; i < -32; i++) {
            buf[293] = (byte) i;
            if (sha1_32(buf) == -969951742) {
                break;
            }
        }
        for (i = 15; i < 36; i++) {
            buf[294] = (byte) i;
            if (sha1_32(buf) == -1924468298) {
                break;
            }
        }
        for (i = 58; i < 79; i++) {
            buf[295] = (byte) i;
            if (sha1_32(buf) == 1701081992) {
                break;
            }
        }
        for (i = 42; i < 55; i++) {
            buf[296] = (byte) i;
            if (sha1_32(buf) == -991088707) {
                break;
            }
        }
        for (i = -115; i < -89; i++) {
            buf[297] = (byte) i;
            if (sha1_32(buf) == 1166789809) {
                break;
            }
        }
        for (i = 3; i < 34; i++) {
            buf[298] = (byte) i;
            if (sha1_32(buf) == 1958920915) {
                break;
            }
        }
        for (i = -72; i < -50; i++) {
            buf[299] = (byte) i;
            if (sha1_32(buf) == -267111316) {
                break;
            }
        }
        for (i = 24; i < 37; i++) {
            buf[300] = (byte) i;
            if (sha1_32(buf) == 19377554) {
                break;
            }
        }
        for (i = -128; i < -115; i++) {
            buf[301] = (byte) i;
            if (sha1_32(buf) == -845545983) {
                break;
            }
        }
        for (i = -41; i < -30; i++) {
            buf[302] = (byte) i;
            if (sha1_32(buf) == -860043366) {
                break;
            }
        }
        for (i = 19; i < 34; i++) {
            buf[303] = (byte) i;
            if (sha1_32(buf) == -1927876393) {
                break;
            }
        }
        for (i = 101; i < 114; i++) {
            buf[304] = (byte) i;
            if (sha1_32(buf) == 614482118) {
                break;
            }
        }
        for (i = -27; i < -9; i++) {
            buf[305] = (byte) i;
            if (sha1_32(buf) == 1165625445) {
                break;
            }
        }
        for (i = 21; i < 52; i++) {
            buf[306] = (byte) i;
            if (sha1_32(buf) == -1070645422) {
                break;
            }
        }
        for (i = -59; i < -38; i++) {
            buf[307] = (byte) i;
            if (sha1_32(buf) == 1912104153) {
                break;
            }
        }
        for (i = -23; i < -4; i++) {
            buf[308] = (byte) i;
            if (sha1_32(buf) == 1825433544) {
                break;
            }
        }
        for (i = 41; i < 46; i++) {
            buf[309] = (byte) i;
            if (sha1_32(buf) == -994710711) {
                break;
            }
        }
        for (i = -88; i < -59; i++) {
            buf[310] = (byte) i;
            if (sha1_32(buf) == 1805570212) {
                break;
            }
        }
        for (i = -97; i < -82; i++) {
            buf[311] = (byte) i;
            if (sha1_32(buf) == -207651816) {
                break;
            }
        }
        for (i = -92; i < -73; i++) {
            buf[312] = (byte) i;
            if (sha1_32(buf) == -712970729) {
                break;
            }
        }
        for (i = -26; i < -16; i++) {
            buf[313] = (byte) i;
            if (sha1_32(buf) == 839928225) {
                break;
            }
        }
        for (i = -103; i < -93; i++) {
            buf[314] = (byte) i;
            if (sha1_32(buf) == -1492792656) {
                break;
            }
        }
        for (i = 44; i < 56; i++) {
            buf[315] = (byte) i;
            if (sha1_32(buf) == 1504695056) {
                break;
            }
        }
        for (i = 73; i < 92; i++) {
            buf[316] = (byte) i;
            if (sha1_32(buf) == 2099628765) {
                break;
            }
        }
        for (i = -44; i < -25; i++) {
            buf[317] = (byte) i;
            if (sha1_32(buf) == 1037874175) {
                break;
            }
        }
        for (i = 10; i < 35; i++) {
            buf[318] = (byte) i;
            if (sha1_32(buf) == -533139063) {
                break;
            }
        }
        for (i = -107; i < -90; i++) {
            buf[319] = (byte) i;
            if (sha1_32(buf) == 800776650) {
                break;
            }
        }
        for (i = -97; i < -82; i++) {
            buf[320] = (byte) i;
            if (sha1_32(buf) == -1029248646) {
                break;
            }
        }
        for (i = -16; i < -11; i++) {
            buf[321] = (byte) i;
            if (sha1_32(buf) == 818106122) {
                break;
            }
        }
        for (i = 0; i < 24; i++) {
            buf[322] = (byte) i;
            if (sha1_32(buf) == -69982606) {
                break;
            }
        }
        for (i = -128; i < -118; i++) {
            buf[323] = (byte) i;
            if (sha1_32(buf) == -1329440255) {
                break;
            }
        }
        for (i = -30; i < -16; i++) {
            buf[324] = (byte) i;
            if (sha1_32(buf) == 638162649) {
                break;
            }
        }
        for (i = -8; i < 8; i++) {
            buf[325] = (byte) i;
            if (sha1_32(buf) == -1124521237) {
                break;
            }
        }
        for (i = 24; i < 34; i++) {
            buf[326] = (byte) i;
            if (sha1_32(buf) == 1701840522) {
                break;
            }
        }
        for (i = -87; i < -71; i++) {
            buf[327] = (byte) i;
            if (sha1_32(buf) == -122525782) {
                break;
            }
        }
        for (i = -45; i < -26; i++) {
            buf[328] = (byte) i;
            if (sha1_32(buf) == 184591986) {
                break;
            }
        }
        for (i = 25; i < 31; i++) {
            buf[329] = (byte) i;
            if (sha1_32(buf) == -396927926) {
                break;
            }
        }
        for (i = 92; i < 98; i++) {
            buf[330] = (byte) i;
            if (sha1_32(buf) == -573973804) {
                break;
            }
        }
        for (i = -128; i < -111; i++) {
            buf[331] = (byte) i;
            if (sha1_32(buf) == 1873971340) {
                break;
            }
        }
        for (i = -34; i < -24; i++) {
            buf[332] = (byte) i;
            if (sha1_32(buf) == 1167484383) {
                break;
            }
        }
        for (i = -23; i < -3; i++) {
            buf[333] = (byte) i;
            if (sha1_32(buf) == 1009354069) {
                break;
            }
        }
        for (i = -23; i < 4; i++) {
            buf[334] = (byte) i;
            if (sha1_32(buf) == -1497503981) {
                break;
            }
        }
        for (i = 85; i < 108; i++) {
            buf[335] = (byte) i;
            if (sha1_32(buf) == 1759165511) {
                break;
            }
        }
        for (i = -61; i < -41; i++) {
            buf[336] = (byte) i;
            if (sha1_32(buf) == 1017514678) {
                break;
            }
        }
        for (i = -24; i < -16; i++) {
            buf[337] = (byte) i;
            if (sha1_32(buf) == 275711170) {
                break;
            }
        }
        for (i = -31; i < -3; i++) {
            buf[338] = (byte) i;
            if (sha1_32(buf) == 437939827) {
                break;
            }
        }
        for (i = -34; i < -23; i++) {
            buf[339] = (byte) i;
            if (sha1_32(buf) == 1426955296) {
                break;
            }
        }
        for (i = 89; i < 105; i++) {
            buf[340] = (byte) i;
            if (sha1_32(buf) == -630832903) {
                break;
            }
        }
        for (i = 84; i < 86; i++) {
            buf[341] = (byte) i;
            if (sha1_32(buf) == 1724979085) {
                break;
            }
        }
        for (i = 87; i < 96; i++) {
            buf[342] = (byte) i;
            if (sha1_32(buf) == 1485458524) {
                break;
            }
        }
        for (i = 77; i < 84; i++) {
            buf[343] = (byte) i;
            if (sha1_32(buf) == -1227641406) {
                break;
            }
        }
        for (i = -79; i < -60; i++) {
            buf[344] = (byte) i;
            if (sha1_32(buf) == -490433237) {
                break;
            }
        }
        for (i = -50; i < -31; i++) {
            buf[345] = (byte) i;
            if (sha1_32(buf) == -1247187082) {
                break;
            }
        }
        for (i = -24; i < -9; i++) {
            buf[346] = (byte) i;
            if (sha1_32(buf) == 161739151) {
                break;
            }
        }
        for (i = -30; i < -10; i++) {
            buf[347] = (byte) i;
            if (sha1_32(buf) == 4282587) {
                break;
            }
        }
        for (i = 98; i < 109; i++) {
            buf[348] = (byte) i;
            if (sha1_32(buf) == 458298796) {
                break;
            }
        }
        for (i = 31; i < 45; i++) {
            buf[349] = (byte) i;
            if (sha1_32(buf) == 39890487) {
                break;
            }
        }
        for (i = -71; i < -50; i++) {
            buf[350] = (byte) i;
            if (sha1_32(buf) == -460557424) {
                break;
            }
        }
        for (i = 36; i < 55; i++) {
            buf[351] = (byte) i;
            if (sha1_32(buf) == 2104930690) {
                break;
            }
        }
        for (i = 51; i < 75; i++) {
            buf[352] = (byte) i;
            if (sha1_32(buf) == 1975544544) {
                break;
            }
        }
        for (i = -118; i < -104; i++) {
            buf[353] = (byte) i;
            if (sha1_32(buf) == -1303059618) {
                break;
            }
        }
        for (i = -114; i < -103; i++) {
            buf[354] = (byte) i;
            if (sha1_32(buf) == 1056208739) {
                break;
            }
        }
        for (i = 124; i < 128; i++) {
            buf[355] = (byte) i;
            if (sha1_32(buf) == 191009298) {
                break;
            }
        }
        for (i = 93; i < 110; i++) {
            buf[356] = (byte) i;
            if (sha1_32(buf) == -906064283) {
                break;
            }
        }
        for (i = -71; i < -50; i++) {
            buf[357] = (byte) i;
            if (sha1_32(buf) == -1892303513) {
                break;
            }
        }
        for (i = 15; i < 21; i++) {
            buf[358] = (byte) i;
            if (sha1_32(buf) == -716077425) {
                break;
            }
        }
        for (i = -53; i < -37; i++) {
            buf[359] = (byte) i;
            if (sha1_32(buf) == -1500292476) {
                break;
            }
        }
        for (i = -59; i < -51; i++) {
            buf[360] = (byte) i;
            if (sha1_32(buf) == 736890058) {
                break;
            }
        }
        for (i = -13; i < -1; i++) {
            buf[361] = (byte) i;
            if (sha1_32(buf) == 2028182036) {
                break;
            }
        }
        for (i = -94; i < -81; i++) {
            buf[362] = (byte) i;
            if (sha1_32(buf) == 644970071) {
                break;
            }
        }
        for (i = -25; i < -4; i++) {
            buf[363] = (byte) i;
            if (sha1_32(buf) == 1824230205) {
                break;
            }
        }
        for (i = -37; i < -10; i++) {
            buf[364] = (byte) i;
            if (sha1_32(buf) == -99309760) {
                break;
            }
        }
        for (i = 41; i < 57; i++) {
            buf[365] = (byte) i;
            if (sha1_32(buf) == -832110119) {
                break;
            }
        }
        for (i = -78; i < -65; i++) {
            buf[366] = (byte) i;
            if (sha1_32(buf) == -96717016) {
                break;
            }
        }
        for (i = -7; i < 9; i++) {
            buf[367] = (byte) i;
            if (sha1_32(buf) == 1341686132) {
                break;
            }
        }
        for (i = -1; i < 23; i++) {
            buf[368] = (byte) i;
            if (sha1_32(buf) == -330080092) {
                break;
            }
        }
        for (i = -36; i < -25; i++) {
            buf[369] = (byte) i;
            if (sha1_32(buf) == -731622438) {
                break;
            }
        }
        for (i = -128; i < -106; i++) {
            buf[370] = (byte) i;
            if (sha1_32(buf) == -704255077) {
                break;
            }
        }
        for (i = 115; i < 124; i++) {
            buf[371] = (byte) i;
            if (sha1_32(buf) == 1653759925) {
                break;
            }
        }
        for (i = 79; i < 86; i++) {
            buf[372] = (byte) i;
            if (sha1_32(buf) == -1129594720) {
                break;
            }
        }
        for (i = -104; i < -93; i++) {
            buf[373] = (byte) i;
            if (sha1_32(buf) == 1878840258) {
                break;
            }
        }
        for (i = 56; i < 72; i++) {
            buf[374] = (byte) i;
            if (sha1_32(buf) == 1825478076) {
                break;
            }
        }
        for (i = 102; i < 110; i++) {
            buf[375] = (byte) i;
            if (sha1_32(buf) == -195845854) {
                break;
            }
        }
        for (i = -65; i < -51; i++) {
            buf[376] = (byte) i;
            if (sha1_32(buf) == -457800050) {
                break;
            }
        }
        for (i = -47; i < -28; i++) {
            buf[377] = (byte) i;
            if (sha1_32(buf) == -383206044) {
                break;
            }
        }
        for (i = -102; i < -101; i++) {
            buf[378] = (byte) i;
            if (sha1_32(buf) == 1933832296) {
                break;
            }
        }
        for (i = -114; i < -104; i++) {
            buf[379] = (byte) i;
            if (sha1_32(buf) == 1838007175) {
                break;
            }
        }
        for (i = 5; i < 18; i++) {
            buf[380] = (byte) i;
            if (sha1_32(buf) == 1619242978) {
                break;
            }
        }
        for (i = -41; i < -21; i++) {
            buf[381] = (byte) i;
            if (sha1_32(buf) == -1300370889) {
                break;
            }
        }
        for (i = 36; i < 52; i++) {
            buf[382] = (byte) i;
            if (sha1_32(buf) == 323499987) {
                break;
            }
        }
        for (i = -16; i < -4; i++) {
            buf[383] = (byte) i;
            if (sha1_32(buf) == 1268872568) {
                break;
            }
        }
        for (i = -39; i < -32; i++) {
            buf[384] = (byte) i;
            if (sha1_32(buf) == 1673122752) {
                break;
            }
        }
        for (i = -55; i < -34; i++) {
            buf[385] = (byte) i;
            if (sha1_32(buf) == 1931266102) {
                break;
            }
        }
        for (i = 105; i < 120; i++) {
            buf[386] = (byte) i;
            if (sha1_32(buf) == -1048620228) {
                break;
            }
        }
        for (i = -62; i < -52; i++) {
            buf[387] = (byte) i;
            if (sha1_32(buf) == 1989895242) {
                break;
            }
        }
        for (i = -122; i < -114; i++) {
            buf[388] = (byte) i;
            if (sha1_32(buf) == -843545127) {
                break;
            }
        }
        for (i = -59; i < -46; i++) {
            buf[389] = (byte) i;
            if (sha1_32(buf) == -1887241039) {
                break;
            }
        }
        for (i = -5; i < 2; i++) {
            buf[390] = (byte) i;
            if (sha1_32(buf) == -1899150853) {
                break;
            }
        }
        for (i = -125; i < -96; i++) {
            buf[391] = (byte) i;
            if (sha1_32(buf) == -387238196) {
                break;
            }
        }
        for (i = -128; i < -105; i++) {
            buf[392] = (byte) i;
            if (sha1_32(buf) == 1727657692) {
                break;
            }
        }
        for (i = -40; i < -23; i++) {
            buf[393] = (byte) i;
            if (sha1_32(buf) == -1890274195) {
                break;
            }
        }
        for (i = -38; i < -17; i++) {
            buf[394] = (byte) i;
            if (sha1_32(buf) == -551957817) {
                break;
            }
        }
        for (i = 59; i < 75; i++) {
            buf[395] = (byte) i;
            if (sha1_32(buf) == -1249389488) {
                break;
            }
        }
        for (i = -58; i < -40; i++) {
            buf[396] = (byte) i;
            if (sha1_32(buf) == -1842495397) {
                break;
            }
        }
        for (i = 58; i < 73; i++) {
            buf[397] = (byte) i;
            if (sha1_32(buf) == -117709023) {
                break;
            }
        }
        for (i = 94; i < 106; i++) {
            buf[398] = (byte) i;
            if (sha1_32(buf) == -812986122) {
                break;
            }
        }
        for (i = -6; i < 2; i++) {
            buf[399] = (byte) i;
            if (sha1_32(buf) == 794324369) {
                break;
            }
        }
        for (i = -41; i < -22; i++) {
            buf[400] = (byte) i;
            if (sha1_32(buf) == -756239277) {
                break;
            }
        }
        for (i = 52; i < 70; i++) {
            buf[401] = (byte) i;
            if (sha1_32(buf) == -1676269141) {
                break;
            }
        }
        for (i = -33; i < -20; i++) {
            buf[402] = (byte) i;
            if (sha1_32(buf) == -576116670) {
                break;
            }
        }
        for (i = 3; i < 11; i++) {
            buf[403] = (byte) i;
            if (sha1_32(buf) == -1377143879) {
                break;
            }
        }
        for (i = 94; i < 118; i++) {
            buf[404] = (byte) i;
            if (sha1_32(buf) == -844361706) {
                break;
            }
        }
        for (i = -77; i < -63; i++) {
            buf[405] = (byte) i;
            if (sha1_32(buf) == -672633375) {
                break;
            }
        }
        for (i = 5; i < 24; i++) {
            buf[406] = (byte) i;
            if (sha1_32(buf) == 653379574) {
                break;
            }
        }
        for (i = -28; i < -13; i++) {
            buf[407] = (byte) i;
            if (sha1_32(buf) == 1767910036) {
                break;
            }
        }
        for (i = -22; i < -20; i++) {
            buf[408] = (byte) i;
            if (sha1_32(buf) == -1059062512) {
                break;
            }
        }
        for (i = -16; i < -1; i++) {
            buf[409] = (byte) i;
            if (sha1_32(buf) == 2072498724) {
                break;
            }
        }
        for (i = 37; i < 63; i++) {
            buf[410] = (byte) i;
            if (sha1_32(buf) == -2112634961) {
                break;
            }
        }
        for (i = -89; i < -81; i++) {
            buf[411] = (byte) i;
            if (sha1_32(buf) == -896061714) {
                break;
            }
        }
        for (i = -126; i < -110; i++) {
            buf[412] = (byte) i;
            if (sha1_32(buf) == -2077579153) {
                break;
            }
        }
        for (i = -128; i < -111; i++) {
            buf[413] = (byte) i;
            if (sha1_32(buf) == 1436209714) {
                break;
            }
        }
        for (i = 58; i < 67; i++) {
            buf[414] = (byte) i;
            if (sha1_32(buf) == -620665121) {
                break;
            }
        }
        for (i = 74; i < 94; i++) {
            buf[415] = (byte) i;
            if (sha1_32(buf) == 1694525611) {
                break;
            }
        }
        for (i = 51; i < 65; i++) {
            buf[416] = (byte) i;
            if (sha1_32(buf) == 125452930) {
                break;
            }
        }
        for (i = -113; i < -103; i++) {
            buf[417] = (byte) i;
            if (sha1_32(buf) == 1740306127) {
                break;
            }
        }
        for (i = -88; i < -78; i++) {
            buf[418] = (byte) i;
            if (sha1_32(buf) == 1368017936) {
                break;
            }
        }
        for (i = 60; i < 77; i++) {
            buf[419] = (byte) i;
            if (sha1_32(buf) == -727396698) {
                break;
            }
        }
        for (i = 43; i < 59; i++) {
            buf[420] = (byte) i;
            if (sha1_32(buf) == 538953006) {
                break;
            }
        }
        for (i = 97; i < 114; i++) {
            buf[421] = (byte) i;
            if (sha1_32(buf) == -1500490470) {
                break;
            }
        }
        for (i = 111; i < 115; i++) {
            buf[422] = (byte) i;
            if (sha1_32(buf) == -344442594) {
                break;
            }
        }
        for (i = 5; i < 21; i++) {
            buf[423] = (byte) i;
            if (sha1_32(buf) == -86499404) {
                break;
            }
        }
        for (i = 89; i < 100; i++) {
            buf[424] = (byte) i;
            if (sha1_32(buf) == 1362312840) {
                break;
            }
        }
        for (i = -93; i < -82; i++) {
            buf[425] = (byte) i;
            if (sha1_32(buf) == -1374363190) {
                break;
            }
        }
        for (i = -49; i < -34; i++) {
            buf[426] = (byte) i;
            if (sha1_32(buf) == -1641459410) {
                break;
            }
        }
        for (i = -64; i < -49; i++) {
            buf[427] = (byte) i;
            if (sha1_32(buf) == -378777022) {
                break;
            }
        }
        for (i = 76; i < 81; i++) {
            buf[428] = (byte) i;
            if (sha1_32(buf) == 1696181701) {
                break;
            }
        }
        for (i = 43; i < 50; i++) {
            buf[429] = (byte) i;
            if (sha1_32(buf) == 1931351215) {
                break;
            }
        }
        for (i = 2; i < 22; i++) {
            buf[430] = (byte) i;
            if (sha1_32(buf) == -1679189172) {
                break;
            }
        }
        for (i = -128; i < -117; i++) {
            buf[431] = (byte) i;
            if (sha1_32(buf) == -638534145) {
                break;
            }
        }
        for (i = -58; i < -47; i++) {
            buf[432] = (byte) i;
            if (sha1_32(buf) == 622077759) {
                break;
            }
        }
        for (i = -31; i < -28; i++) {
            buf[433] = (byte) i;
            if (sha1_32(buf) == 664878567) {
                break;
            }
        }
        for (i = 83; i < 100; i++) {
            buf[434] = (byte) i;
            if (sha1_32(buf) == -194114865) {
                break;
            }
        }
        for (i = -116; i < -99; i++) {
            buf[435] = (byte) i;
            if (sha1_32(buf) == 1580049659) {
                break;
            }
        }
        for (i = 87; i < 109; i++) {
            buf[436] = (byte) i;
            if (sha1_32(buf) == -460288401) {
                break;
            }
        }
        for (i = 9; i < 23; i++) {
            buf[437] = (byte) i;
            if (sha1_32(buf) == -1599577804) {
                break;
            }
        }
        for (i = -128; i < -115; i++) {
            buf[438] = (byte) i;
            if (sha1_32(buf) == 1196614526) {
                break;
            }
        }
        for (i = 34; i < 51; i++) {
            buf[439] = (byte) i;
            if (sha1_32(buf) == -318099981) {
                break;
            }
        }
        for (i = -27; i < -10; i++) {
            buf[440] = (byte) i;
            if (sha1_32(buf) == -578668948) {
                break;
            }
        }
        for (i = 73; i < 90; i++) {
            buf[441] = (byte) i;
            if (sha1_32(buf) == -256202123) {
                break;
            }
        }
        for (i = -64; i < -37; i++) {
            buf[442] = (byte) i;
            if (sha1_32(buf) == -1929770269) {
                break;
            }
        }
        for (i = 38; i < 55; i++) {
            buf[443] = (byte) i;
            if (sha1_32(buf) == -1393926246) {
                break;
            }
        }
        for (i = 53; i < 73; i++) {
            buf[444] = (byte) i;
            if (sha1_32(buf) == -1706340001) {
                break;
            }
        }
        for (i = 122; i < 128; i++) {
            buf[445] = (byte) i;
            if (sha1_32(buf) == -1395194567) {
                break;
            }
        }
        for (i = -17; i < 13; i++) {
            buf[446] = (byte) i;
            if (sha1_32(buf) == 290893055) {
                break;
            }
        }
        for (i = -29; i < -2; i++) {
            buf[447] = (byte) i;
            if (sha1_32(buf) == -795121319) {
                break;
            }
        }
        for (i = -23; i < -16; i++) {
            buf[448] = (byte) i;
            if (sha1_32(buf) == 1395696917) {
                break;
            }
        }
        for (i = 109; i < 126; i++) {
            buf[449] = (byte) i;
            if (sha1_32(buf) == 1863422992) {
                break;
            }
        }
        for (i = -75; i < -56; i++) {
            buf[450] = (byte) i;
            if (sha1_32(buf) == 337390071) {
                break;
            }
        }
        for (i = -125; i < -108; i++) {
            buf[451] = (byte) i;
            if (sha1_32(buf) == -87808783) {
                break;
            }
        }
        for (i = 48; i < 62; i++) {
            buf[452] = (byte) i;
            if (sha1_32(buf) == 939999061) {
                break;
            }
        }
        for (i = -42; i < -28; i++) {
            buf[453] = (byte) i;
            if (sha1_32(buf) == 2022480889) {
                break;
            }
        }
        for (i = 5; i < 24; i++) {
            buf[454] = (byte) i;
            if (sha1_32(buf) == 10358030) {
                break;
            }
        }
        for (i = 106; i < 118; i++) {
            buf[455] = (byte) i;
            if (sha1_32(buf) == 154073181) {
                break;
            }
        }
        for (i = 43; i < 56; i++) {
            buf[456] = (byte) i;
            if (sha1_32(buf) == -769678456) {
                break;
            }
        }
        for (i = -104; i < -95; i++) {
            buf[457] = (byte) i;
            if (sha1_32(buf) == 1179353542) {
                break;
            }
        }
        for (i = -16; i < -2; i++) {
            buf[458] = (byte) i;
            if (sha1_32(buf) == 235851891) {
                break;
            }
        }
        for (i = -10; i < 10; i++) {
            buf[459] = (byte) i;
            if (sha1_32(buf) == 235851891) {
                break;
            }
        }
        for (i = 72; i < 92; i++) {
            buf[460] = (byte) i;
            if (sha1_32(buf) == -477494126) {
                break;
            }
        }
        for (i = -128; i < -112; i++) {
            buf[461] = (byte) i;
            if (sha1_32(buf) == 521652753) {
                break;
            }
        }
        for (i = -95; i < -83; i++) {
            buf[462] = (byte) i;
            if (sha1_32(buf) == 2012874220) {
                break;
            }
        }
        for (i = -48; i < -23; i++) {
            buf[463] = (byte) i;
            if (sha1_32(buf) == -1498761941) {
                break;
            }
        }
        for (i = 110; i < 125; i++) {
            buf[464] = (byte) i;
            if (sha1_32(buf) == 643976711) {
                break;
            }
        }
        for (i = -45; i < -35; i++) {
            buf[465] = (byte) i;
            if (sha1_32(buf) == -1477315148) {
                break;
            }
        }
        for (i = -3; i < 4; i++) {
            buf[466] = (byte) i;
            if (sha1_32(buf) == -1477315148) {
                break;
            }
        }
        for (i = -128; i < -115; i++) {
            buf[467] = (byte) i;
            if (sha1_32(buf) == -1973195260) {
                break;
            }
        }
        for (i = -111; i < -105; i++) {
            buf[468] = (byte) i;
            if (sha1_32(buf) == -1493807502) {
                break;
            }
        }
        for (i = -100; i < -86; i++) {
            buf[469] = (byte) i;
            if (sha1_32(buf) == 1174046243) {
                break;
            }
        }
        for (i = 58; i < 71; i++) {
            buf[470] = (byte) i;
            if (sha1_32(buf) == 1502271827) {
                break;
            }
        }
        for (i = 54; i < 65; i++) {
            buf[471] = (byte) i;
            if (sha1_32(buf) == 1344528661) {
                break;
            }
        }
        for (i = -44; i < -27; i++) {
            buf[472] = (byte) i;
            if (sha1_32(buf) == -1577073959) {
                break;
            }
        }
        for (i = 41; i < 56; i++) {
            buf[473] = (byte) i;
            if (sha1_32(buf) == 710695666) {
                break;
            }
        }
        for (i = -85; i < -75; i++) {
            buf[474] = (byte) i;
            if (sha1_32(buf) == 2005580054) {
                break;
            }
        }
        for (i = -67; i < -39; i++) {
            buf[475] = (byte) i;
            if (sha1_32(buf) == -1435770675) {
                break;
            }
        }
        for (i = 2; i < 22; i++) {
            buf[476] = (byte) i;
            if (sha1_32(buf) == -772747767) {
                break;
            }
        }
        for (i = -114; i < -94; i++) {
            buf[477] = (byte) i;
            if (sha1_32(buf) == -428546595) {
                break;
            }
        }
        for (i = -94; i < -75; i++) {
            buf[478] = (byte) i;
            if (sha1_32(buf) == 1182661037) {
                break;
            }
        }
        for (i = 48; i < 51; i++) {
            buf[479] = (byte) i;
            if (sha1_32(buf) == -502078553) {
                break;
            }
        }
        for (i = -34; i < -18; i++) {
            buf[480] = (byte) i;
            if (sha1_32(buf) == -524516039) {
                break;
            }
        }
        for (i = -95; i < -68; i++) {
            buf[481] = (byte) i;
            if (sha1_32(buf) == -1806537281) {
                break;
            }
        }
        for (i = 53; i < 73; i++) {
            buf[482] = (byte) i;
            if (sha1_32(buf) == -453218332) {
                break;
            }
        }
        for (i = -128; i < -115; i++) {
            buf[483] = (byte) i;
            if (sha1_32(buf) == 847949262) {
                break;
            }
        }
        for (i = -13; i < 5; i++) {
            buf[484] = (byte) i;
            if (sha1_32(buf) == 990327607) {
                break;
            }
        }
        for (i = -56; i < -35; i++) {
            buf[485] = (byte) i;
            if (sha1_32(buf) == -378983833) {
                break;
            }
        }
        for (i = -85; i < -54; i++) {
            buf[486] = (byte) i;
            if (sha1_32(buf) == 1664378146) {
                break;
            }
        }
        for (i = -102; i < -89; i++) {
            buf[487] = (byte) i;
            if (sha1_32(buf) == 1999208402) {
                break;
            }
        }
        for (i = -68; i < -38; i++) {
            buf[488] = (byte) i;
            if (sha1_32(buf) == 340839215) {
                break;
            }
        }
        for (i = 99; i < 120; i++) {
            buf[489] = (byte) i;
            if (sha1_32(buf) == -246969174) {
                break;
            }
        }
        for (i = -54; i < -41; i++) {
            buf[490] = (byte) i;
            if (sha1_32(buf) == 272693034) {
                break;
            }
        }
        for (i = -58; i < -37; i++) {
            buf[491] = (byte) i;
            if (sha1_32(buf) == 1607734986) {
                break;
            }
        }
        for (i = 6; i < 22; i++) {
            buf[492] = (byte) i;
            if (sha1_32(buf) == -2068953021) {
                break;
            }
        }
        for (i = -43; i < -27; i++) {
            buf[493] = (byte) i;
            if (sha1_32(buf) == -2100146905) {
                break;
            }
        }
        for (i = -61; i < -47; i++) {
            buf[494] = (byte) i;
            if (sha1_32(buf) == 2077519305) {
                break;
            }
        }
        for (i = -106; i < -101; i++) {
            buf[495] = (byte) i;
            if (sha1_32(buf) == 2132544008) {
                break;
            }
        }
        for (i = -33; i < -13; i++) {
            buf[496] = (byte) i;
            if (sha1_32(buf) == 481626157) {
                break;
            }
        }
        for (i = 50; i < 61; i++) {
            buf[497] = (byte) i;
            if (sha1_32(buf) == -1021328334) {
                break;
            }
        }
        for (i = -73; i < -60; i++) {
            buf[498] = (byte) i;
            if (sha1_32(buf) == -77540648) {
                break;
            }
        }
        for (i = -42; i < -32; i++) {
            buf[499] = (byte) i;
            if (sha1_32(buf) == 2023326984) {
                break;
            }
        }
        for (i = 15; i < 27; i++) {
            buf[500] = (byte) i;
            if (sha1_32(buf) == -1103448343) {
                break;
            }
        }
        for (i = -10; i < 3; i++) {
            buf[501] = (byte) i;
            if (sha1_32(buf) == 282101500) {
                break;
            }
        }
        for (i = -13; i < 17; i++) {
            buf[502] = (byte) i;
            if (sha1_32(buf) == 172841389) {
                break;
            }
        }
        for (i = -110; i < -104; i++) {
            buf[503] = (byte) i;
            if (sha1_32(buf) == -1175334929) {
                break;
            }
        }
        for (i = 115; i < 128; i++) {
            buf[504] = (byte) i;
            if (sha1_32(buf) == 1024026484) {
                break;
            }
        }
        for (i = 53; i < 58; i++) {
            buf[505] = (byte) i;
            if (sha1_32(buf) == -1153867227) {
                break;
            }
        }
        for (i = 95; i < 114; i++) {
            buf[506] = (byte) i;
            if (sha1_32(buf) == -1151187129) {
                break;
            }
        }
        for (i = 105; i < 117; i++) {
            buf[507] = (byte) i;
            if (sha1_32(buf) == 156484794) {
                break;
            }
        }
        for (i = -55; i < -38; i++) {
            buf[508] = (byte) i;
            if (sha1_32(buf) == -207201269) {
                break;
            }
        }
        for (i = 27; i < 39; i++) {
            buf[509] = (byte) i;
            if (sha1_32(buf) == -20868603) {
                break;
            }
        }
        for (i = -21; i < 2; i++) {
            buf[510] = (byte) i;
            if (sha1_32(buf) == 499074616) {
                break;
            }
        }
        for (i = -107; i < -97; i++) {
            buf[511] = (byte) i;
            if (sha1_32(buf) == 200143200) {
                break;
            }
        }
        for (i = -128; i < -119; i++) {
            buf[512] = (byte) i;
            if (sha1_32(buf) == 404878559) {
                break;
            }
        }
        for (i = 64; i < 76; i++) {
            buf[513] = (byte) i;
            if (sha1_32(buf) == 910686337) {
                break;
            }
        }
        for (i = -39; i < -19; i++) {
            buf[514] = (byte) i;
            if (sha1_32(buf) == 476240038) {
                break;
            }
        }
        for (i = 59; i < 75; i++) {
            buf[515] = (byte) i;
            if (sha1_32(buf) == 894534023) {
                break;
            }
        }
        for (i = 3; i < 20; i++) {
            buf[516] = (byte) i;
            if (sha1_32(buf) == 1680940760) {
                break;
            }
        }
        for (i = -7; i < 11; i++) {
            buf[517] = (byte) i;
            if (sha1_32(buf) == 154274416) {
                break;
            }
        }
        for (i = -23; i < -1; i++) {
            buf[518] = (byte) i;
            if (sha1_32(buf) == 977931375) {
                break;
            }
        }
        for (i = -6; i < 18; i++) {
            buf[519] = (byte) i;
            if (sha1_32(buf) == 1800572163) {
                break;
            }
        }
        for (i = 61; i < 85; i++) {
            buf[520] = (byte) i;
            if (sha1_32(buf) == -1371014988) {
                break;
            }
        }
        for (i = 53; i < 65; i++) {
            buf[521] = (byte) i;
            if (sha1_32(buf) == 562309613) {
                break;
            }
        }
        for (i = -15; i < -12; i++) {
            buf[522] = (byte) i;
            if (sha1_32(buf) == -1416936224) {
                break;
            }
        }
        for (i = -78; i < -53; i++) {
            buf[523] = (byte) i;
            if (sha1_32(buf) == -2027877178) {
                break;
            }
        }
        for (i = -43; i < -23; i++) {
            buf[524] = (byte) i;
            if (sha1_32(buf) == -1126789664) {
                break;
            }
        }
        for (i = -85; i < -73; i++) {
            buf[525] = (byte) i;
            if (sha1_32(buf) == 853237735) {
                break;
            }
        }
        for (i = 61; i < 75; i++) {
            buf[526] = (byte) i;
            if (sha1_32(buf) == 328739038) {
                break;
            }
        }
        for (i = -68; i < -45; i++) {
            buf[527] = (byte) i;
            if (sha1_32(buf) == 608565506) {
                break;
            }
        }
        for (i = 108; i < 123; i++) {
            buf[528] = (byte) i;
            if (sha1_32(buf) == -579620926) {
                break;
            }
        }
        for (i = 82; i < 91; i++) {
            buf[529] = (byte) i;
            if (sha1_32(buf) == -1688966857) {
                break;
            }
        }
        for (i = -118; i < -110; i++) {
            buf[530] = (byte) i;
            if (sha1_32(buf) == 1586950123) {
                break;
            }
        }
        for (i = 23; i < 48; i++) {
            buf[531] = (byte) i;
            if (sha1_32(buf) == -986237393) {
                break;
            }
        }
        for (i = -64; i < -40; i++) {
            buf[532] = (byte) i;
            if (sha1_32(buf) == 1812286659) {
                break;
            }
        }
        for (i = -109; i < -87; i++) {
            buf[533] = (byte) i;
            if (sha1_32(buf) == 1560470798) {
                break;
            }
        }
        for (i = -47; i < -30; i++) {
            buf[534] = (byte) i;
            if (sha1_32(buf) == -1228744827) {
                break;
            }
        }
        for (i = 30; i < 48; i++) {
            buf[535] = (byte) i;
            if (sha1_32(buf) == 1081264879) {
                break;
            }
        }
        for (i = -2; i < 15; i++) {
            buf[536] = (byte) i;
            if (sha1_32(buf) == -1856286867) {
                break;
            }
        }
        for (i = -97; i < -83; i++) {
            buf[537] = (byte) i;
            if (sha1_32(buf) == -1810170048) {
                break;
            }
        }
        for (i = 108; i < 127; i++) {
            buf[538] = (byte) i;
            if (sha1_32(buf) == -1618365541) {
                break;
            }
        }
        for (i = 36; i < 53; i++) {
            buf[539] = (byte) i;
            if (sha1_32(buf) == 1745260718) {
                break;
            }
        }
        for (i = 109; i < 128; i++) {
            buf[540] = (byte) i;
            if (sha1_32(buf) == 2049237637) {
                break;
            }
        }
        for (i = 0; i < 15; i++) {
            buf[541] = (byte) i;
            if (sha1_32(buf) == 1692773108) {
                break;
            }
        }
        for (i = -124; i < -118; i++) {
            buf[542] = (byte) i;
            if (sha1_32(buf) == 1079850934) {
                break;
            }
        }
        for (i = 49; i < 65; i++) {
            buf[543] = (byte) i;
            if (sha1_32(buf) == 1883013565) {
                break;
            }
        }
        for (i = -128; i < -109; i++) {
            buf[544] = (byte) i;
            if (sha1_32(buf) == 75169846) {
                break;
            }
        }
        for (i = -100; i < -78; i++) {
            buf[545] = (byte) i;
            if (sha1_32(buf) == -1779600439) {
                break;
            }
        }
        for (i = 50; i < 62; i++) {
            buf[546] = (byte) i;
            if (sha1_32(buf) == -404795095) {
                break;
            }
        }
        for (i = -121; i < -106; i++) {
            buf[547] = (byte) i;
            if (sha1_32(buf) == -561895102) {
                break;
            }
        }
        for (i = -128; i < -110; i++) {
            buf[548] = (byte) i;
            if (sha1_32(buf) == 1527026909) {
                break;
            }
        }
        for (i = 68; i < 87; i++) {
            buf[549] = (byte) i;
            if (sha1_32(buf) == -408550179) {
                break;
            }
        }
        for (i = 29; i < 37; i++) {
            buf[550] = (byte) i;
            if (sha1_32(buf) == 570610991) {
                break;
            }
        }
        for (i = -94; i < -75; i++) {
            buf[551] = (byte) i;
            if (sha1_32(buf) == 2009759929) {
                break;
            }
        }
        for (i = 8; i < 29; i++) {
            buf[552] = (byte) i;
            if (sha1_32(buf) == 397619132) {
                break;
            }
        }
        for (i = 1; i < 19; i++) {
            buf[553] = (byte) i;
            if (sha1_32(buf) == -405863039) {
                break;
            }
        }
        for (i = 50; i < 80; i++) {
            buf[554] = (byte) i;
            if (sha1_32(buf) == 1653555182) {
                break;
            }
        }
        for (i = -19; i < -2; i++) {
            buf[555] = (byte) i;
            if (sha1_32(buf) == -1336073433) {
                break;
            }
        }
        for (i = -66; i < -55; i++) {
            buf[556] = (byte) i;
            if (sha1_32(buf) == -1615423936) {
                break;
            }
        }
        for (i = 11; i < 29; i++) {
            buf[557] = (byte) i;
            if (sha1_32(buf) == 1890414378) {
                break;
            }
        }
        for (i = -1; i < 12; i++) {
            buf[558] = (byte) i;
            if (sha1_32(buf) == -1028219269) {
                break;
            }
        }
        for (i = -62; i < -46; i++) {
            buf[559] = (byte) i;
            if (sha1_32(buf) == 391528760) {
                break;
            }
        }
        for (i = 4; i < 14; i++) {
            buf[560] = (byte) i;
            if (sha1_32(buf) == 39290095) {
                break;
            }
        }
        for (i = 32; i < 36; i++) {
            buf[561] = (byte) i;
            if (sha1_32(buf) == -21931545) {
                break;
            }
        }
        for (i = -88; i < -69; i++) {
            buf[562] = (byte) i;
            if (sha1_32(buf) == 1781381590) {
                break;
            }
        }
        for (i = -80; i < -64; i++) {
            buf[563] = (byte) i;
            if (sha1_32(buf) == 1670434991) {
                break;
            }
        }
        for (i = 29; i < 51; i++) {
            buf[564] = (byte) i;
            if (sha1_32(buf) == -1881216079) {
                break;
            }
        }
        for (i = 108; i < 115; i++) {
            buf[565] = (byte) i;
            if (sha1_32(buf) == -1320958677) {
                break;
            }
        }
        for (i = 59; i < 85; i++) {
            buf[566] = (byte) i;
            if (sha1_32(buf) == 1826997431) {
                break;
            }
        }
        for (i = -93; i < -83; i++) {
            buf[567] = (byte) i;
            if (sha1_32(buf) == -847120162) {
                break;
            }
        }
        for (i = -70; i < -51; i++) {
            buf[568] = (byte) i;
            if (sha1_32(buf) == 862984100) {
                break;
            }
        }
        for (i = 106; i < 126; i++) {
            buf[569] = (byte) i;
            if (sha1_32(buf) == 716231283) {
                break;
            }
        }
        for (i = -50; i < -31; i++) {
            buf[570] = (byte) i;
            if (sha1_32(buf) == -407869586) {
                break;
            }
        }
        for (i = 51; i < 70; i++) {
            buf[571] = (byte) i;
            if (sha1_32(buf) == -1251521766) {
                break;
            }
        }
        for (i = -126; i < -107; i++) {
            buf[572] = (byte) i;
            if (sha1_32(buf) == 919627484) {
                break;
            }
        }
        for (i = -123; i < -105; i++) {
            buf[573] = (byte) i;
            if (sha1_32(buf) == -463135251) {
                break;
            }
        }
        for (i = 43; i < 61; i++) {
            buf[574] = (byte) i;
            if (sha1_32(buf) == -1977995522) {
                break;
            }
        }
        for (i = 32; i < 57; i++) {
            buf[575] = (byte) i;
            if (sha1_32(buf) == 454070805) {
                break;
            }
        }
        for (i = -69; i < -47; i++) {
            buf[576] = (byte) i;
            if (sha1_32(buf) == 1136942247) {
                break;
            }
        }
        for (i = -93; i < -78; i++) {
            buf[577] = (byte) i;
            if (sha1_32(buf) == -1387440570) {
                break;
            }
        }
        for (i = 100; i < 121; i++) {
            buf[578] = (byte) i;
            if (sha1_32(buf) == -375556547) {
                break;
            }
        }
        for (i = 91; i < 107; i++) {
            buf[579] = (byte) i;
            if (sha1_32(buf) == 327068458) {
                break;
            }
        }
        for (i = 105; i < 119; i++) {
            buf[580] = (byte) i;
            if (sha1_32(buf) == 349720414) {
                break;
            }
        }
        for (i = -6; i < 0; i++) {
            buf[581] = (byte) i;
            if (sha1_32(buf) == 2102029324) {
                break;
            }
        }
        for (i = 49; i < 54; i++) {
            buf[582] = (byte) i;
            if (sha1_32(buf) == 100370910) {
                break;
            }
        }
        for (i = -62; i < -48; i++) {
            buf[583] = (byte) i;
            if (sha1_32(buf) == -2011232443) {
                break;
            }
        }
        for (i = 36; i < 40; i++) {
            buf[584] = (byte) i;
            if (sha1_32(buf) == -1496542163) {
                break;
            }
        }
        for (i = 116; i < 125; i++) {
            buf[585] = (byte) i;
            if (sha1_32(buf) == 514030962) {
                break;
            }
        }
        for (i = 17; i < 31; i++) {
            buf[586] = (byte) i;
            if (sha1_32(buf) == 386775449) {
                break;
            }
        }
        for (i = -49; i < -40; i++) {
            buf[587] = (byte) i;
            if (sha1_32(buf) == 1021811795) {
                break;
            }
        }
        for (i = 117; i < 128; i++) {
            buf[588] = (byte) i;
            if (sha1_32(buf) == -2132260166) {
                break;
            }
        }
        for (i = 71; i < 84; i++) {
            buf[589] = (byte) i;
            if (sha1_32(buf) == 2022948749) {
                break;
            }
        }
        for (i = -110; i < -107; i++) {
            buf[590] = (byte) i;
            if (sha1_32(buf) == 1913767672) {
                break;
            }
        }
        for (i = 43; i < 51; i++) {
            buf[591] = (byte) i;
            if (sha1_32(buf) == 1473841016) {
                break;
            }
        }
        for (i = -93; i < -84; i++) {
            buf[592] = (byte) i;
            if (sha1_32(buf) == -1952473349) {
                break;
            }
        }
        for (i = 81; i < 100; i++) {
            buf[593] = (byte) i;
            if (sha1_32(buf) == 1153257487) {
                break;
            }
        }
        for (i = -70; i < -48; i++) {
            buf[594] = (byte) i;
            if (sha1_32(buf) == 584446938) {
                break;
            }
        }
        for (i = -95; i < -76; i++) {
            buf[595] = (byte) i;
            if (sha1_32(buf) == 1765479667) {
                break;
            }
        }
        for (i = -13; i < -6; i++) {
            buf[596] = (byte) i;
            if (sha1_32(buf) == -1668072688) {
                break;
            }
        }
        for (i = -14; i < 15; i++) {
            buf[597] = (byte) i;
            if (sha1_32(buf) == 108699153) {
                break;
            }
        }
        for (i = -116; i < -104; i++) {
            buf[598] = (byte) i;
            if (sha1_32(buf) == 1682610918) {
                break;
            }
        }
        for (i = -8; i < 12; i++) {
            buf[599] = (byte) i;
            if (sha1_32(buf) == 1110750821) {
                break;
            }
        }
        for (i = -102; i < -95; i++) {
            buf[600] = (byte) i;
            if (sha1_32(buf) == 780428656) {
                break;
            }
        }
        for (i = 51; i < 71; i++) {
            buf[601] = (byte) i;
            if (sha1_32(buf) == 1394021067) {
                break;
            }
        }
        for (i = 48; i < 77; i++) {
            buf[602] = (byte) i;
            if (sha1_32(buf) == -1234778326) {
                break;
            }
        }
        for (i = 58; i < 76; i++) {
            buf[603] = (byte) i;
            if (sha1_32(buf) == 1095714624) {
                break;
            }
        }
        for (i = -45; i < -29; i++) {
            buf[604] = (byte) i;
            if (sha1_32(buf) == 1073024641) {
                break;
            }
        }
        for (i = -119; i < -103; i++) {
            buf[605] = (byte) i;
            if (sha1_32(buf) == 964771639) {
                break;
            }
        }
        for (i = -123; i < -111; i++) {
            buf[606] = (byte) i;
            if (sha1_32(buf) == -468131331) {
                break;
            }
        }
        for (i = 82; i < 87; i++) {
            buf[607] = (byte) i;
            if (sha1_32(buf) == -472237295) {
                break;
            }
        }
        for (i = -37; i < -23; i++) {
            buf[608] = (byte) i;
            if (sha1_32(buf) == 68242428) {
                break;
            }
        }
        for (i = 122; i < 128; i++) {
            buf[609] = (byte) i;
            if (sha1_32(buf) == -1264233809) {
                break;
            }
        }
        for (i = 111; i < 125; i++) {
            buf[610] = (byte) i;
            if (sha1_32(buf) == 1464281970) {
                break;
            }
        }
        for (i = 13; i < 24; i++) {
            buf[611] = (byte) i;
            if (sha1_32(buf) == -1517167875) {
                break;
            }
        }
        for (i = 66; i < 78; i++) {
            buf[612] = (byte) i;
            if (sha1_32(buf) == 955063324) {
                break;
            }
        }
        for (i = 54; i < 70; i++) {
            buf[613] = (byte) i;
            if (sha1_32(buf) == 1861204939) {
                break;
            }
        }
        for (i = 111; i < 128; i++) {
            buf[614] = (byte) i;
            if (sha1_32(buf) == -181235870) {
                break;
            }
        }
        for (i = -87; i < -79; i++) {
            buf[615] = (byte) i;
            if (sha1_32(buf) == -1428188055) {
                break;
            }
        }
        for (i = -70; i < -57; i++) {
            buf[616] = (byte) i;
            if (sha1_32(buf) == 15983477) {
                break;
            }
        }
        for (i = 57; i < 71; i++) {
            buf[617] = (byte) i;
            if (sha1_32(buf) == 1416828745) {
                break;
            }
        }
        for (i = 83; i < 101; i++) {
            buf[618] = (byte) i;
            if (sha1_32(buf) == -1290604753) {
                break;
            }
        }
        for (i = 82; i < 108; i++) {
            buf[619] = (byte) i;
            if (sha1_32(buf) == 1889480634) {
                break;
            }
        }
        for (i = 68; i < 81; i++) {
            buf[620] = (byte) i;
            if (sha1_32(buf) == 705518723) {
                break;
            }
        }
        for (i = 6; i < 31; i++) {
            buf[621] = (byte) i;
            if (sha1_32(buf) == -1766674702) {
                break;
            }
        }
        for (i = 111; i < 123; i++) {
            buf[622] = (byte) i;
            if (sha1_32(buf) == -199231372) {
                break;
            }
        }
        for (i = 60; i < 79; i++) {
            buf[623] = (byte) i;
            if (sha1_32(buf) == 987719593) {
                break;
            }
        }
        for (i = -91; i < -83; i++) {
            buf[624] = (byte) i;
            if (sha1_32(buf) == 1048278679) {
                break;
            }
        }
        for (i = -93; i < -74; i++) {
            buf[625] = (byte) i;
            if (sha1_32(buf) == 1992777732) {
                break;
            }
        }
        for (i = 106; i < 126; i++) {
            buf[626] = (byte) i;
            if (sha1_32(buf) == -2106149220) {
                break;
            }
        }
        for (i = 56; i < 64; i++) {
            buf[627] = (byte) i;
            if (sha1_32(buf) == -1851270316) {
                break;
            }
        }
        for (i = -7; i < 0; i++) {
            buf[628] = (byte) i;
            if (sha1_32(buf) == -1029711477) {
                break;
            }
        }
        for (i = -90; i < -80; i++) {
            buf[629] = (byte) i;
            if (sha1_32(buf) == -1713333066) {
                break;
            }
        }
        for (i = -19; i < -4; i++) {
            buf[630] = (byte) i;
            if (sha1_32(buf) == -1103910911) {
                break;
            }
        }
        for (i = -128; i < -114; i++) {
            buf[631] = (byte) i;
            if (sha1_32(buf) == 1207438403) {
                break;
            }
        }
        for (i = -42; i < -18; i++) {
            buf[632] = (byte) i;
            if (sha1_32(buf) == -815170284) {
                break;
            }
        }
        for (i = -107; i < -89; i++) {
            buf[633] = (byte) i;
            if (sha1_32(buf) == 226874996) {
                break;
            }
        }
        for (i = 23; i < 35; i++) {
            buf[634] = (byte) i;
            if (sha1_32(buf) == -1872006393) {
                break;
            }
        }
        for (i = -101; i < -79; i++) {
            buf[635] = (byte) i;
            if (sha1_32(buf) == -890221860) {
                break;
            }
        }
        for (i = 57; i < 70; i++) {
            buf[636] = (byte) i;
            if (sha1_32(buf) == 1723489227) {
                break;
            }
        }
        for (i = 81; i < 95; i++) {
            buf[637] = (byte) i;
            if (sha1_32(buf) == 763554420) {
                break;
            }
        }
        for (i = -88; i < -65; i++) {
            buf[638] = (byte) i;
            if (sha1_32(buf) == -426138889) {
                break;
            }
        }
        for (i = -44; i < -13; i++) {
            buf[639] = (byte) i;
            if (sha1_32(buf) == 1243609828) {
                break;
            }
        }
        for (i = -104; i < -88; i++) {
            buf[640] = (byte) i;
            if (sha1_32(buf) == 929541062) {
                break;
            }
        }
        for (i = -10; i < 6; i++) {
            buf[641] = (byte) i;
            if (sha1_32(buf) == 517586298) {
                break;
            }
        }
        for (i = 69; i < 88; i++) {
            buf[642] = (byte) i;
            if (sha1_32(buf) == -721080372) {
                break;
            }
        }
        for (i = 70; i < 79; i++) {
            buf[643] = (byte) i;
            if (sha1_32(buf) == 524691842) {
                break;
            }
        }
        for (i = -61; i < -45; i++) {
            buf[644] = (byte) i;
            if (sha1_32(buf) == 1270838297) {
                break;
            }
        }
        for (i = -42; i < -26; i++) {
            buf[645] = (byte) i;
            if (sha1_32(buf) == 22291667) {
                break;
            }
        }
        for (i = 33; i < 63; i++) {
            buf[646] = (byte) i;
            if (sha1_32(buf) == 45182603) {
                break;
            }
        }
        for (i = -19; i < 2; i++) {
            buf[647] = (byte) i;
            if (sha1_32(buf) == -67959585) {
                break;
            }
        }
        for (i = -104; i < -77; i++) {
            buf[648] = (byte) i;
            if (sha1_32(buf) == 2049531264) {
                break;
            }
        }
        for (i = -25; i < -8; i++) {
            buf[649] = (byte) i;
            if (sha1_32(buf) == 2096487914) {
                break;
            }
        }
        for (i = 37; i < 57; i++) {
            buf[650] = (byte) i;
            if (sha1_32(buf) == -6722168) {
                break;
            }
        }
        for (i = 1; i < 19; i++) {
            buf[651] = (byte) i;
            if (sha1_32(buf) == 2083570798) {
                break;
            }
        }
        for (i = 41; i < 69; i++) {
            buf[652] = (byte) i;
            if (sha1_32(buf) == 1835874412) {
                break;
            }
        }
        for (i = 66; i < 81; i++) {
            buf[653] = (byte) i;
            if (sha1_32(buf) == 569971476) {
                break;
            }
        }
        for (i = -98; i < -81; i++) {
            buf[654] = (byte) i;
            if (sha1_32(buf) == -1568910381) {
                break;
            }
        }
        for (i = -100; i < -75; i++) {
            buf[655] = (byte) i;
            if (sha1_32(buf) == -422956819) {
                break;
            }
        }
        for (i = 58; i < 63; i++) {
            buf[656] = (byte) i;
            if (sha1_32(buf) == 1607710915) {
                break;
            }
        }
        for (i = -15; i < -8; i++) {
            buf[657] = (byte) i;
            if (sha1_32(buf) == 1146485824) {
                break;
            }
        }
        for (i = 62; i < 85; i++) {
            buf[658] = (byte) i;
            if (sha1_32(buf) == 334569594) {
                break;
            }
        }
        for (i = 89; i < 108; i++) {
            buf[659] = (byte) i;
            if (sha1_32(buf) == -2060654350) {
                break;
            }
        }
        for (i = 44; i < 52; i++) {
            buf[660] = (byte) i;
            if (sha1_32(buf) == 1861638839) {
                break;
            }
        }
        for (i = -112; i < -101; i++) {
            buf[661] = (byte) i;
            if (sha1_32(buf) == -1957457656) {
                break;
            }
        }
        for (i = -120; i < -106; i++) {
            buf[662] = (byte) i;
            if (sha1_32(buf) == 867030550) {
                break;
            }
        }
        for (i = 91; i < 110; i++) {
            buf[663] = (byte) i;
            if (sha1_32(buf) == -1656873480) {
                break;
            }
        }
        for (i = -66; i < -57; i++) {
            buf[664] = (byte) i;
            if (sha1_32(buf) == -258093848) {
                break;
            }
        }
        for (i = 40; i < 47; i++) {
            buf[665] = (byte) i;
            if (sha1_32(buf) == 1892728045) {
                break;
            }
        }
        for (i = 50; i < 59; i++) {
            buf[666] = (byte) i;
            if (sha1_32(buf) == 1546213422) {
                break;
            }
        }
        for (i = 113; i < 125; i++) {
            buf[667] = (byte) i;
            if (sha1_32(buf) == -863678611) {
                break;
            }
        }
        for (i = -64; i < -42; i++) {
            buf[668] = (byte) i;
            if (sha1_32(buf) == -1927585531) {
                break;
            }
        }
        for (i = 43; i < 54; i++) {
            buf[669] = (byte) i;
            if (sha1_32(buf) == -1410321615) {
                break;
            }
        }
        for (i = -38; i < -25; i++) {
            buf[670] = (byte) i;
            if (sha1_32(buf) == 699001233) {
                break;
            }
        }
        for (i = -103; i < -93; i++) {
            buf[671] = (byte) i;
            if (sha1_32(buf) == -906817326) {
                break;
            }
        }
        for (i = 7; i < 16; i++) {
            buf[672] = (byte) i;
            if (sha1_32(buf) == 1052839839) {
                break;
            }
        }
        for (i = 108; i < 127; i++) {
            buf[673] = (byte) i;
            if (sha1_32(buf) == -984548905) {
                break;
            }
        }
        for (i = -94; i < -79; i++) {
            buf[674] = (byte) i;
            if (sha1_32(buf) == 1908229619) {
                break;
            }
        }
        for (i = -70; i < -57; i++) {
            buf[675] = (byte) i;
            if (sha1_32(buf) == -1190462676) {
                break;
            }
        }
        for (i = -94; i < -69; i++) {
            buf[676] = (byte) i;
            if (sha1_32(buf) == -827840722) {
                break;
            }
        }
        for (i = -90; i < -71; i++) {
            buf[677] = (byte) i;
            if (sha1_32(buf) == -1475896877) {
                break;
            }
        }
        for (i = 51; i < 77; i++) {
            buf[678] = (byte) i;
            if (sha1_32(buf) == -493080961) {
                break;
            }
        }
        for (i = 122; i < 125; i++) {
            buf[679] = (byte) i;
            if (sha1_32(buf) == -1334534802) {
                break;
            }
        }
        for (i = -118; i < -105; i++) {
            buf[680] = (byte) i;
            if (sha1_32(buf) == 1507965186) {
                break;
            }
        }
        for (i = 19; i < 49; i++) {
            buf[681] = (byte) i;
            if (sha1_32(buf) == 865027918) {
                break;
            }
        }
        for (i = -87; i < -73; i++) {
            buf[682] = (byte) i;
            if (sha1_32(buf) == 1944383736) {
                break;
            }
        }
        for (i = -57; i < -47; i++) {
            buf[683] = (byte) i;
            if (sha1_32(buf) == -681296433) {
                break;
            }
        }
        for (i = 114; i < 128; i++) {
            buf[684] = (byte) i;
            if (sha1_32(buf) == -594719318) {
                break;
            }
        }
        for (i = -123; i < -103; i++) {
            buf[685] = (byte) i;
            if (sha1_32(buf) == 1586638275) {
                break;
            }
        }
        for (i = -76; i < -67; i++) {
            buf[686] = (byte) i;
            if (sha1_32(buf) == -1691148396) {
                break;
            }
        }
        for (i = -13; i < 11; i++) {
            buf[687] = (byte) i;
            if (sha1_32(buf) == 584810059) {
                break;
            }
        }
        for (i = -84; i < -67; i++) {
            buf[688] = (byte) i;
            if (sha1_32(buf) == 774652455) {
                break;
            }
        }
        for (i = -43; i < -42; i++) {
            buf[689] = (byte) i;
            if (sha1_32(buf) == 1363620402) {
                break;
            }
        }
        for (i = 58; i < 76; i++) {
            buf[690] = (byte) i;
            if (sha1_32(buf) == 1375461762) {
                break;
            }
        }
        for (i = -97; i < -82; i++) {
            buf[691] = (byte) i;
            if (sha1_32(buf) == -637937606) {
                break;
            }
        }
        for (i = -70; i < -55; i++) {
            buf[692] = (byte) i;
            if (sha1_32(buf) == -676879380) {
                break;
            }
        }
        for (i = 2; i < 22; i++) {
            buf[693] = (byte) i;
            if (sha1_32(buf) == -497600148) {
                break;
            }
        }
        for (i = -7; i < 20; i++) {
            buf[694] = (byte) i;
            if (sha1_32(buf) == -1499279030) {
                break;
            }
        }
        for (i = 94; i < 108; i++) {
            buf[695] = (byte) i;
            if (sha1_32(buf) == 1722330448) {
                break;
            }
        }
        for (i = -114; i < -95; i++) {
            buf[696] = (byte) i;
            if (sha1_32(buf) == -456013411) {
                break;
            }
        }
        for (i = 64; i < 82; i++) {
            buf[697] = (byte) i;
            if (sha1_32(buf) == 854981104) {
                break;
            }
        }
        for (i = 101; i < 124; i++) {
            buf[698] = (byte) i;
            if (sha1_32(buf) == 1972666801) {
                break;
            }
        }
        for (i = 110; i < 125; i++) {
            buf[699] = (byte) i;
            if (sha1_32(buf) == 1452842030) {
                break;
            }
        }
        for (i = -122; i < -113; i++) {
            buf[700] = (byte) i;
            if (sha1_32(buf) == -164668799) {
                break;
            }
        }
        for (i = -67; i < -45; i++) {
            buf[701] = (byte) i;
            if (sha1_32(buf) == -1204493311) {
                break;
            }
        }
        for (i = -64; i < -52; i++) {
            buf[702] = (byte) i;
            if (sha1_32(buf) == -717458583) {
                break;
            }
        }
        for (i = 34; i < 50; i++) {
            buf[703] = (byte) i;
            if (sha1_32(buf) == 1788810270) {
                break;
            }
        }
        for (i = -56; i < -37; i++) {
            buf[704] = (byte) i;
            if (sha1_32(buf) == -618931984) {
                break;
            }
        }
        for (i = 84; i < 111; i++) {
            buf[705] = (byte) i;
            if (sha1_32(buf) == -1422453057) {
                break;
            }
        }
        for (i = -119; i < -116; i++) {
            buf[706] = (byte) i;
            if (sha1_32(buf) == 264149625) {
                break;
            }
        }
        for (i = 93; i < 99; i++) {
            buf[707] = (byte) i;
            if (sha1_32(buf) == -51929782) {
                break;
            }
        }
        for (i = 50; i < 68; i++) {
            buf[708] = (byte) i;
            if (sha1_32(buf) == -1697033058) {
                break;
            }
        }
        for (i = -128; i < -122; i++) {
            buf[709] = (byte) i;
            if (sha1_32(buf) == -1268721604) {
                break;
            }
        }
        for (i = -98; i < -82; i++) {
            buf[710] = (byte) i;
            if (sha1_32(buf) == 1559450651) {
                break;
            }
        }
        for (i = -28; i < -10; i++) {
            buf[711] = (byte) i;
            if (sha1_32(buf) == 1283217237) {
                break;
            }
        }
        for (i = 115; i < 124; i++) {
            buf[712] = (byte) i;
            if (sha1_32(buf) == -1533588223) {
                break;
            }
        }
        for (i = -105; i < -89; i++) {
            buf[713] = (byte) i;
            if (sha1_32(buf) == 902495555) {
                break;
            }
        }
        for (i = -4; i < 8; i++) {
            buf[714] = (byte) i;
            if (sha1_32(buf) == -818432690) {
                break;
            }
        }
        for (i = -15; i < -14; i++) {
            buf[715] = (byte) i;
            if (sha1_32(buf) == -1462803342) {
                break;
            }
        }
        for (i = -115; i < -103; i++) {
            buf[716] = (byte) i;
            if (sha1_32(buf) == -274182859) {
                break;
            }
        }
        for (i = -81; i < -64; i++) {
            buf[717] = (byte) i;
            if (sha1_32(buf) == -493543524) {
                break;
            }
        }
        for (i = -59; i < -35; i++) {
            buf[718] = (byte) i;
            if (sha1_32(buf) == 629818476) {
                break;
            }
        }
        for (i = 77; i < 80; i++) {
            buf[719] = (byte) i;
            if (sha1_32(buf) == 1782626455) {
                break;
            }
        }
        for (i = -28; i < -3; i++) {
            buf[720] = (byte) i;
            if (sha1_32(buf) == 1183515913) {
                break;
            }
        }
        for (i = 76; i < 92; i++) {
            buf[721] = (byte) i;
            if (sha1_32(buf) == -2069104494) {
                break;
            }
        }
        for (i = 24; i < 51; i++) {
            buf[722] = (byte) i;
            if (sha1_32(buf) == -1453982396) {
                break;
            }
        }
        for (i = 48; i < 60; i++) {
            buf[723] = (byte) i;
            if (sha1_32(buf) == -1641598149) {
                break;
            }
        }
        for (i = 123; i < 128; i++) {
            buf[724] = (byte) i;
            if (sha1_32(buf) == 1171642695) {
                break;
            }
        }
        for (i = -57; i < -44; i++) {
            buf[725] = (byte) i;
            if (sha1_32(buf) == 528505697) {
                break;
            }
        }
        for (i = 35; i < 46; i++) {
            buf[726] = (byte) i;
            if (sha1_32(buf) == -1583954445) {
                break;
            }
        }
        for (i = -1; i < 6; i++) {
            buf[727] = (byte) i;
            if (sha1_32(buf) == 1559594765) {
                break;
            }
        }
        for (i = -61; i < -44; i++) {
            buf[728] = (byte) i;
            if (sha1_32(buf) == -1875147475) {
                break;
            }
        }
        for (i = -36; i < -13; i++) {
            buf[729] = (byte) i;
            if (sha1_32(buf) == 709227499) {
                break;
            }
        }
        for (i = -1; i < 7; i++) {
            buf[730] = (byte) i;
            if (sha1_32(buf) == 1956443877) {
                break;
            }
        }
        for (i = 27; i < 45; i++) {
            buf[731] = (byte) i;
            if (sha1_32(buf) == 933918276) {
                break;
            }
        }
        for (i = -32; i < -14; i++) {
            buf[732] = (byte) i;
            if (sha1_32(buf) == -1096469842) {
                break;
            }
        }
        for (i = 62; i < 72; i++) {
            buf[733] = (byte) i;
            if (sha1_32(buf) == 1394018564) {
                break;
            }
        }
        for (i = -72; i < -45; i++) {
            buf[734] = (byte) i;
            if (sha1_32(buf) == -1059109895) {
                break;
            }
        }
        for (i = -78; i < -63; i++) {
            buf[735] = (byte) i;
            if (sha1_32(buf) == 2020148304) {
                break;
            }
        }
        for (i = -87; i < -70; i++) {
            buf[736] = (byte) i;
            if (sha1_32(buf) == -1839969849) {
                break;
            }
        }
        for (i = 89; i < 96; i++) {
            buf[737] = (byte) i;
            if (sha1_32(buf) == -755880709) {
                break;
            }
        }
        for (i = 78; i < 83; i++) {
            buf[738] = (byte) i;
            if (sha1_32(buf) == 1184238745) {
                break;
            }
        }
        for (i = -94; i < -78; i++) {
            buf[739] = (byte) i;
            if (sha1_32(buf) == 802251796) {
                break;
            }
        }
        for (i = -103; i < -96; i++) {
            buf[740] = (byte) i;
            if (sha1_32(buf) == 1839667456) {
                break;
            }
        }
        for (i = 20; i < 25; i++) {
            buf[741] = (byte) i;
            if (sha1_32(buf) == -81134209) {
                break;
            }
        }
        for (i = -71; i < -59; i++) {
            buf[742] = (byte) i;
            if (sha1_32(buf) == 1213794013) {
                break;
            }
        }
        for (i = -2; i < 9; i++) {
            buf[743] = (byte) i;
            if (sha1_32(buf) == 1213794013) {
                break;
            }
        }
        for (i = 87; i < 96; i++) {
            buf[744] = (byte) i;
            if (sha1_32(buf) == 2099725912) {
                break;
            }
        }
        for (i = -9; i < 4; i++) {
            buf[745] = (byte) i;
            if (sha1_32(buf) == -408432692) {
                break;
            }
        }
        for (i = 85; i < 101; i++) {
            buf[746] = (byte) i;
            if (sha1_32(buf) == 1874910782) {
                break;
            }
        }
        for (i = -110; i < -104; i++) {
            buf[747] = (byte) i;
            if (sha1_32(buf) == -1556899139) {
                break;
            }
        }
        for (i = -17; i < 2; i++) {
            buf[748] = (byte) i;
            if (sha1_32(buf) == -777086312) {
                break;
            }
        }
        for (i = -108; i < -92; i++) {
            buf[749] = (byte) i;
            if (sha1_32(buf) == -148497043) {
                break;
            }
        }
        for (i = 74; i < 81; i++) {
            buf[750] = (byte) i;
            if (sha1_32(buf) == -728580388) {
                break;
            }
        }
        for (i = -64; i < -50; i++) {
            buf[751] = (byte) i;
            if (sha1_32(buf) == -215284231) {
                break;
            }
        }
        for (i = 56; i < 68; i++) {
            buf[752] = (byte) i;
            if (sha1_32(buf) == -1464737943) {
                break;
            }
        }
        for (i = 6; i < 9; i++) {
            buf[753] = (byte) i;
            if (sha1_32(buf) == -1756815281) {
                break;
            }
        }
        for (i = -39; i < -26; i++) {
            buf[754] = (byte) i;
            if (sha1_32(buf) == -1813655265) {
                break;
            }
        }
        for (i = -127; i < -119; i++) {
            buf[755] = (byte) i;
            if (sha1_32(buf) == -1512089568) {
                break;
            }
        }
        for (i = 99; i < 110; i++) {
            buf[756] = (byte) i;
            if (sha1_32(buf) == 405088020) {
                break;
            }
        }
        for (i = 45; i < 58; i++) {
            buf[757] = (byte) i;
            if (sha1_32(buf) == -922001218) {
                break;
            }
        }
        for (i = 13; i < 33; i++) {
            buf[758] = (byte) i;
            if (sha1_32(buf) == -1744499060) {
                break;
            }
        }
        for (i = -3; i < 18; i++) {
            buf[759] = (byte) i;
            if (sha1_32(buf) == 233461725) {
                break;
            }
        }
        for (i = -41; i < -39; i++) {
            buf[760] = (byte) i;
            if (sha1_32(buf) == -739702617) {
                break;
            }
        }
        for (i = 24; i < 36; i++) {
            buf[761] = (byte) i;
            if (sha1_32(buf) == -396550332) {
                break;
            }
        }
        for (i = 98; i < 126; i++) {
            buf[762] = (byte) i;
            if (sha1_32(buf) == -310960177) {
                break;
            }
        }
        for (i = -84; i < -66; i++) {
            buf[763] = (byte) i;
            if (sha1_32(buf) == 561471275) {
                break;
            }
        }
        for (i = 12; i < 31; i++) {
            buf[764] = (byte) i;
            if (sha1_32(buf) == -429801597) {
                break;
            }
        }
        for (i = -37; i < -25; i++) {
            buf[765] = (byte) i;
            if (sha1_32(buf) == -142718686) {
                break;
            }
        }
        for (i = 82; i < 98; i++) {
            buf[766] = (byte) i;
            if (sha1_32(buf) == -1618298905) {
                break;
            }
        }
        for (i = 34; i < 59; i++) {
            buf[767] = (byte) i;
            if (sha1_32(buf) == 1985173304) {
                break;
            }
        }
        for (i = -128; i < -102; i++) {
            buf[768] = (byte) i;
            if (sha1_32(buf) == 2077205192) {
                break;
            }
        }
        for (i = 94; i < 111; i++) {
            buf[769] = (byte) i;
            if (sha1_32(buf) == -42521178) {
                break;
            }
        }
        for (i = 121; i < 128; i++) {
            buf[770] = (byte) i;
            if (sha1_32(buf) == -210172765) {
                break;
            }
        }
        for (i = -55; i < -28; i++) {
            buf[771] = (byte) i;
            if (sha1_32(buf) == -179563335) {
                break;
            }
        }
        for (i = 70; i < 90; i++) {
            buf[772] = (byte) i;
            if (sha1_32(buf) == 1789220879) {
                break;
            }
        }
        for (i = -28; i < -17; i++) {
            buf[773] = (byte) i;
            if (sha1_32(buf) == 175889503) {
                break;
            }
        }
        for (i = -28; i < -13; i++) {
            buf[774] = (byte) i;
            if (sha1_32(buf) == -902486636) {
                break;
            }
        }
        for (i = -45; i < -30; i++) {
            buf[775] = (byte) i;
            if (sha1_32(buf) == -154570905) {
                break;
            }
        }
        for (i = 117; i < 128; i++) {
            buf[776] = (byte) i;
            if (sha1_32(buf) == 1408252562) {
                break;
            }
        }
        for (i = -113; i < -93; i++) {
            buf[777] = (byte) i;
            if (sha1_32(buf) == -543676111) {
                break;
            }
        }
        for (i = 111; i < 125; i++) {
            buf[778] = (byte) i;
            if (sha1_32(buf) == 1927158887) {
                break;
            }
        }
        for (i = -56; i < -36; i++) {
            buf[779] = (byte) i;
            if (sha1_32(buf) == -198600037) {
                break;
            }
        }
        for (i = 87; i < 107; i++) {
            buf[780] = (byte) i;
            if (sha1_32(buf) == 1380643692) {
                break;
            }
        }
        for (i = 54; i < 66; i++) {
            buf[781] = (byte) i;
            if (sha1_32(buf) == 2127870225) {
                break;
            }
        }
        for (i = -93; i < -85; i++) {
            buf[782] = (byte) i;
            if (sha1_32(buf) == -1566115834) {
                break;
            }
        }
        for (i = 83; i < 86; i++) {
            buf[783] = (byte) i;
            if (sha1_32(buf) == -898806606) {
                break;
            }
        }
        for (i = 26; i < 45; i++) {
            buf[784] = (byte) i;
            if (sha1_32(buf) == 1188341253) {
                break;
            }
        }
        for (i = 65; i < 75; i++) {
            buf[785] = (byte) i;
            if (sha1_32(buf) == 1955473456) {
                break;
            }
        }
        for (i = -115; i < -103; i++) {
            buf[786] = (byte) i;
            if (sha1_32(buf) == -1982622568) {
                break;
            }
        }
        for (i = 86; i < 109; i++) {
            buf[787] = (byte) i;
            if (sha1_32(buf) == 311072545) {
                break;
            }
        }
        for (i = 71; i < 86; i++) {
            buf[788] = (byte) i;
            if (sha1_32(buf) == -2128933887) {
                break;
            }
        }
        for (i = -76; i < -64; i++) {
            buf[789] = (byte) i;
            if (sha1_32(buf) == 1137246744) {
                break;
            }
        }
        for (i = -29; i < -12; i++) {
            buf[790] = (byte) i;
            if (sha1_32(buf) == -535506020) {
                break;
            }
        }
        for (i = 23; i < 37; i++) {
            buf[791] = (byte) i;
            if (sha1_32(buf) == 2023350646) {
                break;
            }
        }
        for (i = 23; i < 32; i++) {
            buf[792] = (byte) i;
            if (sha1_32(buf) == -378600127) {
                break;
            }
        }
        for (i = -87; i < -69; i++) {
            buf[793] = (byte) i;
            if (sha1_32(buf) == 1660033846) {
                break;
            }
        }
        for (i = 92; i < 110; i++) {
            buf[794] = (byte) i;
            if (sha1_32(buf) == 1817767423) {
                break;
            }
        }
        for (i = 18; i < 39; i++) {
            buf[795] = (byte) i;
            if (sha1_32(buf) == 1233421253) {
                break;
            }
        }
        for (i = -128; i < -108; i++) {
            buf[796] = (byte) i;
            if (sha1_32(buf) == 51904800) {
                break;
            }
        }
        for (i = -104; i < -90; i++) {
            buf[797] = (byte) i;
            if (sha1_32(buf) == -714678312) {
                break;
            }
        }
        for (i = -47; i < -37; i++) {
            buf[798] = (byte) i;
            if (sha1_32(buf) == 818850224) {
                break;
            }
        }
        for (i = 2; i < 20; i++) {
            buf[799] = (byte) i;
            if (sha1_32(buf) == -2082668768) {
                break;
            }
        }
        for (i = 73; i < 99; i++) {
            buf[800] = (byte) i;
            if (sha1_32(buf) == -1308014988) {
                break;
            }
        }
        for (i = -72; i < -58; i++) {
            buf[801] = (byte) i;
            if (sha1_32(buf) == -56442974) {
                break;
            }
        }
        for (i = -19; i < 0; i++) {
            buf[802] = (byte) i;
            if (sha1_32(buf) == -1099275660) {
                break;
            }
        }
        for (i = 13; i < 28; i++) {
            buf[803] = (byte) i;
            if (sha1_32(buf) == -769135720) {
                break;
            }
        }
        for (i = -128; i < -118; i++) {
            buf[804] = (byte) i;
            if (sha1_32(buf) == -1413319547) {
                break;
            }
        }
        for (i = 77; i < 91; i++) {
            buf[805] = (byte) i;
            if (sha1_32(buf) == 1771669663) {
                break;
            }
        }
        for (i = 64; i < 85; i++) {
            buf[806] = (byte) i;
            if (sha1_32(buf) == 1776870397) {
                break;
            }
        }
        for (i = 68; i < 95; i++) {
            buf[807] = (byte) i;
            if (sha1_32(buf) == -1974984853) {
                break;
            }
        }
        for (i = 12; i < 26; i++) {
            buf[808] = (byte) i;
            if (sha1_32(buf) == -942900733) {
                break;
            }
        }
        for (i = -31; i < -14; i++) {
            buf[809] = (byte) i;
            if (sha1_32(buf) == -907455148) {
                break;
            }
        }
        for (i = 60; i < 67; i++) {
            buf[810] = (byte) i;
            if (sha1_32(buf) == -2076792563) {
                break;
            }
        }
        for (i = 11; i < 26; i++) {
            buf[811] = (byte) i;
            if (sha1_32(buf) == -1662634303) {
                break;
            }
        }
        for (i = 113; i < 128; i++) {
            buf[812] = (byte) i;
            if (sha1_32(buf) == 86550451) {
                break;
            }
        }
        for (i = -128; i < -111; i++) {
            buf[813] = (byte) i;
            if (sha1_32(buf) == 1495789540) {
                break;
            }
        }
        for (i = 29; i < 45; i++) {
            buf[814] = (byte) i;
            if (sha1_32(buf) == 914193753) {
                break;
            }
        }
        for (i = -12; i < 7; i++) {
            buf[815] = (byte) i;
            if (sha1_32(buf) == 1057236931) {
                break;
            }
        }
        for (i = -71; i < -56; i++) {
            buf[816] = (byte) i;
            if (sha1_32(buf) == 1387299206) {
                break;
            }
        }
        for (i = 41; i < 58; i++) {
            buf[817] = (byte) i;
            if (sha1_32(buf) == -777024334) {
                break;
            }
        }
        for (i = -75; i < -56; i++) {
            buf[818] = (byte) i;
            if (sha1_32(buf) == -1563718484) {
                break;
            }
        }
        for (i = -70; i < -41; i++) {
            buf[819] = (byte) i;
            if (sha1_32(buf) == -828715371) {
                break;
            }
        }
        for (i = 44; i < 60; i++) {
            buf[820] = (byte) i;
            if (sha1_32(buf) == -8918356) {
                break;
            }
        }
        for (i = -4; i < 6; i++) {
            buf[821] = (byte) i;
            if (sha1_32(buf) == 405369211) {
                break;
            }
        }
        for (i = 82; i < 111; i++) {
            buf[822] = (byte) i;
            if (sha1_32(buf) == 621119732) {
                break;
            }
        }
        for (i = 31; i < 42; i++) {
            buf[823] = (byte) i;
            if (sha1_32(buf) == -394995132) {
                break;
            }
        }
        for (i = -57; i < -55; i++) {
            buf[824] = (byte) i;
            if (sha1_32(buf) == -893821611) {
                break;
            }
        }
        for (i = -60; i < -55; i++) {
            buf[825] = (byte) i;
            if (sha1_32(buf) == 537754054) {
                break;
            }
        }
        for (i = -107; i < -99; i++) {
            buf[826] = (byte) i;
            if (sha1_32(buf) == -1612748004) {
                break;
            }
        }
        for (i = 58; i < 63; i++) {
            buf[827] = (byte) i;
            if (sha1_32(buf) == 392126346) {
                break;
            }
        }
        for (i = -128; i < -104; i++) {
            buf[828] = (byte) i;
            if (sha1_32(buf) == -391680264) {
                break;
            }
        }
        for (i = -92; i < -74; i++) {
            buf[829] = (byte) i;
            if (sha1_32(buf) == -332101011) {
                break;
            }
        }
        for (i = -2; i < 13; i++) {
            buf[830] = (byte) i;
            if (sha1_32(buf) == 1366071372) {
                break;
            }
        }
        for (i = -46; i < -42; i++) {
            buf[831] = (byte) i;
            if (sha1_32(buf) == -1559132772) {
                break;
            }
        }
        for (i = -86; i < -69; i++) {
            buf[832] = (byte) i;
            if (sha1_32(buf) == -1894449510) {
                break;
            }
        }
        for (i = 29; i < 43; i++) {
            buf[833] = (byte) i;
            if (sha1_32(buf) == -771333967) {
                break;
            }
        }
        for (i = 24; i < 32; i++) {
            buf[834] = (byte) i;
            if (sha1_32(buf) == 102059050) {
                break;
            }
        }
        for (i = 70; i < 92; i++) {
            buf[835] = (byte) i;
            if (sha1_32(buf) == 249893220) {
                break;
            }
        }
        for (i = -4; i < 10; i++) {
            buf[836] = (byte) i;
            if (sha1_32(buf) == 1019308961) {
                break;
            }
        }
        for (i = 21; i < 39; i++) {
            buf[837] = (byte) i;
            if (sha1_32(buf) == -923882251) {
                break;
            }
        }
        for (i = -115; i < -104; i++) {
            buf[838] = (byte) i;
            if (sha1_32(buf) == 1608344802) {
                break;
            }
        }
        for (i = -58; i < -36; i++) {
            buf[839] = (byte) i;
            if (sha1_32(buf) == 754058554) {
                break;
            }
        }
        for (i = 54; i < 77; i++) {
            buf[840] = (byte) i;
            if (sha1_32(buf) == -1587035389) {
                break;
            }
        }
        for (i = -9; i < -3; i++) {
            buf[841] = (byte) i;
            if (sha1_32(buf) == 349893158) {
                break;
            }
        }
        for (i = -128; i < -107; i++) {
            buf[842] = (byte) i;
            if (sha1_32(buf) == 20011418) {
                break;
            }
        }
        for (i = -91; i < -76; i++) {
            buf[843] = (byte) i;
            if (sha1_32(buf) == 1269760487) {
                break;
            }
        }
        for (i = 51; i < 57; i++) {
            buf[844] = (byte) i;
            if (sha1_32(buf) == -1729395380) {
                break;
            }
        }
        for (i = 7; i < 13; i++) {
            buf[845] = (byte) i;
            if (sha1_32(buf) == 196246357) {
                break;
            }
        }
        for (i = -100; i < -86; i++) {
            buf[846] = (byte) i;
            if (sha1_32(buf) == 1619362276) {
                break;
            }
        }
        for (i = 9; i < 23; i++) {
            buf[847] = (byte) i;
            if (sha1_32(buf) == 723576895) {
                break;
            }
        }
        for (i = -82; i < -64; i++) {
            buf[848] = (byte) i;
            if (sha1_32(buf) == 2047511636) {
                break;
            }
        }
        for (i = 112; i < 120; i++) {
            buf[849] = (byte) i;
            if (sha1_32(buf) == 27714568) {
                break;
            }
        }
        for (i = -22; i < 0; i++) {
            buf[850] = (byte) i;
            if (sha1_32(buf) == 880565700) {
                break;
            }
        }
        for (i = 29; i < 56; i++) {
            buf[851] = (byte) i;
            if (sha1_32(buf) == -1803191630) {
                break;
            }
        }
        for (i = -64; i < -57; i++) {
            buf[852] = (byte) i;
            if (sha1_32(buf) == 735082404) {
                break;
            }
        }
        for (i = 51; i < 66; i++) {
            buf[853] = (byte) i;
            if (sha1_32(buf) == -275279958) {
                break;
            }
        }
        for (i = 100; i < 114; i++) {
            buf[854] = (byte) i;
            if (sha1_32(buf) == 891650503) {
                break;
            }
        }
        for (i = 16; i < 34; i++) {
            buf[855] = (byte) i;
            if (sha1_32(buf) == 2123157166) {
                break;
            }
        }
        for (i = 58; i < 73; i++) {
            buf[856] = (byte) i;
            if (sha1_32(buf) == 529669788) {
                break;
            }
        }
        for (i = -9; i < 9; i++) {
            buf[857] = (byte) i;
            if (sha1_32(buf) == 1162861957) {
                break;
            }
        }
        for (i = 18; i < 36; i++) {
            buf[858] = (byte) i;
            if (sha1_32(buf) == 757795290) {
                break;
            }
        }
        for (i = 15; i < 23; i++) {
            buf[859] = (byte) i;
            if (sha1_32(buf) == 792263934) {
                break;
            }
        }
        for (i = 117; i < 128; i++) {
            buf[860] = (byte) i;
            if (sha1_32(buf) == 1355720265) {
                break;
            }
        }
        for (i = -45; i < -27; i++) {
            buf[861] = (byte) i;
            if (sha1_32(buf) == 1434518988) {
                break;
            }
        }
        for (i = 70; i < 88; i++) {
            buf[862] = (byte) i;
            if (sha1_32(buf) == -1760069395) {
                break;
            }
        }
        for (i = 83; i < 105; i++) {
            buf[863] = (byte) i;
            if (sha1_32(buf) == -1036163711) {
                break;
            }
        }
        for (i = -17; i < 13; i++) {
            buf[864] = (byte) i;
            if (sha1_32(buf) == 51398629) {
                break;
            }
        }
        for (i = -110; i < -86; i++) {
            buf[865] = (byte) i;
            if (sha1_32(buf) == -410859623) {
                break;
            }
        }
        for (i = -29; i < -9; i++) {
            buf[866] = (byte) i;
            if (sha1_32(buf) == -1873484636) {
                break;
            }
        }
        for (i = -100; i < -89; i++) {
            buf[867] = (byte) i;
            if (sha1_32(buf) == -517482129) {
                break;
            }
        }
        for (i = -43; i < -30; i++) {
            buf[868] = (byte) i;
            if (sha1_32(buf) == -182050621) {
                break;
            }
        }
        for (i = 75; i < 79; i++) {
            buf[869] = (byte) i;
            if (sha1_32(buf) == 1300413620) {
                break;
            }
        }
        for (i = 112; i < 127; i++) {
            buf[870] = (byte) i;
            if (sha1_32(buf) == -1373716497) {
                break;
            }
        }
        for (i = 100; i < 112; i++) {
            buf[871] = (byte) i;
            if (sha1_32(buf) == -681918071) {
                break;
            }
        }
        for (i = -5; i < 12; i++) {
            buf[872] = (byte) i;
            if (sha1_32(buf) == -835261841) {
                break;
            }
        }
        for (i = -19; i < 7; i++) {
            buf[873] = (byte) i;
            if (sha1_32(buf) == 1368339570) {
                break;
            }
        }
        for (i = 20; i < 24; i++) {
            buf[874] = (byte) i;
            if (sha1_32(buf) == 1498210096) {
                break;
            }
        }
        for (i = -128; i < -111; i++) {
            buf[875] = (byte) i;
            if (sha1_32(buf) == 326203381) {
                break;
            }
        }
        for (i = 90; i < 108; i++) {
            buf[876] = (byte) i;
            if (sha1_32(buf) == -758505136) {
                break;
            }
        }
        for (i = 27; i < 48; i++) {
            buf[877] = (byte) i;
            if (sha1_32(buf) == -933571852) {
                break;
            }
        }
        for (i = -64; i < -49; i++) {
            buf[878] = (byte) i;
            if (sha1_32(buf) == -219886200) {
                break;
            }
        }
        for (i = -31; i < -5; i++) {
            buf[879] = (byte) i;
            if (sha1_32(buf) == 186725454) {
                break;
            }
        }
        for (i = -128; i < -125; i++) {
            buf[880] = (byte) i;
            if (sha1_32(buf) == -1595881144) {
                break;
            }
        }
        for (i = -67; i < -49; i++) {
            buf[881] = (byte) i;
            if (sha1_32(buf) == 201420952) {
                break;
            }
        }
        for (i = -13; i < -1; i++) {
            buf[882] = (byte) i;
            if (sha1_32(buf) == -1456605234) {
                break;
            }
        }
        for (i = 39; i < 50; i++) {
            buf[883] = (byte) i;
            if (sha1_32(buf) == -1508734737) {
                break;
            }
        }
        for (i = 80; i < 111; i++) {
            buf[884] = (byte) i;
            if (sha1_32(buf) == 1125765641) {
                break;
            }
        }
        for (i = -89; i < -84; i++) {
            buf[885] = (byte) i;
            if (sha1_32(buf) == 738230238) {
                break;
            }
        }
        for (i = 91; i < 107; i++) {
            buf[886] = (byte) i;
            if (sha1_32(buf) == -105051309) {
                break;
            }
        }
        for (i = -18; i < -1; i++) {
            buf[887] = (byte) i;
            if (sha1_32(buf) == 1982465736) {
                break;
            }
        }
        for (i = -110; i < -82; i++) {
            buf[888] = (byte) i;
            if (sha1_32(buf) == 1211189492) {
                break;
            }
        }
        for (i = -16; i < -12; i++) {
            buf[889] = (byte) i;
            if (sha1_32(buf) == -1605909532) {
                break;
            }
        }
        for (i = -111; i < -99; i++) {
            buf[890] = (byte) i;
            if (sha1_32(buf) == 869934151) {
                break;
            }
        }
        for (i = -16; i < -14; i++) {
            buf[891] = (byte) i;
            if (sha1_32(buf) == -1190507228) {
                break;
            }
        }
        for (i = 47; i < 64; i++) {
            buf[892] = (byte) i;
            if (sha1_32(buf) == -198300744) {
                break;
            }
        }
        for (i = -34; i < -12; i++) {
            buf[893] = (byte) i;
            if (sha1_32(buf) == 1812682689) {
                break;
            }
        }
        for (i = 83; i < 88; i++) {
            buf[894] = (byte) i;
            if (sha1_32(buf) == -1827260837) {
                break;
            }
        }
        for (i = -122; i < -92; i++) {
            buf[895] = (byte) i;
            if (sha1_32(buf) == -535242373) {
                break;
            }
        }
        for (i = 27; i < 49; i++) {
            buf[896] = (byte) i;
            if (sha1_32(buf) == -766789061) {
                break;
            }
        }
        for (i = 28; i < 48; i++) {
            buf[897] = (byte) i;
            if (sha1_32(buf) == 173824602) {
                break;
            }
        }
        for (i = -23; i < -2; i++) {
            buf[898] = (byte) i;
            if (sha1_32(buf) == -1980768123) {
                break;
            }
        }
        for (i = -92; i < -73; i++) {
            buf[899] = (byte) i;
            if (sha1_32(buf) == -2000704638) {
                break;
            }
        }
        for (i = -72; i < -52; i++) {
            buf[900] = (byte) i;
            if (sha1_32(buf) == -1244803691) {
                break;
            }
        }
        for (i = -44; i < -30; i++) {
            buf[901] = (byte) i;
            if (sha1_32(buf) == -486658246) {
                break;
            }
        }
        for (i = 59; i < 75; i++) {
            buf[902] = (byte) i;
            if (sha1_32(buf) == -1585604626) {
                break;
            }
        }
        for (i = -123; i < -109; i++) {
            buf[903] = (byte) i;
            if (sha1_32(buf) == 892141509) {
                break;
            }
        }
        for (i = -107; i < -90; i++) {
            buf[904] = (byte) i;
            if (sha1_32(buf) == 500894547) {
                break;
            }
        }
        for (i = 3; i < 16; i++) {
            buf[905] = (byte) i;
            if (sha1_32(buf) == 263120058) {
                break;
            }
        }
        for (i = -66; i < -48; i++) {
            buf[906] = (byte) i;
            if (sha1_32(buf) == 1798370281) {
                break;
            }
        }
        for (i = -125; i < -102; i++) {
            buf[907] = (byte) i;
            if (sha1_32(buf) == -996538394) {
                break;
            }
        }
        for (i = 2; i < 12; i++) {
            buf[908] = (byte) i;
            if (sha1_32(buf) == -1121869107) {
                break;
            }
        }
        for (i = -33; i < -18; i++) {
            buf[909] = (byte) i;
            if (sha1_32(buf) == 1094114472) {
                break;
            }
        }
        for (i = 92; i < 106; i++) {
            buf[910] = (byte) i;
            if (sha1_32(buf) == 1038552185) {
                break;
            }
        }
        for (i = -58; i < -49; i++) {
            buf[911] = (byte) i;
            if (sha1_32(buf) == 999767816) {
                break;
            }
        }
        for (i = -9; i < 5; i++) {
            buf[912] = (byte) i;
            if (sha1_32(buf) == -86192754) {
                break;
            }
        }
        for (i = 44; i < 69; i++) {
            buf[913] = (byte) i;
            if (sha1_32(buf) == 198941049) {
                break;
            }
        }
        for (i = -118; i < -111; i++) {
            buf[914] = (byte) i;
            if (sha1_32(buf) == 2044889184) {
                break;
            }
        }
        for (i = -63; i < -41; i++) {
            buf[915] = (byte) i;
            if (sha1_32(buf) == 372121724) {
                break;
            }
        }
        for (i = -127; i < -105; i++) {
            buf[916] = (byte) i;
            if (sha1_32(buf) == 49081633) {
                break;
            }
        }
        for (i = 24; i < 35; i++) {
            buf[917] = (byte) i;
            if (sha1_32(buf) == 1874250629) {
                break;
            }
        }
        for (i = 56; i < 78; i++) {
            buf[918] = (byte) i;
            if (sha1_32(buf) == -317228828) {
                break;
            }
        }
        for (i = -120; i < -111; i++) {
            buf[919] = (byte) i;
            if (sha1_32(buf) == 938489158) {
                break;
            }
        }
        for (i = -60; i < -50; i++) {
            buf[920] = (byte) i;
            if (sha1_32(buf) == 342550923) {
                break;
            }
        }
        for (i = 64; i < 78; i++) {
            buf[921] = (byte) i;
            if (sha1_32(buf) == 484171402) {
                break;
            }
        }
        for (i = 45; i < 65; i++) {
            buf[922] = (byte) i;
            if (sha1_32(buf) == -1959585210) {
                break;
            }
        }
        for (i = 55; i < 62; i++) {
            buf[923] = (byte) i;
            if (sha1_32(buf) == -2120137427) {
                break;
            }
        }
        for (i = 103; i < 128; i++) {
            buf[924] = (byte) i;
            if (sha1_32(buf) == 1082185288) {
                break;
            }
        }
        for (i = -9; i < 12; i++) {
            buf[925] = (byte) i;
            if (sha1_32(buf) == 1082185288) {
                break;
            }
        }
        for (i = -36; i < -22; i++) {
            buf[926] = (byte) i;
            if (sha1_32(buf) == 1263096707) {
                break;
            }
        }
        for (i = -51; i < -26; i++) {
            buf[927] = (byte) i;
            if (sha1_32(buf) == 42872283) {
                break;
            }
        }
        for (i = 39; i < 56; i++) {
            buf[928] = (byte) i;
            if (sha1_32(buf) == 1023314994) {
                break;
            }
        }
        for (i = -78; i < -55; i++) {
            buf[929] = (byte) i;
            if (sha1_32(buf) == 153221796) {
                break;
            }
        }
        for (i = 42; i < 61; i++) {
            buf[930] = (byte) i;
            if (sha1_32(buf) == -1906893358) {
                break;
            }
        }
        for (i = -128; i < -121; i++) {
            buf[931] = (byte) i;
            if (sha1_32(buf) == -1057122748) {
                break;
            }
        }
        for (i = -59; i < -50; i++) {
            buf[932] = (byte) i;
            if (sha1_32(buf) == 293984282) {
                break;
            }
        }
        for (i = 15; i < 35; i++) {
            buf[933] = (byte) i;
            if (sha1_32(buf) == 1035434401) {
                break;
            }
        }
        for (i = 65; i < 73; i++) {
            buf[934] = (byte) i;
            if (sha1_32(buf) == 883875761) {
                break;
            }
        }
        for (i = -45; i < -30; i++) {
            buf[935] = (byte) i;
            if (sha1_32(buf) == -467050585) {
                break;
            }
        }
        for (i = 125; i < 128; i++) {
            buf[936] = (byte) i;
            if (sha1_32(buf) == -1643563834) {
                break;
            }
        }
        for (i = -89; i < -69; i++) {
            buf[937] = (byte) i;
            if (sha1_32(buf) == 2112741256) {
                break;
            }
        }
        for (i = -65; i < -42; i++) {
            buf[938] = (byte) i;
            if (sha1_32(buf) == 1061011401) {
                break;
            }
        }
        for (i = -15; i < -3; i++) {
            buf[939] = (byte) i;
            if (sha1_32(buf) == 537417764) {
                break;
            }
        }
        for (i = -119; i < -106; i++) {
            buf[940] = (byte) i;
            if (sha1_32(buf) == -705730810) {
                break;
            }
        }
        for (i = 9; i < 22; i++) {
            buf[941] = (byte) i;
            if (sha1_32(buf) == 1765574746) {
                break;
            }
        }
        for (i = -94; i < -82; i++) {
            buf[942] = (byte) i;
            if (sha1_32(buf) == 694250544) {
                break;
            }
        }
        for (i = -128; i < -107; i++) {
            buf[943] = (byte) i;
            if (sha1_32(buf) == 309994820) {
                break;
            }
        }
        for (i = 44; i < 66; i++) {
            buf[944] = (byte) i;
            if (sha1_32(buf) == 97440545) {
                break;
            }
        }
        for (i = -127; i < -98; i++) {
            buf[945] = (byte) i;
            if (sha1_32(buf) == 1177756262) {
                break;
            }
        }
        for (i = 6; i < 34; i++) {
            buf[946] = (byte) i;
            if (sha1_32(buf) == -1969940515) {
                break;
            }
        }
        for (i = -117; i < -111; i++) {
            buf[947] = (byte) i;
            if (sha1_32(buf) == -900655381) {
                break;
            }
        }
        for (i = -100; i < -85; i++) {
            buf[948] = (byte) i;
            if (sha1_32(buf) == 1941060475) {
                break;
            }
        }
        for (i = 40; i < 48; i++) {
            buf[949] = (byte) i;
            if (sha1_32(buf) == -1100549421) {
                break;
            }
        }
        for (i = 102; i < 128; i++) {
            buf[950] = (byte) i;
            if (sha1_32(buf) == -555333362) {
                break;
            }
        }
        for (i = -15; i < -3; i++) {
            buf[951] = (byte) i;
            if (sha1_32(buf) == 975742851) {
                break;
            }
        }
        for (i = -46; i < -30; i++) {
            buf[952] = (byte) i;
            if (sha1_32(buf) == 1683707980) {
                break;
            }
        }
        for (i = 101; i < 118; i++) {
            buf[953] = (byte) i;
            if (sha1_32(buf) == 2060481269) {
                break;
            }
        }
        for (i = 5; i < 18; i++) {
            buf[954] = (byte) i;
            if (sha1_32(buf) == -1497168087) {
                break;
            }
        }
        for (i = -51; i < -41; i++) {
            buf[955] = (byte) i;
            if (sha1_32(buf) == 932390401) {
                break;
            }
        }
        for (i = 17; i < 30; i++) {
            buf[956] = (byte) i;
            if (sha1_32(buf) == 1588869729) {
                break;
            }
        }
        for (i = -121; i < -103; i++) {
            buf[957] = (byte) i;
            if (sha1_32(buf) == -195345206) {
                break;
            }
        }
        for (i = -109; i < -97; i++) {
            buf[958] = (byte) i;
            if (sha1_32(buf) == -1746282947) {
                break;
            }
        }
        for (i = 3; i < 17; i++) {
            buf[959] = (byte) i;
            if (sha1_32(buf) == 1452470689) {
                break;
            }
        }
        for (i = 19; i < 41; i++) {
            buf[960] = (byte) i;
            if (sha1_32(buf) == -2109876244) {
                break;
            }
        }
        for (i = 18; i < 32; i++) {
            buf[961] = (byte) i;
            if (sha1_32(buf) == -1458370675) {
                break;
            }
        }
        for (i = 111; i < 125; i++) {
            buf[962] = (byte) i;
            if (sha1_32(buf) == -131833928) {
                break;
            }
        }
        for (i = -83; i < -59; i++) {
            buf[963] = (byte) i;
            if (sha1_32(buf) == -1949294392) {
                break;
            }
        }
        for (i = 40; i < 51; i++) {
            buf[964] = (byte) i;
            if (sha1_32(buf) == 1326309409) {
                break;
            }
        }
        for (i = -115; i < -96; i++) {
            buf[965] = (byte) i;
            if (sha1_32(buf) == 2000019153) {
                break;
            }
        }
        for (i = -44; i < -32; i++) {
            buf[966] = (byte) i;
            if (sha1_32(buf) == -2014202785) {
                break;
            }
        }
        for (i = -107; i < -85; i++) {
            buf[967] = (byte) i;
            if (sha1_32(buf) == 1237272197) {
                break;
            }
        }
        for (i = 113; i < 128; i++) {
            buf[968] = (byte) i;
            if (sha1_32(buf) == -550909057) {
                break;
            }
        }
        for (i = -80; i < -70; i++) {
            buf[969] = (byte) i;
            if (sha1_32(buf) == -1424978439) {
                break;
            }
        }
        for (i = 8; i < 21; i++) {
            buf[970] = (byte) i;
            if (sha1_32(buf) == -1675497293) {
                break;
            }
        }
        for (i = -57; i < -34; i++) {
            buf[971] = (byte) i;
            if (sha1_32(buf) == -1918027630) {
                break;
            }
        }
        for (i = -126; i < -105; i++) {
            buf[972] = (byte) i;
            if (sha1_32(buf) == -338344515) {
                break;
            }
        }
        for (i = -111; i < -89; i++) {
            buf[973] = (byte) i;
            if (sha1_32(buf) == 475726068) {
                break;
            }
        }
        for (i = -63; i < -47; i++) {
            buf[974] = (byte) i;
            if (sha1_32(buf) == -29288920) {
                break;
            }
        }
        for (i = 7; i < 15; i++) {
            buf[975] = (byte) i;
            if (sha1_32(buf) == 1077292119) {
                break;
            }
        }
        for (i = -88; i < -71; i++) {
            buf[976] = (byte) i;
            if (sha1_32(buf) == -1354395090) {
                break;
            }
        }
        for (i = 61; i < 78; i++) {
            buf[977] = (byte) i;
            if (sha1_32(buf) == -528632629) {
                break;
            }
        }
        for (i = -75; i < -67; i++) {
            buf[978] = (byte) i;
            if (sha1_32(buf) == 738700120) {
                break;
            }
        }
        for (i = -89; i < -81; i++) {
            buf[979] = (byte) i;
            if (sha1_32(buf) == 1666860042) {
                break;
            }
        }
        for (i = -38; i < -27; i++) {
            buf[980] = (byte) i;
            if (sha1_32(buf) == -762999695) {
                break;
            }
        }
        for (i = -128; i < -118; i++) {
            buf[981] = (byte) i;
            if (sha1_32(buf) == 900926063) {
                break;
            }
        }
        for (i = 6; i < 21; i++) {
            buf[982] = (byte) i;
            if (sha1_32(buf) == 1083151509) {
                break;
            }
        }
        for (i = 104; i < 124; i++) {
            buf[983] = (byte) i;
            if (sha1_32(buf) == -99420303) {
                break;
            }
        }
        for (i = -87; i < -68; i++) {
            buf[984] = (byte) i;
            if (sha1_32(buf) == -786997778) {
                break;
            }
        }
        for (i = -128; i < -110; i++) {
            buf[985] = (byte) i;
            if (sha1_32(buf) == 991512384) {
                break;
            }
        }
        for (i = 43; i < 61; i++) {
            buf[986] = (byte) i;
            if (sha1_32(buf) == 1622519165) {
                break;
            }
        }
        for (i = -112; i < -106; i++) {
            buf[987] = (byte) i;
            if (sha1_32(buf) == 1660667797) {
                break;
            }
        }
        for (i = -32; i < -16; i++) {
            buf[988] = (byte) i;
            if (sha1_32(buf) == -692639100) {
                break;
            }
        }
        for (i = -76; i < -52; i++) {
            buf[989] = (byte) i;
            if (sha1_32(buf) == 12529188) {
                break;
            }
        }
        for (i = -125; i < -118; i++) {
            buf[990] = (byte) i;
            if (sha1_32(buf) == -558554055) {
                break;
            }
        }
        for (i = -123; i < -108; i++) {
            buf[991] = (byte) i;
            if (sha1_32(buf) == 1802658113) {
                break;
            }
        }
        for (i = -10; i < 2; i++) {
            buf[992] = (byte) i;
            if (sha1_32(buf) == -1608398155) {
                break;
            }
        }
        for (i = 100; i < 116; i++) {
            buf[993] = (byte) i;
            if (sha1_32(buf) == -1910545380) {
                break;
            }
        }
        for (i = -39; i < -18; i++) {
            buf[994] = (byte) i;
            if (sha1_32(buf) == 1270709503) {
                break;
            }
        }
        for (i = -105; i < -83; i++) {
            buf[995] = (byte) i;
            if (sha1_32(buf) == 1127285481) {
                break;
            }
        }
        for (i = 53; i < 72; i++) {
            buf[996] = (byte) i;
            if (sha1_32(buf) == 908495784) {
                break;
            }
        }
        for (i = -128; i < -109; i++) {
            buf[997] = (byte) i;
            if (sha1_32(buf) == -2022265918) {
                break;
            }
        }
        for (i = 11; i < 37; i++) {
            buf[998] = (byte) i;
            if (sha1_32(buf) == 913844102) {
                break;
            }
        }
        for (i = 0; i < 15; i++) {
            buf[999] = (byte) i;
            if (sha1_32(buf) == -1677514330) {
                break;
            }
        }
        for (i = 98; i < 121; i++) {
            buf[1000] = (byte) i;
            if (sha1_32(buf) == -1466429926) {
                break;
            }
        }
        for (i = -65; i < -51; i++) {
            buf[1001] = (byte) i;
            if (sha1_32(buf) == -1994976492) {
                break;
            }
        }
        for (i = 114; i < 128; i++) {
            buf[1002] = (byte) i;
            if (sha1_32(buf) == 1258022731) {
                break;
            }
        }
        for (i = 96; i < 110; i++) {
            buf[1003] = (byte) i;
            if (sha1_32(buf) == -1798756778) {
                break;
            }
        }
        for (i = 79; i < 92; i++) {
            buf[1004] = (byte) i;
            if (sha1_32(buf) == -35630086) {
                break;
            }
        }
        for (i = -37; i < -17; i++) {
            buf[1005] = (byte) i;
            if (sha1_32(buf) == 705473305) {
                break;
            }
        }
        for (i = -108; i < -85; i++) {
            buf[1006] = (byte) i;
            if (sha1_32(buf) == -1492838715) {
                break;
            }
        }
        for (i = 97; i < 101; i++) {
            buf[1007] = (byte) i;
            if (sha1_32(buf) == -999020498) {
                break;
            }
        }
        for (i = 9; i < 11; i++) {
            buf[1008] = (byte) i;
            if (sha1_32(buf) == -911625869) {
                break;
            }
        }
        for (i = -80; i < -73; i++) {
            buf[1009] = (byte) i;
            if (sha1_32(buf) == 2106730234) {
                break;
            }
        }
        for (i = 70; i < 81; i++) {
            buf[1010] = (byte) i;
            if (sha1_32(buf) == 1643518216) {
                break;
            }
        }
        for (i = 49; i < 78; i++) {
            buf[1011] = (byte) i;
            if (sha1_32(buf) == 1370402809) {
                break;
            }
        }
        for (i = -66; i < -54; i++) {
            buf[1012] = (byte) i;
            if (sha1_32(buf) == -665575606) {
                break;
            }
        }
        for (i = 92; i < 110; i++) {
            buf[1013] = (byte) i;
            if (sha1_32(buf) == -929372082) {
                break;
            }
        }
        for (i = 0; i < 15; i++) {
            buf[1014] = (byte) i;
            if (sha1_32(buf) == 549707323) {
                break;
            }
        }
        for (i = -95; i < -85; i++) {
            buf[1015] = (byte) i;
            if (sha1_32(buf) == 140975961) {
                break;
            }
        }
        for (i = 79; i < 95; i++) {
            buf[1016] = (byte) i;
            if (sha1_32(buf) == -1559961427) {
                break;
            }
        }
        for (i = 115; i < 127; i++) {
            buf[1017] = (byte) i;
            if (sha1_32(buf) == 2141087234) {
                break;
            }
        }
        for (i = 48; i < 73; i++) {
            buf[1018] = (byte) i;
            if (sha1_32(buf) == 260736069) {
                break;
            }
        }
        for (i = 91; i < 107; i++) {
            buf[1019] = (byte) i;
            if (sha1_32(buf) == 538435513) {
                break;
            }
        }
        for (i = 89; i < 103; i++) {
            buf[1020] = (byte) i;
            if (sha1_32(buf) == -1970544308) {
                break;
            }
        }
        for (i = -16; i < -6; i++) {
            buf[1021] = (byte) i;
            if (sha1_32(buf) == -2086830202) {
                break;
            }
        }
        for (i = 70; i < 83; i++) {
            buf[1022] = (byte) i;
            if (sha1_32(buf) == -128213602) {
                break;
            }
        }
        for (i = -63; i < -48; i++) {
            buf[1023] = (byte) i;
            if (sha1_32(buf) == -435853307) {
                break;
            }
        }
        for (i = -56; i < -33; i++) {
            buf[1024] = (byte) i;
            if (sha1_32(buf) == -1272984883) {
                break;
            }
        }
        for (i = 122; i < 125; i++) {
            buf[1025] = (byte) i;
            if (sha1_32(buf) == -1287942723) {
                break;
            }
        }
        for (i = 64; i < 85; i++) {
            buf[1026] = (byte) i;
            if (sha1_32(buf) == 1022289732) {
                break;
            }
        }
        for (i = 85; i < 102; i++) {
            buf[1027] = (byte) i;
            if (sha1_32(buf) == 1672483277) {
                break;
            }
        }
        for (i = -86; i < -70; i++) {
            buf[1028] = (byte) i;
            if (sha1_32(buf) == 542956191) {
                break;
            }
        }
        for (i = 103; i < 117; i++) {
            buf[1029] = (byte) i;
            if (sha1_32(buf) == 720307125) {
                break;
            }
        }
        for (i = 108; i < 127; i++) {
            buf[1030] = (byte) i;
            if (sha1_32(buf) == -1923643956) {
                break;
            }
        }
        for (i = 42; i < 51; i++) {
            buf[1031] = (byte) i;
            if (sha1_32(buf) == -893644772) {
                break;
            }
        }
        for (i = 30; i < 45; i++) {
            buf[1032] = (byte) i;
            if (sha1_32(buf) == 1194057858) {
                break;
            }
        }
        for (i = 21; i < 44; i++) {
            buf[1033] = (byte) i;
            if (sha1_32(buf) == -1241686362) {
                break;
            }
        }
        for (i = -10; i < 11; i++) {
            buf[1034] = (byte) i;
            if (sha1_32(buf) == 811894841) {
                break;
            }
        }
        for (i = 48; i < 76; i++) {
            buf[1035] = (byte) i;
            if (sha1_32(buf) == -1762988932) {
                break;
            }
        }
        for (i = 101; i < 117; i++) {
            buf[1036] = (byte) i;
            if (sha1_32(buf) == 963371065) {
                break;
            }
        }
        for (i = 102; i < 105; i++) {
            buf[1037] = (byte) i;
            if (sha1_32(buf) == 2073841894) {
                break;
            }
        }
        for (i = -46; i < -16; i++) {
            buf[1038] = (byte) i;
            if (sha1_32(buf) == 1130821373) {
                break;
            }
        }
        for (i = 17; i < 38; i++) {
            buf[1039] = (byte) i;
            if (sha1_32(buf) == 1396695817) {
                break;
            }
        }
        for (i = 93; i < 123; i++) {
            buf[1040] = (byte) i;
            if (sha1_32(buf) == 19934157) {
                break;
            }
        }
        for (i = 121; i < 128; i++) {
            buf[1041] = (byte) i;
            if (sha1_32(buf) == -988231371) {
                break;
            }
        }
        for (i = -35; i < -13; i++) {
            buf[1042] = (byte) i;
            if (sha1_32(buf) == -1475699708) {
                break;
            }
        }
        for (i = 30; i < 51; i++) {
            buf[1043] = (byte) i;
            if (sha1_32(buf) == 1958241462) {
                break;
            }
        }
        for (i = 80; i < 86; i++) {
            buf[1044] = (byte) i;
            if (sha1_32(buf) == -590779071) {
                break;
            }
        }
        for (i = 31; i < 53; i++) {
            buf[1045] = (byte) i;
            if (sha1_32(buf) == -350899566) {
                break;
            }
        }
        for (i = 106; i < 121; i++) {
            buf[1046] = (byte) i;
            if (sha1_32(buf) == 1132114772) {
                break;
            }
        }
        for (i = -83; i < -68; i++) {
            buf[1047] = (byte) i;
            if (sha1_32(buf) == 2125895290) {
                break;
            }
        }
        for (i = -97; i < -81; i++) {
            buf[1048] = (byte) i;
            if (sha1_32(buf) == -452982861) {
                break;
            }
        }
        for (i = 92; i < 115; i++) {
            buf[1049] = (byte) i;
            if (sha1_32(buf) == 1641778782) {
                break;
            }
        }
        for (i = -40; i < -17; i++) {
            buf[1050] = (byte) i;
            if (sha1_32(buf) == -1548332567) {
                break;
            }
        }
        for (i = -9; i < 14; i++) {
            buf[1051] = (byte) i;
            if (sha1_32(buf) == -1548332567) {
                break;
            }
        }
        for (i = -2; i < 23; i++) {
            buf[1052] = (byte) i;
            if (sha1_32(buf) == -671765178) {
                break;
            }
        }
        for (i = 75; i < 90; i++) {
            buf[1053] = (byte) i;
            if (sha1_32(buf) == -1077734009) {
                break;
            }
        }
        for (i = 79; i < 98; i++) {
            buf[1054] = (byte) i;
            if (sha1_32(buf) == -812845459) {
                break;
            }
        }
        for (i = 46; i < 63; i++) {
            buf[1055] = (byte) i;
            if (sha1_32(buf) == -648642574) {
                break;
            }
        }
        for (i = 61; i < 90; i++) {
            buf[1056] = (byte) i;
            if (sha1_32(buf) == 450639617) {
                break;
            }
        }
        for (i = 42; i < 63; i++) {
            buf[1057] = (byte) i;
            if (sha1_32(buf) == -169230299) {
                break;
            }
        }
        for (i = 12; i < 35; i++) {
            buf[1058] = (byte) i;
            if (sha1_32(buf) == -244611051) {
                break;
            }
        }
        for (i = -18; i < -1; i++) {
            buf[1059] = (byte) i;
            if (sha1_32(buf) == -1720152055) {
                break;
            }
        }
        for (i = -112; i < -91; i++) {
            buf[1060] = (byte) i;
            if (sha1_32(buf) == 322283619) {
                break;
            }
        }
        for (i = 22; i < 35; i++) {
            buf[1061] = (byte) i;
            if (sha1_32(buf) == 1038560653) {
                break;
            }
        }
        for (i = 18; i < 42; i++) {
            buf[1062] = (byte) i;
            if (sha1_32(buf) == 1927191345) {
                break;
            }
        }
        for (i = -3; i < 3; i++) {
            buf[1063] = (byte) i;
            if (sha1_32(buf) == -1464802234) {
                break;
            }
        }
        for (i = 40; i < 66; i++) {
            buf[1064] = (byte) i;
            if (sha1_32(buf) == -686132154) {
                break;
            }
        }
        for (i = -124; i < -102; i++) {
            buf[1065] = (byte) i;
            if (sha1_32(buf) == -87862947) {
                break;
            }
        }
        for (i = 89; i < 112; i++) {
            buf[1066] = (byte) i;
            if (sha1_32(buf) == -1477809099) {
                break;
            }
        }
        for (i = -128; i < -109; i++) {
            buf[1067] = (byte) i;
            if (sha1_32(buf) == 640638487) {
                break;
            }
        }
        for (i = -65; i < -57; i++) {
            buf[1068] = (byte) i;
            if (sha1_32(buf) == -610164929) {
                break;
            }
        }
        for (i = -58; i < -34; i++) {
            buf[1069] = (byte) i;
            if (sha1_32(buf) == 1464523936) {
                break;
            }
        }
        for (i = 99; i < 128; i++) {
            buf[1070] = (byte) i;
            if (sha1_32(buf) == 576217080) {
                break;
            }
        }
        for (i = -114; i < -112; i++) {
            buf[1071] = (byte) i;
            if (sha1_32(buf) == 109551193) {
                break;
            }
        }
        for (i = 32; i < 47; i++) {
            buf[1072] = (byte) i;
            if (sha1_32(buf) == -714031296) {
                break;
            }
        }
        for (i = -69; i < -50; i++) {
            buf[1073] = (byte) i;
            if (sha1_32(buf) == 85845634) {
                break;
            }
        }
        for (i = 78; i < 101; i++) {
            buf[1074] = (byte) i;
            if (sha1_32(buf) == 679779791) {
                break;
            }
        }
        for (i = -122; i < -106; i++) {
            buf[1075] = (byte) i;
            if (sha1_32(buf) == 32771159) {
                break;
            }
        }
        for (i = 93; i < 123; i++) {
            buf[1076] = (byte) i;
            if (sha1_32(buf) == 98731599) {
                break;
            }
        }
        for (i = -4; i < 11; i++) {
            buf[1077] = (byte) i;
            if (sha1_32(buf) == -202387392) {
                break;
            }
        }
        for (i = 0; i < 14; i++) {
            buf[1078] = (byte) i;
            if (sha1_32(buf) == 114286912) {
                break;
            }
        }
        for (i = -116; i < -100; i++) {
            buf[1079] = (byte) i;
            if (sha1_32(buf) == -693783795) {
                break;
            }
        }
        for (i = -59; i < -43; i++) {
            buf[1080] = (byte) i;
            if (sha1_32(buf) == -952142913) {
                break;
            }
        }
        for (i = -128; i < -116; i++) {
            buf[1081] = (byte) i;
            if (sha1_32(buf) == -1187905605) {
                break;
            }
        }
        for (i = 83; i < 93; i++) {
            buf[1082] = (byte) i;
            if (sha1_32(buf) == -320832663) {
                break;
            }
        }
        for (i = 66; i < 79; i++) {
            buf[1083] = (byte) i;
            if (sha1_32(buf) == -689073095) {
                break;
            }
        }
        for (i = -110; i < -99; i++) {
            buf[1084] = (byte) i;
            if (sha1_32(buf) == -192484457) {
                break;
            }
        }
        for (i = -128; i < -125; i++) {
            buf[1085] = (byte) i;
            if (sha1_32(buf) == 1833343396) {
                break;
            }
        }
        for (i = 97; i < 111; i++) {
            buf[1086] = (byte) i;
            if (sha1_32(buf) == -497127163) {
                break;
            }
        }
        for (i = -43; i < -29; i++) {
            buf[1087] = (byte) i;
            if (sha1_32(buf) == 1676102318) {
                break;
            }
        }
        for (i = 83; i < 88; i++) {
            buf[1088] = (byte) i;
            if (sha1_32(buf) == -1805692339) {
                break;
            }
        }
        for (i = 88; i < 103; i++) {
            buf[1089] = (byte) i;
            if (sha1_32(buf) == 461179674) {
                break;
            }
        }
        for (i = -13; i < 11; i++) {
            buf[1090] = (byte) i;
            if (sha1_32(buf) == -652425960) {
                break;
            }
        }
        for (i = 42; i < 48; i++) {
            buf[1091] = (byte) i;
            if (sha1_32(buf) == 1163529952) {
                break;
            }
        }
        for (i = -90; i < -78; i++) {
            buf[1092] = (byte) i;
            if (sha1_32(buf) == -784198142) {
                break;
            }
        }
        for (i = 37; i < 50; i++) {
            buf[1093] = (byte) i;
            if (sha1_32(buf) == 2108573462) {
                break;
            }
        }
        for (i = -22; i < -2; i++) {
            buf[1094] = (byte) i;
            if (sha1_32(buf) == 1340619181) {
                break;
            }
        }
        for (i = 49; i < 63; i++) {
            buf[1095] = (byte) i;
            if (sha1_32(buf) == 1591924815) {
                break;
            }
        }
        for (i = -70; i < -59; i++) {
            buf[1096] = (byte) i;
            if (sha1_32(buf) == -497601760) {
                break;
            }
        }
        for (i = 24; i < 45; i++) {
            buf[1097] = (byte) i;
            if (sha1_32(buf) == 311782603) {
                break;
            }
        }
        for (i = 91; i < 101; i++) {
            buf[1098] = (byte) i;
            if (sha1_32(buf) == -213691190) {
                break;
            }
        }
        for (i = 124; i < 128; i++) {
            buf[1099] = (byte) i;
            if (sha1_32(buf) == 2025678714) {
                break;
            }
        }
        for (i = 103; i < 128; i++) {
            buf[1100] = (byte) i;
            if (sha1_32(buf) == -610480100) {
                break;
            }
        }
        for (i = -54; i < -41; i++) {
            buf[1101] = (byte) i;
            if (sha1_32(buf) == 463684616) {
                break;
            }
        }
        for (i = 29; i < 50; i++) {
            buf[1102] = (byte) i;
            if (sha1_32(buf) == 84751386) {
                break;
            }
        }
        for (i = -128; i < -120; i++) {
            buf[1103] = (byte) i;
            if (sha1_32(buf) == -1870770045) {
                break;
            }
        }
        for (i = 13; i < 20; i++) {
            buf[1104] = (byte) i;
            if (sha1_32(buf) == 1523755597) {
                break;
            }
        }
        for (i = -128; i < -117; i++) {
            buf[1105] = (byte) i;
            if (sha1_32(buf) == -987756802) {
                break;
            }
        }
        for (i = 86; i < 113; i++) {
            buf[1106] = (byte) i;
            if (sha1_32(buf) == 1314965766) {
                break;
            }
        }
        for (i = -18; i < -9; i++) {
            buf[1107] = (byte) i;
            if (sha1_32(buf) == 1459636559) {
                break;
            }
        }
        for (i = -43; i < -26; i++) {
            buf[1108] = (byte) i;
            if (sha1_32(buf) == 1632123) {
                break;
            }
        }
        for (i = -128; i < -108; i++) {
            buf[1109] = (byte) i;
            if (sha1_32(buf) == -901381772) {
                break;
            }
        }
        for (i = -48; i < -36; i++) {
            buf[1110] = (byte) i;
            if (sha1_32(buf) == 2011981841) {
                break;
            }
        }
        for (i = -67; i < -54; i++) {
            buf[1111] = (byte) i;
            if (sha1_32(buf) == 1930230986) {
                break;
            }
        }
        for (i = 103; i < 128; i++) {
            buf[1112] = (byte) i;
            if (sha1_32(buf) == 1749716520) {
                break;
            }
        }
        for (i = 81; i < 96; i++) {
            buf[1113] = (byte) i;
            if (sha1_32(buf) == -755936435) {
                break;
            }
        }
        for (i = 66; i < 73; i++) {
            buf[1114] = (byte) i;
            if (sha1_32(buf) == -291447600) {
                break;
            }
        }
        for (i = -104; i < -87; i++) {
            buf[1115] = (byte) i;
            if (sha1_32(buf) == -2110049716) {
                break;
            }
        }
        for (i = -86; i < -75; i++) {
            buf[1116] = (byte) i;
            if (sha1_32(buf) == 1971994874) {
                break;
            }
        }
        for (i = 72; i < 92; i++) {
            buf[1117] = (byte) i;
            if (sha1_32(buf) == -2117075441) {
                break;
            }
        }
        for (i = -22; i < -7; i++) {
            buf[1118] = (byte) i;
            if (sha1_32(buf) == 532128716) {
                break;
            }
        }
        for (i = -105; i < -84; i++) {
            buf[1119] = (byte) i;
            if (sha1_32(buf) == -43313698) {
                break;
            }
        }
        for (i = -29; i < -22; i++) {
            buf[1120] = (byte) i;
            if (sha1_32(buf) == 877071135) {
                break;
            }
        }
        for (i = 77; i < 86; i++) {
            buf[1121] = (byte) i;
            if (sha1_32(buf) == -1291330858) {
                break;
            }
        }
        for (i = 97; i < 108; i++) {
            buf[1122] = (byte) i;
            if (sha1_32(buf) == -7881701) {
                break;
            }
        }
        for (i = -11; i < 6; i++) {
            buf[1123] = (byte) i;
            if (sha1_32(buf) == -1797532592) {
                break;
            }
        }
        for (i = -37; i < -25; i++) {
            buf[1124] = (byte) i;
            if (sha1_32(buf) == -846476497) {
                break;
            }
        }
        for (i = -66; i < -52; i++) {
            buf[1125] = (byte) i;
            if (sha1_32(buf) == 5367664) {
                break;
            }
        }
        for (i = 69; i < 99; i++) {
            buf[1126] = (byte) i;
            if (sha1_32(buf) == 1784773717) {
                break;
            }
        }
        for (i = -89; i < -83; i++) {
            buf[1127] = (byte) i;
            if (sha1_32(buf) == -1434396054) {
                break;
            }
        }
        for (i = -40; i < -30; i++) {
            buf[1128] = (byte) i;
            if (sha1_32(buf) == 1954279566) {
                break;
            }
        }
        for (i = 85; i < 104; i++) {
            buf[1129] = (byte) i;
            if (sha1_32(buf) == -1068048478) {
                break;
            }
        }
        for (i = 76; i < 95; i++) {
            buf[1130] = (byte) i;
            if (sha1_32(buf) == -1596062725) {
                break;
            }
        }
        for (i = 39; i < 65; i++) {
            buf[1131] = (byte) i;
            if (sha1_32(buf) == -208924637) {
                break;
            }
        }
        for (i = 23; i < 41; i++) {
            buf[1132] = (byte) i;
            if (sha1_32(buf) == -1832773002) {
                break;
            }
        }
        for (i = 35; i < 52; i++) {
            buf[1133] = (byte) i;
            if (sha1_32(buf) == -1460904462) {
                break;
            }
        }
        for (i = -13; i < 4; i++) {
            buf[1134] = (byte) i;
            if (sha1_32(buf) == -1719958160) {
                break;
            }
        }
        for (i = 83; i < 94; i++) {
            buf[1135] = (byte) i;
            if (sha1_32(buf) == 1583256807) {
                break;
            }
        }
        for (i = -14; i < -1; i++) {
            buf[1136] = (byte) i;
            if (sha1_32(buf) == -343943792) {
                break;
            }
        }
        for (i = -12; i < 3; i++) {
            buf[1137] = (byte) i;
            if (sha1_32(buf) == 203727028) {
                break;
            }
        }
        for (i = 51; i < 69; i++) {
            buf[1138] = (byte) i;
            if (sha1_32(buf) == -1262547097) {
                break;
            }
        }
        for (i = 60; i < 82; i++) {
            buf[1139] = (byte) i;
            if (sha1_32(buf) == -1209340791) {
                break;
            }
        }
        for (i = -64; i < -49; i++) {
            buf[1140] = (byte) i;
            if (sha1_32(buf) == -2130063024) {
                break;
            }
        }
        for (i = 46; i < 68; i++) {
            buf[1141] = (byte) i;
            if (sha1_32(buf) == -1982584832) {
                break;
            }
        }
        for (i = 39; i < 47; i++) {
            buf[1142] = (byte) i;
            if (sha1_32(buf) == 498617371) {
                break;
            }
        }
        for (i = -24; i < -6; i++) {
            buf[1143] = (byte) i;
            if (sha1_32(buf) == 1892955554) {
                break;
            }
        }
        for (i = 74; i < 78; i++) {
            buf[1144] = (byte) i;
            if (sha1_32(buf) == -407569924) {
                break;
            }
        }
        for (i = -40; i < -28; i++) {
            buf[1145] = (byte) i;
            if (sha1_32(buf) == -90123293) {
                break;
            }
        }
        for (i = 96; i < 109; i++) {
            buf[1146] = (byte) i;
            if (sha1_32(buf) == -1611022022) {
                break;
            }
        }
        for (i = -48; i < -40; i++) {
            buf[1147] = (byte) i;
            if (sha1_32(buf) == -1789368401) {
                break;
            }
        }
        for (i = 20; i < 24; i++) {
            buf[1148] = (byte) i;
            if (sha1_32(buf) == 1111084187) {
                break;
            }
        }
        for (i = 101; i < 127; i++) {
            buf[1149] = (byte) i;
            if (sha1_32(buf) == -1772244550) {
                break;
            }
        }
        for (i = -81; i < -73; i++) {
            buf[1150] = (byte) i;
            if (sha1_32(buf) == 573893836) {
                break;
            }
        }
        for (i = -16; i < 0; i++) {
            buf[1151] = (byte) i;
            if (sha1_32(buf) == -911793470) {
                break;
            }
        }
        for (i = -105; i < -87; i++) {
            buf[1152] = (byte) i;
            if (sha1_32(buf) == -1084088127) {
                break;
            }
        }
        for (i = -119; i < -110; i++) {
            buf[1153] = (byte) i;
            if (sha1_32(buf) == -1041382217) {
                break;
            }
        }
        for (i = -48; i < -37; i++) {
            buf[1154] = (byte) i;
            if (sha1_32(buf) == 1409495905) {
                break;
            }
        }
        for (i = -59; i < -50; i++) {
            buf[1155] = (byte) i;
            if (sha1_32(buf) == 2071838541) {
                break;
            }
        }
        for (i = -15; i < -3; i++) {
            buf[1156] = (byte) i;
            if (sha1_32(buf) == -1585682203) {
                break;
            }
        }
        for (i = 46; i < 67; i++) {
            buf[1157] = (byte) i;
            if (sha1_32(buf) == -293812877) {
                break;
            }
        }
        for (i = -21; i < -1; i++) {
            buf[1158] = (byte) i;
            if (sha1_32(buf) == -160931530) {
                break;
            }
        }
        for (i = -79; i < -64; i++) {
            buf[1159] = (byte) i;
            if (sha1_32(buf) == 381298008) {
                break;
            }
        }
        for (i = 8; i < 13; i++) {
            buf[1160] = (byte) i;
            if (sha1_32(buf) == -1527960238) {
                break;
            }
        }
        for (i = -56; i < -28; i++) {
            buf[1161] = (byte) i;
            if (sha1_32(buf) == -911514031) {
                break;
            }
        }
        for (i = -96; i < -71; i++) {
            buf[1162] = (byte) i;
            if (sha1_32(buf) == 2123195748) {
                break;
            }
        }
        for (i = -76; i < -55; i++) {
            buf[1163] = (byte) i;
            if (sha1_32(buf) == 190091343) {
                break;
            }
        }
        for (i = -33; i < -16; i++) {
            buf[1164] = (byte) i;
            if (sha1_32(buf) == 1826189310) {
                break;
            }
        }
        for (i = -4; i < 24; i++) {
            buf[1165] = (byte) i;
            if (sha1_32(buf) == -467367722) {
                break;
            }
        }
        for (i = 114; i < 128; i++) {
            buf[1166] = (byte) i;
            if (sha1_32(buf) == -787089301) {
                break;
            }
        }
        for (i = -88; i < -74; i++) {
            buf[1167] = (byte) i;
            if (sha1_32(buf) == 552955602) {
                break;
            }
        }
        for (i = -11; i < -2; i++) {
            buf[1168] = (byte) i;
            if (sha1_32(buf) == -1674646280) {
                break;
            }
        }
        for (i = 5; i < 21; i++) {
            buf[1169] = (byte) i;
            if (sha1_32(buf) == 622122743) {
                break;
            }
        }
        for (i = -117; i < -94; i++) {
            buf[1170] = (byte) i;
            if (sha1_32(buf) == 933437904) {
                break;
            }
        }
        for (i = -47; i < -27; i++) {
            buf[1171] = (byte) i;
            if (sha1_32(buf) == 1533575222) {
                break;
            }
        }
        for (i = -16; i < 1; i++) {
            buf[1172] = (byte) i;
            if (sha1_32(buf) == 1356778776) {
                break;
            }
        }
        for (i = -32; i < -18; i++) {
            buf[1173] = (byte) i;
            if (sha1_32(buf) == 1307099401) {
                break;
            }
        }
        for (i = -32; i < -14; i++) {
            buf[1174] = (byte) i;
            if (sha1_32(buf) == 1677916303) {
                break;
            }
        }
        for (i = -7; i < 18; i++) {
            buf[1175] = (byte) i;
            if (sha1_32(buf) == 559713070) {
                break;
            }
        }
        for (i = 102; i < 123; i++) {
            buf[1176] = (byte) i;
            if (sha1_32(buf) == 1260367482) {
                break;
            }
        }
        for (i = 88; i < 95; i++) {
            buf[1177] = (byte) i;
            if (sha1_32(buf) == -943619147) {
                break;
            }
        }
        for (i = 49; i < 60; i++) {
            buf[1178] = (byte) i;
            if (sha1_32(buf) == -1316989019) {
                break;
            }
        }
        for (i = -106; i < -82; i++) {
            buf[1179] = (byte) i;
            if (sha1_32(buf) == 1525529891) {
                break;
            }
        }
        for (i = 100; i < 126; i++) {
            buf[1180] = (byte) i;
            if (sha1_32(buf) == 847397331) {
                break;
            }
        }
        for (i = -119; i < -104; i++) {
            buf[1181] = (byte) i;
            if (sha1_32(buf) == 1490741063) {
                break;
            }
        }
        for (i = 115; i < 126; i++) {
            buf[1182] = (byte) i;
            if (sha1_32(buf) == 2035320751) {
                break;
            }
        }
        for (i = 67; i < 93; i++) {
            buf[1183] = (byte) i;
            if (sha1_32(buf) == -260611394) {
                break;
            }
        }
        return buf;
    }
}
