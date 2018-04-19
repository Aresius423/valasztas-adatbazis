package schema
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.jdbc.H2Profile
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(Ejelolt.schema, Hatarszamf.schema, Jlcs.schema, Jlcssor.schema, Jlcstag.schema, Kodok.schema, Nevjegyz.schema, Oevk.schema, Oevk2014.schema, Partdelegalt.schema, Szavf.schema, Szavkor.schema, Szavlf.schema, Szavt.schema, Szeredmf.schema, Szeredmt.schema, Szervezet.schema, Szkepv.schema, Sznapi.schema, Sznapilf.schema, Telep.schema, Terulet.schema, Tlista.schema, Tlistaj.schema, Verzio.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table Ejelolt
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param maz Database column MAZ SqlType(VARCHAR), Length(2,true)
   *  @param evk Database column EVK SqlType(VARCHAR), Length(2,true)
   *  @param eid Database column EID SqlType(INTEGER)
   *  @param tajaz Database column TAJAZ SqlType(VARCHAR), Length(40,true)
   *  @param dr Database column DR SqlType(VARCHAR), Length(3,true)
   *  @param drjel Database column DRJEL SqlType(VARCHAR)
   *  @param nev Database column NEV SqlType(VARCHAR), Length(50,true)
   *  @param unev1 Database column UNEV1 SqlType(VARCHAR), Length(20,true)
   *  @param unev2 Database column UNEV2 SqlType(VARCHAR), Length(20,true)
   *  @param unevjel Database column UNEVJEL SqlType(INTEGER)
   *  @param jlcs Database column JLCS SqlType(INTEGER)
   *  @param sorsz Database column SORSZ SqlType(INTEGER)
   *  @param erv Database column ERV SqlType(INTEGER)
   *  @param allapot Database column ALLAPOT SqlType(INTEGER)
   *  @param fenykep Database column FENYKEP SqlType(INTEGER) */
  case class EjeloltRow(internalId: Int, maz: String, evk: String, eid: Int, tajaz: String, dr: Option[String], drjel: Option[Char], nev: String, unev1: String, unev2: Option[String], unevjel: Option[Int], jlcs: Int, sorsz: Option[Int], erv: Int, allapot: Int, fenykep: Option[Int])
  /** GetResult implicit for fetching EjeloltRow objects using plain SQL queries */
  implicit def GetResultEjeloltRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Char]], e4: GR[Option[Int]]): GR[EjeloltRow] = GR{
    prs => import prs._
    EjeloltRow.tupled((<<[Int], <<[String], <<[String], <<[Int], <<[String], <<?[String], <<?[Char], <<[String], <<[String], <<?[String], <<?[Int], <<[Int], <<?[Int], <<[Int], <<[Int], <<?[Int]))
  }
  /** Table description of table EJELOLT. Objects of this class serve as prototypes for rows in queries. */
  class Ejelolt(_tableTag: Tag) extends profile.api.Table[EjeloltRow](_tableTag, "EJELOLT") {
    def * = (internalId, maz, evk, eid, tajaz, dr, drjel, nev, unev1, unev2, unevjel, jlcs, sorsz, erv, allapot, fenykep) <> (EjeloltRow.tupled, EjeloltRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(maz), Rep.Some(evk), Rep.Some(eid), Rep.Some(tajaz), dr, drjel, Rep.Some(nev), Rep.Some(unev1), unev2, unevjel, Rep.Some(jlcs), sorsz, Rep.Some(erv), Rep.Some(allapot), fenykep).shaped.<>({r=>import r._; _1.map(_=> EjeloltRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7, _8.get, _9.get, _10, _11, _12.get, _13, _14.get, _15.get, _16)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column MAZ SqlType(VARCHAR), Length(2,true) */
    val maz: Rep[String] = column[String]("MAZ", O.Length(2,varying=true))
    /** Database column EVK SqlType(VARCHAR), Length(2,true) */
    val evk: Rep[String] = column[String]("EVK", O.Length(2,varying=true))
    /** Database column EID SqlType(INTEGER) */
    val eid: Rep[Int] = column[Int]("EID")
    /** Database column TAJAZ SqlType(VARCHAR), Length(40,true) */
    val tajaz: Rep[String] = column[String]("TAJAZ", O.Length(40,varying=true))
    /** Database column DR SqlType(VARCHAR), Length(3,true) */
    val dr: Rep[Option[String]] = column[Option[String]]("DR", O.Length(3,varying=true))
    /** Database column DRJEL SqlType(VARCHAR) */
    val drjel: Rep[Option[Char]] = column[Option[Char]]("DRJEL")
    /** Database column NEV SqlType(VARCHAR), Length(50,true) */
    val nev: Rep[String] = column[String]("NEV", O.Length(50,varying=true))
    /** Database column UNEV1 SqlType(VARCHAR), Length(20,true) */
    val unev1: Rep[String] = column[String]("UNEV1", O.Length(20,varying=true))
    /** Database column UNEV2 SqlType(VARCHAR), Length(20,true) */
    val unev2: Rep[Option[String]] = column[Option[String]]("UNEV2", O.Length(20,varying=true))
    /** Database column UNEVJEL SqlType(INTEGER) */
    val unevjel: Rep[Option[Int]] = column[Option[Int]]("UNEVJEL")
    /** Database column JLCS SqlType(INTEGER) */
    val jlcs: Rep[Int] = column[Int]("JLCS")
    /** Database column SORSZ SqlType(INTEGER) */
    val sorsz: Rep[Option[Int]] = column[Option[Int]]("SORSZ")
    /** Database column ERV SqlType(INTEGER) */
    val erv: Rep[Int] = column[Int]("ERV")
    /** Database column ALLAPOT SqlType(INTEGER) */
    val allapot: Rep[Int] = column[Int]("ALLAPOT")
    /** Database column FENYKEP SqlType(INTEGER) */
    val fenykep: Rep[Option[Int]] = column[Option[Int]]("FENYKEP")

    /** Index over (eid) (database name EJELOLT_EID) */
    val index1 = index("EJELOLT_EID", eid)
    /** Index over (jlcs) (database name EJELOLT_JLCS) */
    val index2 = index("EJELOLT_JLCS", jlcs)
    /** Index over (maz) (database name EJELOLT_MAZ) */
    val index3 = index("EJELOLT_MAZ", maz)
    /** Index over (sorsz) (database name EJELOLT_SORSZ) */
    val index4 = index("EJELOLT_SORSZ", sorsz)
  }
  /** Collection-like TableQuery object for table Ejelolt */
  lazy val Ejelolt = new TableQuery(tag => new Ejelolt(tag))

  /** Entity class storing rows of table Hatarszamf
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param hszav1 Database column HSZAV1 SqlType(INTEGER)
   *  @param hszav2 Database column HSZAV2 SqlType(INTEGER)
   *  @param hszav3 Database column HSZAV3 SqlType(INTEGER)
   *  @param hszav4 Database column HSZAV4 SqlType(INTEGER) */
  case class HatarszamfRow(internalId: Int, hszav1: Int, hszav2: Int, hszav3: Int, hszav4: Int)
  /** GetResult implicit for fetching HatarszamfRow objects using plain SQL queries */
  implicit def GetResultHatarszamfRow(implicit e0: GR[Int]): GR[HatarszamfRow] = GR{
    prs => import prs._
    HatarszamfRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table HATARSZAMF. Objects of this class serve as prototypes for rows in queries. */
  class Hatarszamf(_tableTag: Tag) extends profile.api.Table[HatarszamfRow](_tableTag, "HATARSZAMF") {
    def * = (internalId, hszav1, hszav2, hszav3, hszav4) <> (HatarszamfRow.tupled, HatarszamfRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(hszav1), Rep.Some(hszav2), Rep.Some(hszav3), Rep.Some(hszav4)).shaped.<>({r=>import r._; _1.map(_=> HatarszamfRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column HSZAV1 SqlType(INTEGER) */
    val hszav1: Rep[Int] = column[Int]("HSZAV1")
    /** Database column HSZAV2 SqlType(INTEGER) */
    val hszav2: Rep[Int] = column[Int]("HSZAV2")
    /** Database column HSZAV3 SqlType(INTEGER) */
    val hszav3: Rep[Int] = column[Int]("HSZAV3")
    /** Database column HSZAV4 SqlType(INTEGER) */
    val hszav4: Rep[Int] = column[Int]("HSZAV4")
  }
  /** Collection-like TableQuery object for table Hatarszamf */
  lazy val Hatarszamf = new TableQuery(tag => new Hatarszamf(tag))

  /** Entity class storing rows of table Jlcs
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param jlcs Database column JLCS SqlType(INTEGER)
   *  @param nevt Database column NEVT SqlType(VARCHAR), Length(28,true)
   *  @param tag Database column TAG SqlType(INTEGER) */
  case class JlcsRow(internalId: Int, jlcs: Int, nevt: String, tag: Int)
  /** GetResult implicit for fetching JlcsRow objects using plain SQL queries */
  implicit def GetResultJlcsRow(implicit e0: GR[Int], e1: GR[String]): GR[JlcsRow] = GR{
    prs => import prs._
    JlcsRow.tupled((<<[Int], <<[Int], <<[String], <<[Int]))
  }
  /** Table description of table JLCS. Objects of this class serve as prototypes for rows in queries. */
  class Jlcs(_tableTag: Tag) extends profile.api.Table[JlcsRow](_tableTag, "JLCS") {
    def * = (internalId, jlcs, nevt, tag) <> (JlcsRow.tupled, JlcsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(jlcs), Rep.Some(nevt), Rep.Some(tag)).shaped.<>({r=>import r._; _1.map(_=> JlcsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column JLCS SqlType(INTEGER) */
    val jlcs: Rep[Int] = column[Int]("JLCS")
    /** Database column NEVT SqlType(VARCHAR), Length(28,true) */
    val nevt: Rep[String] = column[String]("NEVT", O.Length(28,varying=true))
    /** Database column TAG SqlType(INTEGER) */
    val tag: Rep[Int] = column[Int]("TAG")

    /** Index over (jlcs) (database name JLCS_JLCS) */
    val index1 = index("JLCS_JLCS", jlcs)
  }
  /** Collection-like TableQuery object for table Jlcs */
  lazy val Jlcs = new TableQuery(tag => new Jlcs(tag))

  /** Entity class storing rows of table Jlcssor
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param tip Database column TIP SqlType(VARCHAR)
   *  @param id Database column ID SqlType(INTEGER)
   *  @param sorsz Database column SORSZ SqlType(INTEGER)
   *  @param szkod Database column SZKOD SqlType(INTEGER) */
  case class JlcssorRow(internalId: Int, tip: Char, id: Int, sorsz: Int, szkod: Int)
  /** GetResult implicit for fetching JlcssorRow objects using plain SQL queries */
  implicit def GetResultJlcssorRow(implicit e0: GR[Int], e1: GR[Char]): GR[JlcssorRow] = GR{
    prs => import prs._
    JlcssorRow.tupled((<<[Int], <<[Char], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table JLCSSOR. Objects of this class serve as prototypes for rows in queries. */
  class Jlcssor(_tableTag: Tag) extends profile.api.Table[JlcssorRow](_tableTag, "JLCSSOR") {
    def * = (internalId, tip, id, sorsz, szkod) <> (JlcssorRow.tupled, JlcssorRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(tip), Rep.Some(id), Rep.Some(sorsz), Rep.Some(szkod)).shaped.<>({r=>import r._; _1.map(_=> JlcssorRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column TIP SqlType(VARCHAR) */
    val tip: Rep[Char] = column[Char]("TIP")
    /** Database column ID SqlType(INTEGER) */
    val id: Rep[Int] = column[Int]("ID")
    /** Database column SORSZ SqlType(INTEGER) */
    val sorsz: Rep[Int] = column[Int]("SORSZ")
    /** Database column SZKOD SqlType(INTEGER) */
    val szkod: Rep[Int] = column[Int]("SZKOD")

    /** Index over (id) (database name JLCSSOR_ID) */
    val index1 = index("JLCSSOR_ID", id)
    /** Index over (sorsz) (database name JLCSSOR_SORSZ) */
    val index2 = index("JLCSSOR_SORSZ", sorsz)
    /** Index over (szkod) (database name JLCSSOR_SZKOD) */
    val index3 = index("JLCSSOR_SZKOD", szkod)
    /** Index over (tip) (database name JLCSSOR_TIP) */
    val index4 = index("JLCSSOR_TIP", tip)
  }
  /** Collection-like TableQuery object for table Jlcssor */
  lazy val Jlcssor = new TableQuery(tag => new Jlcssor(tag))

  /** Entity class storing rows of table Jlcstag
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param jlcs Database column JLCS SqlType(INTEGER)
   *  @param szkod Database column SZKOD SqlType(INTEGER)
   *  @param sorsz Database column SORSZ SqlType(INTEGER) */
  case class JlcstagRow(internalId: Int, jlcs: Int, szkod: Int, sorsz: Int)
  /** GetResult implicit for fetching JlcstagRow objects using plain SQL queries */
  implicit def GetResultJlcstagRow(implicit e0: GR[Int]): GR[JlcstagRow] = GR{
    prs => import prs._
    JlcstagRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table JLCSTAG. Objects of this class serve as prototypes for rows in queries. */
  class Jlcstag(_tableTag: Tag) extends profile.api.Table[JlcstagRow](_tableTag, "JLCSTAG") {
    def * = (internalId, jlcs, szkod, sorsz) <> (JlcstagRow.tupled, JlcstagRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(jlcs), Rep.Some(szkod), Rep.Some(sorsz)).shaped.<>({r=>import r._; _1.map(_=> JlcstagRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column JLCS SqlType(INTEGER) */
    val jlcs: Rep[Int] = column[Int]("JLCS")
    /** Database column SZKOD SqlType(INTEGER) */
    val szkod: Rep[Int] = column[Int]("SZKOD")
    /** Database column SORSZ SqlType(INTEGER) */
    val sorsz: Rep[Int] = column[Int]("SORSZ")

    /** Index over (jlcs) (database name JLCSTAG_JLCS) */
    val index1 = index("JLCSTAG_JLCS", jlcs)
    /** Index over (sorsz) (database name JLCSTAG_SORSZ) */
    val index2 = index("JLCSTAG_SORSZ", sorsz)
    /** Index over (szkod) (database name JLCSTAG_SZKOD) */
    val index3 = index("JLCSTAG_SZKOD", szkod)
  }
  /** Collection-like TableQuery object for table Jlcstag */
  lazy val Jlcstag = new TableQuery(tag => new Jlcstag(tag))

  /** Entity class storing rows of table Kodok
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param kodcsop Database column KODCSOP SqlType(VARCHAR), Length(9,true)
   *  @param kod Database column KOD SqlType(VARCHAR), Length(2,true)
   *  @param szoveg Database column SZOVEG SqlType(VARCHAR), Length(73,true) */
  case class KodokRow(internalId: Int, kodcsop: String, kod: String, szoveg: String)
  /** GetResult implicit for fetching KodokRow objects using plain SQL queries */
  implicit def GetResultKodokRow(implicit e0: GR[Int], e1: GR[String]): GR[KodokRow] = GR{
    prs => import prs._
    KodokRow.tupled((<<[Int], <<[String], <<[String], <<[String]))
  }
  /** Table description of table KODOK. Objects of this class serve as prototypes for rows in queries. */
  class Kodok(_tableTag: Tag) extends profile.api.Table[KodokRow](_tableTag, "KODOK") {
    def * = (internalId, kodcsop, kod, szoveg) <> (KodokRow.tupled, KodokRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(kodcsop), Rep.Some(kod), Rep.Some(szoveg)).shaped.<>({r=>import r._; _1.map(_=> KodokRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column KODCSOP SqlType(VARCHAR), Length(9,true) */
    val kodcsop: Rep[String] = column[String]("KODCSOP", O.Length(9,varying=true))
    /** Database column KOD SqlType(VARCHAR), Length(2,true) */
    val kod: Rep[String] = column[String]("KOD", O.Length(2,varying=true))
    /** Database column SZOVEG SqlType(VARCHAR), Length(73,true) */
    val szoveg: Rep[String] = column[String]("SZOVEG", O.Length(73,varying=true))

    /** Index over (kod) (database name KODOK_KOD) */
    val index1 = index("KODOK_KOD", kod)
    /** Index over (kodcsop) (database name KODOK_KODCSOP) */
    val index2 = index("KODOK_KODCSOP", kodcsop)
  }
  /** Collection-like TableQuery object for table Kodok */
  lazy val Kodok = new TableQuery(tag => new Kodok(tag))

  /** Row type of table Nevjegyz */
  type NevjegyzRow = HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for NevjegyzRow providing default values if available in the database schema. */
  def NevjegyzRow(internalId: Int, nszossz: Int, nszegy: Int, nszplist: Int, nsznemz: Int, nkossz: Int, nkegyeni: Int, nkplist: Int, nknemz: Int, naossz: Int, naegyeni: Int, naplist: Int, nanemz: Int, nlsz: Int, nnossz: Int, nbolgar: Int, ngorog: Int, nhorvat: Int, nlengyel: Int, nnemet: Int, normeny: Int, nroma: Int, nroman: Int, nruszin: Int, nszerb: Int, nszlovak: Int, nszloven: Int, nukran: Int): NevjegyzRow = {
    internalId :: nszossz :: nszegy :: nszplist :: nsznemz :: nkossz :: nkegyeni :: nkplist :: nknemz :: naossz :: naegyeni :: naplist :: nanemz :: nlsz :: nnossz :: nbolgar :: ngorog :: nhorvat :: nlengyel :: nnemet :: normeny :: nroma :: nroman :: nruszin :: nszerb :: nszlovak :: nszloven :: nukran :: HNil
  }
  /** GetResult implicit for fetching NevjegyzRow objects using plain SQL queries */
  implicit def GetResultNevjegyzRow(implicit e0: GR[Int]): GR[NevjegyzRow] = GR{
    prs => import prs._
    <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: HNil
  }
  /** Table description of table NEVJEGYZ. Objects of this class serve as prototypes for rows in queries. */
  class Nevjegyz(_tableTag: Tag) extends profile.api.Table[NevjegyzRow](_tableTag, "NEVJEGYZ") {
    def * = internalId :: nszossz :: nszegy :: nszplist :: nsznemz :: nkossz :: nkegyeni :: nkplist :: nknemz :: naossz :: naegyeni :: naplist :: nanemz :: nlsz :: nnossz :: nbolgar :: ngorog :: nhorvat :: nlengyel :: nnemet :: normeny :: nroma :: nroman :: nruszin :: nszerb :: nszlovak :: nszloven :: nukran :: HNil

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column NSZOSSZ SqlType(INTEGER) */
    val nszossz: Rep[Int] = column[Int]("NSZOSSZ")
    /** Database column NSZEGY SqlType(INTEGER) */
    val nszegy: Rep[Int] = column[Int]("NSZEGY")
    /** Database column NSZPLIST SqlType(INTEGER) */
    val nszplist: Rep[Int] = column[Int]("NSZPLIST")
    /** Database column NSZNEMZ SqlType(INTEGER) */
    val nsznemz: Rep[Int] = column[Int]("NSZNEMZ")
    /** Database column NKOSSZ SqlType(INTEGER) */
    val nkossz: Rep[Int] = column[Int]("NKOSSZ")
    /** Database column NKEGYENI SqlType(INTEGER) */
    val nkegyeni: Rep[Int] = column[Int]("NKEGYENI")
    /** Database column NKPLIST SqlType(INTEGER) */
    val nkplist: Rep[Int] = column[Int]("NKPLIST")
    /** Database column NKNEMZ SqlType(INTEGER) */
    val nknemz: Rep[Int] = column[Int]("NKNEMZ")
    /** Database column NAOSSZ SqlType(INTEGER) */
    val naossz: Rep[Int] = column[Int]("NAOSSZ")
    /** Database column NAEGYENI SqlType(INTEGER) */
    val naegyeni: Rep[Int] = column[Int]("NAEGYENI")
    /** Database column NAPLIST SqlType(INTEGER) */
    val naplist: Rep[Int] = column[Int]("NAPLIST")
    /** Database column NANEMZ SqlType(INTEGER) */
    val nanemz: Rep[Int] = column[Int]("NANEMZ")
    /** Database column NLSZ SqlType(INTEGER) */
    val nlsz: Rep[Int] = column[Int]("NLSZ")
    /** Database column NNOSSZ SqlType(INTEGER) */
    val nnossz: Rep[Int] = column[Int]("NNOSSZ")
    /** Database column NBOLGAR SqlType(INTEGER) */
    val nbolgar: Rep[Int] = column[Int]("NBOLGAR")
    /** Database column NGOROG SqlType(INTEGER) */
    val ngorog: Rep[Int] = column[Int]("NGOROG")
    /** Database column NHORVAT SqlType(INTEGER) */
    val nhorvat: Rep[Int] = column[Int]("NHORVAT")
    /** Database column NLENGYEL SqlType(INTEGER) */
    val nlengyel: Rep[Int] = column[Int]("NLENGYEL")
    /** Database column NNEMET SqlType(INTEGER) */
    val nnemet: Rep[Int] = column[Int]("NNEMET")
    /** Database column NORMENY SqlType(INTEGER) */
    val normeny: Rep[Int] = column[Int]("NORMENY")
    /** Database column NROMA SqlType(INTEGER) */
    val nroma: Rep[Int] = column[Int]("NROMA")
    /** Database column NROMAN SqlType(INTEGER) */
    val nroman: Rep[Int] = column[Int]("NROMAN")
    /** Database column NRUSZIN SqlType(INTEGER) */
    val nruszin: Rep[Int] = column[Int]("NRUSZIN")
    /** Database column NSZERB SqlType(INTEGER) */
    val nszerb: Rep[Int] = column[Int]("NSZERB")
    /** Database column NSZLOVAK SqlType(INTEGER) */
    val nszlovak: Rep[Int] = column[Int]("NSZLOVAK")
    /** Database column NSZLOVEN SqlType(INTEGER) */
    val nszloven: Rep[Int] = column[Int]("NSZLOVEN")
    /** Database column NUKRAN SqlType(INTEGER) */
    val nukran: Rep[Int] = column[Int]("NUKRAN")
  }
  /** Collection-like TableQuery object for table Nevjegyz */
  lazy val Nevjegyz = new TableQuery(tag => new Nevjegyz(tag))

  /** Entity class storing rows of table Oevk
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param maz Database column MAZ SqlType(VARCHAR), Length(2,true)
   *  @param evk Database column EVK SqlType(VARCHAR), Length(2,true)
   *  @param szekh Database column SZEKH SqlType(VARCHAR), Length(17,true)
   *  @param szekhk Database column SZEKHK SqlType(VARCHAR), Length(2,true) */
  case class OevkRow(internalId: Int, maz: String, evk: String, szekh: String, szekhk: Option[String])
  /** GetResult implicit for fetching OevkRow objects using plain SQL queries */
  implicit def GetResultOevkRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[OevkRow] = GR{
    prs => import prs._
    OevkRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<?[String]))
  }
  /** Table description of table OEVK. Objects of this class serve as prototypes for rows in queries. */
  class Oevk(_tableTag: Tag) extends profile.api.Table[OevkRow](_tableTag, "OEVK") {
    def * = (internalId, maz, evk, szekh, szekhk) <> (OevkRow.tupled, OevkRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(maz), Rep.Some(evk), Rep.Some(szekh), szekhk).shaped.<>({r=>import r._; _1.map(_=> OevkRow.tupled((_1.get, _2.get, _3.get, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column MAZ SqlType(VARCHAR), Length(2,true) */
    val maz: Rep[String] = column[String]("MAZ", O.Length(2,varying=true))
    /** Database column EVK SqlType(VARCHAR), Length(2,true) */
    val evk: Rep[String] = column[String]("EVK", O.Length(2,varying=true))
    /** Database column SZEKH SqlType(VARCHAR), Length(17,true) */
    val szekh: Rep[String] = column[String]("SZEKH", O.Length(17,varying=true))
    /** Database column SZEKHK SqlType(VARCHAR), Length(2,true) */
    val szekhk: Rep[Option[String]] = column[Option[String]]("SZEKHK", O.Length(2,varying=true))

    /** Index over (maz) (database name OEVK_MAZ) */
    val index1 = index("OEVK_MAZ", maz)
  }
  /** Collection-like TableQuery object for table Oevk */
  lazy val Oevk = new TableQuery(tag => new Oevk(tag))

  /** Entity class storing rows of table Oevk2014
   *  @param id Database column ID SqlType(INTEGER)
   *  @param maz Database column MAZ SqlType(VARCHAR), Length(2,true)
   *  @param evk Database column EVK SqlType(VARCHAR), Length(3,true)
   *  @param jelolt Database column JELOLT SqlType(VARCHAR), Length(35,true)
   *  @param part Database column PART SqlType(VARCHAR), Length(21,true)
   *  @param szavazat Database column SZAVAZAT SqlType(INTEGER)
   *  @param szavPct Database column SZAV_PCT SqlType(DECIMAL)
   *  @param gyoztes Database column GYOZTES SqlType(TINYINT) */
  case class Oevk2014Row(id: Option[Int], maz: String, evk: String, jelolt: String, part: String, szavazat: Int, szavPct: scala.math.BigDecimal, gyoztes: Byte)
  /** GetResult implicit for fetching Oevk2014Row objects using plain SQL queries */
  implicit def GetResultOevk2014Row(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Int], e3: GR[scala.math.BigDecimal], e4: GR[Byte]): GR[Oevk2014Row] = GR{
    prs => import prs._
    Oevk2014Row.tupled((<<?[Int], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[scala.math.BigDecimal], <<[Byte]))
  }
  /** Table description of table OEVK_2014. Objects of this class serve as prototypes for rows in queries. */
  class Oevk2014(_tableTag: Tag) extends profile.api.Table[Oevk2014Row](_tableTag, "OEVK_2014") {
    def * = (id, maz, evk, jelolt, part, szavazat, szavPct, gyoztes) <> (Oevk2014Row.tupled, Oevk2014Row.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id, Rep.Some(maz), Rep.Some(evk), Rep.Some(jelolt), Rep.Some(part), Rep.Some(szavazat), Rep.Some(szavPct), Rep.Some(gyoztes)).shaped.<>({r=>import r._; _2.map(_=> Oevk2014Row.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID SqlType(INTEGER) */
    val id: Rep[Option[Int]] = column[Option[Int]]("ID")
    /** Database column MAZ SqlType(VARCHAR), Length(2,true) */
    val maz: Rep[String] = column[String]("MAZ", O.Length(2,varying=true))
    /** Database column EVK SqlType(VARCHAR), Length(3,true) */
    val evk: Rep[String] = column[String]("EVK", O.Length(3,varying=true))
    /** Database column JELOLT SqlType(VARCHAR), Length(35,true) */
    val jelolt: Rep[String] = column[String]("JELOLT", O.Length(35,varying=true))
    /** Database column PART SqlType(VARCHAR), Length(21,true) */
    val part: Rep[String] = column[String]("PART", O.Length(21,varying=true))
    /** Database column SZAVAZAT SqlType(INTEGER) */
    val szavazat: Rep[Int] = column[Int]("SZAVAZAT")
    /** Database column SZAV_PCT SqlType(DECIMAL) */
    val szavPct: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("SZAV_PCT")
    /** Database column GYOZTES SqlType(TINYINT) */
    val gyoztes: Rep[Byte] = column[Byte]("GYOZTES")
  }
  /** Collection-like TableQuery object for table Oevk2014 */
  lazy val Oevk2014 = new TableQuery(tag => new Oevk2014(tag))

  /** Entity class storing rows of table Partdelegalt
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param id Database column ID SqlType(VARCHAR), Length(24,true)
   *  @param sorszm Database column SORSZM SqlType(INTEGER)
   *  @param megye Database column MEGYE SqlType(VARCHAR), Length(22,true)
   *  @param telepls Database column TELEPLS SqlType(VARCHAR), Length(20,true)
   *  @param maz Database column MAZ SqlType(VARCHAR), Length(2,true)
   *  @param taz Database column TAZ SqlType(VARCHAR), Length(3,true)
   *  @param bizottsgszintje Database column BIZOTTSGSZINTJE SqlType(VARCHAR), Length(5,true)
   *  @param szavazkroevkszma Database column SZAVAZKROEVKSZMA SqlType(VARCHAR), Length(3,true)
   *  @param sorsz Database column SORSZ SqlType(VARCHAR), Length(3,true)
   *  @param vlasztsnapja Database column VLASZTSNAPJA SqlType(VARCHAR), Length(10,true)
   *  @param vlasztstpusa Database column VLASZTSTPUSA SqlType(VARCHAR), Length(33,true)
   *  @param megbz Database column MEGBZ SqlType(VARCHAR), Length(44,true)
   *  @param jellcsoport Database column JELLCSOPORT SqlType(VARCHAR), Length(20,true)
   *  @param jellcsopid Database column JELLCSOPID SqlType(INTEGER) */
  case class PartdelegaltRow(internalId: Int, id: String, sorszm: Int, megye: String, telepls: String, maz: String, taz: String, bizottsgszintje: String, szavazkroevkszma: Option[String], sorsz: String, vlasztsnapja: String, vlasztstpusa: String, megbz: String, jellcsoport: Option[String], jellcsopid: Option[Int])
  /** GetResult implicit for fetching PartdelegaltRow objects using plain SQL queries */
  implicit def GetResultPartdelegaltRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Int]]): GR[PartdelegaltRow] = GR{
    prs => import prs._
    PartdelegaltRow.tupled((<<[Int], <<[String], <<[Int], <<[String], <<[String], <<[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[Int]))
  }
  /** Table description of table PARTDELEGALT. Objects of this class serve as prototypes for rows in queries. */
  class Partdelegalt(_tableTag: Tag) extends profile.api.Table[PartdelegaltRow](_tableTag, "PARTDELEGALT") {
    def * = (internalId, id, sorszm, megye, telepls, maz, taz, bizottsgszintje, szavazkroevkszma, sorsz, vlasztsnapja, vlasztstpusa, megbz, jellcsoport, jellcsopid) <> (PartdelegaltRow.tupled, PartdelegaltRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(id), Rep.Some(sorszm), Rep.Some(megye), Rep.Some(telepls), Rep.Some(maz), Rep.Some(taz), Rep.Some(bizottsgszintje), szavazkroevkszma, Rep.Some(sorsz), Rep.Some(vlasztsnapja), Rep.Some(vlasztstpusa), Rep.Some(megbz), jellcsoport, jellcsopid).shaped.<>({r=>import r._; _1.map(_=> PartdelegaltRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9, _10.get, _11.get, _12.get, _13.get, _14, _15)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column ID SqlType(VARCHAR), Length(24,true) */
    val id: Rep[String] = column[String]("ID", O.Length(24,varying=true))
    /** Database column SORSZM SqlType(INTEGER) */
    val sorszm: Rep[Int] = column[Int]("SORSZM")
    /** Database column MEGYE SqlType(VARCHAR), Length(22,true) */
    val megye: Rep[String] = column[String]("MEGYE", O.Length(22,varying=true))
    /** Database column TELEPLS SqlType(VARCHAR), Length(20,true) */
    val telepls: Rep[String] = column[String]("TELEPLS", O.Length(20,varying=true))
    /** Database column MAZ SqlType(VARCHAR), Length(2,true) */
    val maz: Rep[String] = column[String]("MAZ", O.Length(2,varying=true))
    /** Database column TAZ SqlType(VARCHAR), Length(3,true) */
    val taz: Rep[String] = column[String]("TAZ", O.Length(3,varying=true))
    /** Database column BIZOTTSGSZINTJE SqlType(VARCHAR), Length(5,true) */
    val bizottsgszintje: Rep[String] = column[String]("BIZOTTSGSZINTJE", O.Length(5,varying=true))
    /** Database column SZAVAZKROEVKSZMA SqlType(VARCHAR), Length(3,true) */
    val szavazkroevkszma: Rep[Option[String]] = column[Option[String]]("SZAVAZKROEVKSZMA", O.Length(3,varying=true))
    /** Database column SORSZ SqlType(VARCHAR), Length(3,true) */
    val sorsz: Rep[String] = column[String]("SORSZ", O.Length(3,varying=true))
    /** Database column VLASZTSNAPJA SqlType(VARCHAR), Length(10,true) */
    val vlasztsnapja: Rep[String] = column[String]("VLASZTSNAPJA", O.Length(10,varying=true))
    /** Database column VLASZTSTPUSA SqlType(VARCHAR), Length(33,true) */
    val vlasztstpusa: Rep[String] = column[String]("VLASZTSTPUSA", O.Length(33,varying=true))
    /** Database column MEGBZ SqlType(VARCHAR), Length(44,true) */
    val megbz: Rep[String] = column[String]("MEGBZ", O.Length(44,varying=true))
    /** Database column JELLCSOPORT SqlType(VARCHAR), Length(20,true) */
    val jellcsoport: Rep[Option[String]] = column[Option[String]]("JELLCSOPORT", O.Length(20,varying=true))
    /** Database column JELLCSOPID SqlType(INTEGER) */
    val jellcsopid: Rep[Option[Int]] = column[Option[Int]]("JELLCSOPID")

    /** Index over (id) (database name PARTDELEGALT_ID) */
    val index1 = index("PARTDELEGALT_ID", id)
    /** Index over (jellcsopid) (database name PARTDELEGALT_JELLCSOPID) */
    val index2 = index("PARTDELEGALT_JELLCSOPID", jellcsopid)
    /** Index over (maz) (database name PARTDELEGALT_MAZ) */
    val index3 = index("PARTDELEGALT_MAZ", maz)
    /** Index over (sorsz) (database name PARTDELEGALT_SORSZ) */
    val index4 = index("PARTDELEGALT_SORSZ", sorsz)
    /** Index over (sorszm) (database name PARTDELEGALT_SORSZM) */
    val index5 = index("PARTDELEGALT_SORSZM", sorszm)
    /** Index over (taz) (database name PARTDELEGALT_TAZ) */
    val index6 = index("PARTDELEGALT_TAZ", taz)
  }
  /** Collection-like TableQuery object for table Partdelegalt */
  lazy val Partdelegalt = new TableQuery(tag => new Partdelegalt(tag))

  /** Row type of table Szavf */
  type SzavfRow = HCons[Int,HCons[Int,HCons[Char,HCons[String,HCons[Option[String],HCons[Option[String],HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for SzavfRow providing default values if available in the database schema. */
  def SzavfRow(internalId: Int, jfid: Int, valtip: Char, maz: String, taz: Option[String], sorsz: Option[String], a: Int, b: Int, bo: Int, c: Int, d: Int, e: Int, f: Int, g: Int, i1: Int, i2: Int, i3: Int, j: Int, o: Int, k1: Int, k2: Int, l: Int, m: Int, n: Int, pa: Int, pf: Int, po: Int, pk: Int, pl: Int, pm: Int, pn: Int, na: Int, nf: Int, no: Int, nk: Int, nl: Int, nm: Int, nn: Int): SzavfRow = {
    internalId :: jfid :: valtip :: maz :: taz :: sorsz :: a :: b :: bo :: c :: d :: e :: f :: g :: i1 :: i2 :: i3 :: j :: o :: k1 :: k2 :: l :: m :: n :: pa :: pf :: po :: pk :: pl :: pm :: pn :: na :: nf :: no :: nk :: nl :: nm :: nn :: HNil
  }
  /** GetResult implicit for fetching SzavfRow objects using plain SQL queries */
  implicit def GetResultSzavfRow(implicit e0: GR[Int], e1: GR[Char], e2: GR[String], e3: GR[Option[String]]): GR[SzavfRow] = GR{
    prs => import prs._
    <<[Int] :: <<[Int] :: <<[Char] :: <<[String] :: <<?[String] :: <<?[String] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: HNil
  }
  /** Table description of table SZAVF. Objects of this class serve as prototypes for rows in queries. */
  class Szavf(_tableTag: Tag) extends profile.api.Table[SzavfRow](_tableTag, "SZAVF") {
    def * = internalId :: jfid :: valtip :: maz :: taz :: sorsz :: a :: b :: bo :: c :: d :: e :: f :: g :: i1 :: i2 :: i3 :: j :: o :: k1 :: k2 :: l :: m :: n :: pa :: pf :: po :: pk :: pl :: pm :: pn :: na :: nf :: no :: nk :: nl :: nm :: nn :: HNil

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column JFID SqlType(INTEGER) */
    val jfid: Rep[Int] = column[Int]("JFID")
    /** Database column VALTIP SqlType(VARCHAR) */
    val valtip: Rep[Char] = column[Char]("VALTIP")
    /** Database column MAZ SqlType(VARCHAR), Length(2,true) */
    val maz: Rep[String] = column[String]("MAZ", O.Length(2,varying=true))
    /** Database column TAZ SqlType(VARCHAR), Length(3,true) */
    val taz: Rep[Option[String]] = column[Option[String]]("TAZ", O.Length(3,varying=true))
    /** Database column SORSZ SqlType(VARCHAR), Length(3,true) */
    val sorsz: Rep[Option[String]] = column[Option[String]]("SORSZ", O.Length(3,varying=true))
    /** Database column A SqlType(INTEGER) */
    val a: Rep[Int] = column[Int]("A")
    /** Database column B SqlType(INTEGER) */
    val b: Rep[Int] = column[Int]("B")
    /** Database column BO SqlType(INTEGER) */
    val bo: Rep[Int] = column[Int]("BO")
    /** Database column C SqlType(INTEGER) */
    val c: Rep[Int] = column[Int]("C")
    /** Database column D SqlType(INTEGER) */
    val d: Rep[Int] = column[Int]("D")
    /** Database column E SqlType(INTEGER) */
    val e: Rep[Int] = column[Int]("E")
    /** Database column F SqlType(INTEGER) */
    val f: Rep[Int] = column[Int]("F")
    /** Database column G SqlType(INTEGER) */
    val g: Rep[Int] = column[Int]("G")
    /** Database column I1 SqlType(INTEGER) */
    val i1: Rep[Int] = column[Int]("I1")
    /** Database column I2 SqlType(INTEGER) */
    val i2: Rep[Int] = column[Int]("I2")
    /** Database column I3 SqlType(INTEGER) */
    val i3: Rep[Int] = column[Int]("I3")
    /** Database column J SqlType(INTEGER) */
    val j: Rep[Int] = column[Int]("J")
    /** Database column O SqlType(INTEGER) */
    val o: Rep[Int] = column[Int]("O")
    /** Database column K1 SqlType(INTEGER) */
    val k1: Rep[Int] = column[Int]("K1")
    /** Database column K2 SqlType(INTEGER) */
    val k2: Rep[Int] = column[Int]("K2")
    /** Database column L SqlType(INTEGER) */
    val l: Rep[Int] = column[Int]("L")
    /** Database column M SqlType(INTEGER) */
    val m: Rep[Int] = column[Int]("M")
    /** Database column N SqlType(INTEGER) */
    val n: Rep[Int] = column[Int]("N")
    /** Database column PA SqlType(INTEGER) */
    val pa: Rep[Int] = column[Int]("PA")
    /** Database column PF SqlType(INTEGER) */
    val pf: Rep[Int] = column[Int]("PF")
    /** Database column PO SqlType(INTEGER) */
    val po: Rep[Int] = column[Int]("PO")
    /** Database column PK SqlType(INTEGER) */
    val pk: Rep[Int] = column[Int]("PK")
    /** Database column PL SqlType(INTEGER) */
    val pl: Rep[Int] = column[Int]("PL")
    /** Database column PM SqlType(INTEGER) */
    val pm: Rep[Int] = column[Int]("PM")
    /** Database column PN SqlType(INTEGER) */
    val pn: Rep[Int] = column[Int]("PN")
    /** Database column NA SqlType(INTEGER) */
    val na: Rep[Int] = column[Int]("NA")
    /** Database column NF SqlType(INTEGER) */
    val nf: Rep[Int] = column[Int]("NF")
    /** Database column NO SqlType(INTEGER) */
    val no: Rep[Int] = column[Int]("NO")
    /** Database column NK SqlType(INTEGER) */
    val nk: Rep[Int] = column[Int]("NK")
    /** Database column NL SqlType(INTEGER) */
    val nl: Rep[Int] = column[Int]("NL")
    /** Database column NM SqlType(INTEGER) */
    val nm: Rep[Int] = column[Int]("NM")
    /** Database column NN SqlType(INTEGER) */
    val nn: Rep[Int] = column[Int]("NN")

    /** Index over (jfid) (database name SZAVF_JFID) */
    val index1 = index("SZAVF_JFID", jfid :: HNil)
    /** Index over (maz) (database name SZAVF_MAZ) */
    val index2 = index("SZAVF_MAZ", maz :: HNil)
    /** Index over (sorsz) (database name SZAVF_SORSZ) */
    val index3 = index("SZAVF_SORSZ", sorsz :: HNil)
    /** Index over (taz) (database name SZAVF_TAZ) */
    val index4 = index("SZAVF_TAZ", taz :: HNil)
    /** Index over (valtip) (database name SZAVF_VALTIP) */
    val index5 = index("SZAVF_VALTIP", valtip :: HNil)
  }
  /** Collection-like TableQuery object for table Szavf */
  lazy val Szavf = new TableQuery(tag => new Szavf(tag))

  /** Entity class storing rows of table Szavkor
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param maz Database column MAZ SqlType(VARCHAR), Length(2,true)
   *  @param taz Database column TAZ SqlType(VARCHAR), Length(3,true)
   *  @param sorsz Database column SORSZ SqlType(VARCHAR), Length(3,true)
   *  @param evk Database column EVK SqlType(VARCHAR), Length(2,true)
   *  @param tip Database column TIP SqlType(INTEGER)
   *  @param cimt Database column CIMT SqlType(VARCHAR), Length(20,true)
   *  @param cimk Database column CIMK SqlType(VARCHAR), Length(50,true) */
  case class SzavkorRow(internalId: Int, maz: String, taz: Option[String], sorsz: Option[String], evk: Option[String], tip: Int, cimt: String, cimk: String)
  /** GetResult implicit for fetching SzavkorRow objects using plain SQL queries */
  implicit def GetResultSzavkorRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[SzavkorRow] = GR{
    prs => import prs._
    SzavkorRow.tupled((<<[Int], <<[String], <<?[String], <<?[String], <<?[String], <<[Int], <<[String], <<[String]))
  }
  /** Table description of table SZAVKOR. Objects of this class serve as prototypes for rows in queries. */
  class Szavkor(_tableTag: Tag) extends profile.api.Table[SzavkorRow](_tableTag, "SZAVKOR") {
    def * = (internalId, maz, taz, sorsz, evk, tip, cimt, cimk) <> (SzavkorRow.tupled, SzavkorRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(maz), taz, sorsz, evk, Rep.Some(tip), Rep.Some(cimt), Rep.Some(cimk)).shaped.<>({r=>import r._; _1.map(_=> SzavkorRow.tupled((_1.get, _2.get, _3, _4, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column MAZ SqlType(VARCHAR), Length(2,true) */
    val maz: Rep[String] = column[String]("MAZ", O.Length(2,varying=true))
    /** Database column TAZ SqlType(VARCHAR), Length(3,true) */
    val taz: Rep[Option[String]] = column[Option[String]]("TAZ", O.Length(3,varying=true))
    /** Database column SORSZ SqlType(VARCHAR), Length(3,true) */
    val sorsz: Rep[Option[String]] = column[Option[String]]("SORSZ", O.Length(3,varying=true))
    /** Database column EVK SqlType(VARCHAR), Length(2,true) */
    val evk: Rep[Option[String]] = column[Option[String]]("EVK", O.Length(2,varying=true))
    /** Database column TIP SqlType(INTEGER) */
    val tip: Rep[Int] = column[Int]("TIP")
    /** Database column CIMT SqlType(VARCHAR), Length(20,true) */
    val cimt: Rep[String] = column[String]("CIMT", O.Length(20,varying=true))
    /** Database column CIMK SqlType(VARCHAR), Length(50,true) */
    val cimk: Rep[String] = column[String]("CIMK", O.Length(50,varying=true))

    /** Index over (maz) (database name SZAVKOR_MAZ) */
    val index1 = index("SZAVKOR_MAZ", maz)
    /** Index over (sorsz) (database name SZAVKOR_SORSZ) */
    val index2 = index("SZAVKOR_SORSZ", sorsz)
    /** Index over (taz) (database name SZAVKOR_TAZ) */
    val index3 = index("SZAVKOR_TAZ", taz)
    /** Index over (tip) (database name SZAVKOR_TIP) */
    val index4 = index("SZAVKOR_TIP", tip)
  }
  /** Collection-like TableQuery object for table Szavkor */
  lazy val Szavkor = new TableQuery(tag => new Szavkor(tag))

  /** Entity class storing rows of table Szavlf
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param jfid Database column JFID SqlType(INTEGER)
   *  @param jlid Database column JLID SqlType(INTEGER)
   *  @param nemz Database column NEMZ SqlType(INTEGER)
   *  @param pa Database column PA SqlType(INTEGER)
   *  @param pf Database column PF SqlType(INTEGER)
   *  @param po Database column PO SqlType(INTEGER)
   *  @param pk Database column PK SqlType(INTEGER)
   *  @param pl Database column PL SqlType(INTEGER)
   *  @param pm Database column PM SqlType(INTEGER)
   *  @param pn Database column PN SqlType(INTEGER) */
  case class SzavlfRow(internalId: Int, jfid: Int, jlid: Int, nemz: Int, pa: Int, pf: Int, po: Int, pk: Int, pl: Int, pm: Int, pn: Int)
  /** GetResult implicit for fetching SzavlfRow objects using plain SQL queries */
  implicit def GetResultSzavlfRow(implicit e0: GR[Int]): GR[SzavlfRow] = GR{
    prs => import prs._
    SzavlfRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table SZAVLF. Objects of this class serve as prototypes for rows in queries. */
  class Szavlf(_tableTag: Tag) extends profile.api.Table[SzavlfRow](_tableTag, "SZAVLF") {
    def * = (internalId, jfid, jlid, nemz, pa, pf, po, pk, pl, pm, pn) <> (SzavlfRow.tupled, SzavlfRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(jfid), Rep.Some(jlid), Rep.Some(nemz), Rep.Some(pa), Rep.Some(pf), Rep.Some(po), Rep.Some(pk), Rep.Some(pl), Rep.Some(pm), Rep.Some(pn)).shaped.<>({r=>import r._; _1.map(_=> SzavlfRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column JFID SqlType(INTEGER) */
    val jfid: Rep[Int] = column[Int]("JFID")
    /** Database column JLID SqlType(INTEGER) */
    val jlid: Rep[Int] = column[Int]("JLID")
    /** Database column NEMZ SqlType(INTEGER) */
    val nemz: Rep[Int] = column[Int]("NEMZ")
    /** Database column PA SqlType(INTEGER) */
    val pa: Rep[Int] = column[Int]("PA")
    /** Database column PF SqlType(INTEGER) */
    val pf: Rep[Int] = column[Int]("PF")
    /** Database column PO SqlType(INTEGER) */
    val po: Rep[Int] = column[Int]("PO")
    /** Database column PK SqlType(INTEGER) */
    val pk: Rep[Int] = column[Int]("PK")
    /** Database column PL SqlType(INTEGER) */
    val pl: Rep[Int] = column[Int]("PL")
    /** Database column PM SqlType(INTEGER) */
    val pm: Rep[Int] = column[Int]("PM")
    /** Database column PN SqlType(INTEGER) */
    val pn: Rep[Int] = column[Int]("PN")

    /** Index over (jfid) (database name SZAVLF_JFID) */
    val index1 = index("SZAVLF_JFID", jfid)
    /** Index over (jlid) (database name SZAVLF_JLID) */
    val index2 = index("SZAVLF_JLID", jlid)
  }
  /** Collection-like TableQuery object for table Szavlf */
  lazy val Szavlf = new TableQuery(tag => new Szavlf(tag))

  /** Entity class storing rows of table Szavt
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param jfid Database column JFID SqlType(INTEGER)
   *  @param jlid Database column JLID SqlType(INTEGER)
   *  @param szav Database column SZAV SqlType(INTEGER) */
  case class SzavtRow(internalId: Int, jfid: Int, jlid: Int, szav: Int)
  /** GetResult implicit for fetching SzavtRow objects using plain SQL queries */
  implicit def GetResultSzavtRow(implicit e0: GR[Int]): GR[SzavtRow] = GR{
    prs => import prs._
    SzavtRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table SZAVT. Objects of this class serve as prototypes for rows in queries. */
  class Szavt(_tableTag: Tag) extends profile.api.Table[SzavtRow](_tableTag, "SZAVT") {
    def * = (internalId, jfid, jlid, szav) <> (SzavtRow.tupled, SzavtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(jfid), Rep.Some(jlid), Rep.Some(szav)).shaped.<>({r=>import r._; _1.map(_=> SzavtRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column JFID SqlType(INTEGER) */
    val jfid: Rep[Int] = column[Int]("JFID")
    /** Database column JLID SqlType(INTEGER) */
    val jlid: Rep[Int] = column[Int]("JLID")
    /** Database column SZAV SqlType(INTEGER) */
    val szav: Rep[Int] = column[Int]("SZAV")

    /** Index over (jfid) (database name SZAVT_JFID) */
    val index1 = index("SZAVT_JFID", jfid)
    /** Index over (jlid) (database name SZAVT_JLID) */
    val index2 = index("SZAVT_JLID", jlid)
  }
  /** Collection-like TableQuery object for table Szavt */
  lazy val Szavt = new TableQuery(tag => new Szavt(tag))

  /** Row type of table Szeredmf */
  type SzeredmfRow = HCons[Int,HCons[Int,HCons[Int,HCons[Option[String],HCons[Option[String],HCons[Char,HCons[Int,HCons[Char,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[String,HCons[String,HCons[Int,HCons[Option[Int],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for SzeredmfRow providing default values if available in the database schema. */
  def SzeredmfRow(internalId: Int, sfid: Int, oszint: Int, sfmaz: Option[String], sfevk: Option[String], valtip: Char, forr: Int, jogi: Char, eredm: Int, a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, ie: Int, ilis: Int, ilev: Int, j: Int, ke: Int, klis: Int, m: Int, n: Int, jojkv: Int, feldar: String, levell: String, levszl: Int, eid: Option[Int]): SzeredmfRow = {
    internalId :: sfid :: oszint :: sfmaz :: sfevk :: valtip :: forr :: jogi :: eredm :: a :: b :: c :: d :: e :: f :: ie :: ilis :: ilev :: j :: ke :: klis :: m :: n :: jojkv :: feldar :: levell :: levszl :: eid :: HNil
  }
  /** GetResult implicit for fetching SzeredmfRow objects using plain SQL queries */
  implicit def GetResultSzeredmfRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Char], e3: GR[String], e4: GR[Option[Int]]): GR[SzeredmfRow] = GR{
    prs => import prs._
    <<[Int] :: <<[Int] :: <<[Int] :: <<?[String] :: <<?[String] :: <<[Char] :: <<[Int] :: <<[Char] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[String] :: <<[String] :: <<[Int] :: <<?[Int] :: HNil
  }
  /** Table description of table SZEREDMF. Objects of this class serve as prototypes for rows in queries. */
  class Szeredmf(_tableTag: Tag) extends profile.api.Table[SzeredmfRow](_tableTag, "SZEREDMF") {
    def * = internalId :: sfid :: oszint :: sfmaz :: sfevk :: valtip :: forr :: jogi :: eredm :: a :: b :: c :: d :: e :: f :: ie :: ilis :: ilev :: j :: ke :: klis :: m :: n :: jojkv :: feldar :: levell :: levszl :: eid :: HNil

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column SFID SqlType(INTEGER) */
    val sfid: Rep[Int] = column[Int]("SFID")
    /** Database column OSZINT SqlType(INTEGER) */
    val oszint: Rep[Int] = column[Int]("OSZINT")
    /** Database column SFMAZ SqlType(VARCHAR), Length(2,true) */
    val sfmaz: Rep[Option[String]] = column[Option[String]]("SFMAZ", O.Length(2,varying=true))
    /** Database column SFEVK SqlType(VARCHAR), Length(2,true) */
    val sfevk: Rep[Option[String]] = column[Option[String]]("SFEVK", O.Length(2,varying=true))
    /** Database column VALTIP SqlType(VARCHAR) */
    val valtip: Rep[Char] = column[Char]("VALTIP")
    /** Database column FORR SqlType(INTEGER) */
    val forr: Rep[Int] = column[Int]("FORR")
    /** Database column JOGI SqlType(VARCHAR) */
    val jogi: Rep[Char] = column[Char]("JOGI")
    /** Database column EREDM SqlType(INTEGER) */
    val eredm: Rep[Int] = column[Int]("EREDM")
    /** Database column A SqlType(INTEGER) */
    val a: Rep[Int] = column[Int]("A")
    /** Database column B SqlType(INTEGER) */
    val b: Rep[Int] = column[Int]("B")
    /** Database column C SqlType(INTEGER) */
    val c: Rep[Int] = column[Int]("C")
    /** Database column D SqlType(INTEGER) */
    val d: Rep[Int] = column[Int]("D")
    /** Database column E SqlType(INTEGER) */
    val e: Rep[Int] = column[Int]("E")
    /** Database column F SqlType(INTEGER) */
    val f: Rep[Int] = column[Int]("F")
    /** Database column IE SqlType(INTEGER) */
    val ie: Rep[Int] = column[Int]("IE")
    /** Database column ILIS SqlType(INTEGER) */
    val ilis: Rep[Int] = column[Int]("ILIS")
    /** Database column ILEV SqlType(INTEGER) */
    val ilev: Rep[Int] = column[Int]("ILEV")
    /** Database column J SqlType(INTEGER) */
    val j: Rep[Int] = column[Int]("J")
    /** Database column KE SqlType(INTEGER) */
    val ke: Rep[Int] = column[Int]("KE")
    /** Database column KLIS SqlType(INTEGER) */
    val klis: Rep[Int] = column[Int]("KLIS")
    /** Database column M SqlType(INTEGER) */
    val m: Rep[Int] = column[Int]("M")
    /** Database column N SqlType(INTEGER) */
    val n: Rep[Int] = column[Int]("N")
    /** Database column JOJKV SqlType(INTEGER) */
    val jojkv: Rep[Int] = column[Int]("JOJKV")
    /** Database column FELDAR SqlType(VARCHAR), Length(5,true) */
    val feldar: Rep[String] = column[String]("FELDAR", O.Length(5,varying=true))
    /** Database column LEVELL SqlType(VARCHAR), Length(5,true) */
    val levell: Rep[String] = column[String]("LEVELL", O.Length(5,varying=true))
    /** Database column LEVSZL SqlType(INTEGER) */
    val levszl: Rep[Int] = column[Int]("LEVSZL")
    /** Database column EID SqlType(INTEGER) */
    val eid: Rep[Option[Int]] = column[Option[Int]]("EID")

    /** Index over (eid) (database name SZEREDMF_EID) */
    val index1 = index("SZEREDMF_EID", eid :: HNil)
    /** Index over (sfid) (database name SZEREDMF_SFID) */
    val index2 = index("SZEREDMF_SFID", sfid :: HNil)
    /** Index over (sfmaz) (database name SZEREDMF_SFMAZ) */
    val index3 = index("SZEREDMF_SFMAZ", sfmaz :: HNil)
    /** Index over (valtip) (database name SZEREDMF_VALTIP) */
    val index4 = index("SZEREDMF_VALTIP", valtip :: HNil)
  }
  /** Collection-like TableQuery object for table Szeredmf */
  lazy val Szeredmf = new TableQuery(tag => new Szeredmf(tag))

  /** Entity class storing rows of table Szeredmt
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param sfid Database column SFID SqlType(INTEGER)
   *  @param jlid Database column JLID SqlType(INTEGER)
   *  @param szav Database column SZAV SqlType(INTEGER)
   *  @param torsz Database column TORSZ SqlType(INTEGER)
   *  @param mandszav Database column MANDSZAV SqlType(INTEGER)
   *  @param hatar Database column HATAR SqlType(INTEGER)
   *  @param mand Database column MAND SqlType(INTEGER) */
  case class SzeredmtRow(internalId: Int, sfid: Int, jlid: Int, szav: Int, torsz: Int, mandszav: Int, hatar: Int, mand: Int)
  /** GetResult implicit for fetching SzeredmtRow objects using plain SQL queries */
  implicit def GetResultSzeredmtRow(implicit e0: GR[Int]): GR[SzeredmtRow] = GR{
    prs => import prs._
    SzeredmtRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table SZEREDMT. Objects of this class serve as prototypes for rows in queries. */
  class Szeredmt(_tableTag: Tag) extends profile.api.Table[SzeredmtRow](_tableTag, "SZEREDMT") {
    def * = (internalId, sfid, jlid, szav, torsz, mandszav, hatar, mand) <> (SzeredmtRow.tupled, SzeredmtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(sfid), Rep.Some(jlid), Rep.Some(szav), Rep.Some(torsz), Rep.Some(mandszav), Rep.Some(hatar), Rep.Some(mand)).shaped.<>({r=>import r._; _1.map(_=> SzeredmtRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column SFID SqlType(INTEGER) */
    val sfid: Rep[Int] = column[Int]("SFID")
    /** Database column JLID SqlType(INTEGER) */
    val jlid: Rep[Int] = column[Int]("JLID")
    /** Database column SZAV SqlType(INTEGER) */
    val szav: Rep[Int] = column[Int]("SZAV")
    /** Database column TORSZ SqlType(INTEGER) */
    val torsz: Rep[Int] = column[Int]("TORSZ")
    /** Database column MANDSZAV SqlType(INTEGER) */
    val mandszav: Rep[Int] = column[Int]("MANDSZAV")
    /** Database column HATAR SqlType(INTEGER) */
    val hatar: Rep[Int] = column[Int]("HATAR")
    /** Database column MAND SqlType(INTEGER) */
    val mand: Rep[Int] = column[Int]("MAND")

    /** Index over (jlid) (database name SZEREDMT_JLID) */
    val index1 = index("SZEREDMT_JLID", jlid)
    /** Index over (sfid) (database name SZEREDMT_SFID) */
    val index2 = index("SZEREDMT_SFID", sfid)
  }
  /** Collection-like TableQuery object for table Szeredmt */
  lazy val Szeredmt = new TableQuery(tag => new Szeredmt(tag))

  /** Entity class storing rows of table Szervezet
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param szkod Database column SZKOD SqlType(INTEGER)
   *  @param szpntip Database column SZPNTIP SqlType(VARCHAR)
   *  @param nemz Database column NEMZ SqlType(INTEGER)
   *  @param hnev1 Database column HNEV1 SqlType(VARCHAR), Length(30,true)
   *  @param hnev2 Database column HNEV2 SqlType(VARCHAR), Length(30,true)
   *  @param hnev3 Database column HNEV3 SqlType(VARCHAR), Length(30,true)
   *  @param tnev Database column TNEV SqlType(VARCHAR), Length(100,true)
   *  @param rovid Database column ROVID SqlType(VARCHAR), Length(35,true)
   *  @param allapot Database column ALLAPOT SqlType(INTEGER)
   *  @param tajaz Database column TAJAZ SqlType(INTEGER) */
  case class SzervezetRow(internalId: Int, szkod: Int, szpntip: Option[Char], nemz: Option[Int], hnev1: String, hnev2: Option[String], hnev3: Option[String], tnev: String, rovid: String, allapot: Int, tajaz: Option[Int])
  /** GetResult implicit for fetching SzervezetRow objects using plain SQL queries */
  implicit def GetResultSzervezetRow(implicit e0: GR[Int], e1: GR[Option[Char]], e2: GR[Option[Int]], e3: GR[String], e4: GR[Option[String]]): GR[SzervezetRow] = GR{
    prs => import prs._
    SzervezetRow.tupled((<<[Int], <<[Int], <<?[Char], <<?[Int], <<[String], <<?[String], <<?[String], <<[String], <<[String], <<[Int], <<?[Int]))
  }
  /** Table description of table SZERVEZET. Objects of this class serve as prototypes for rows in queries. */
  class Szervezet(_tableTag: Tag) extends profile.api.Table[SzervezetRow](_tableTag, "SZERVEZET") {
    def * = (internalId, szkod, szpntip, nemz, hnev1, hnev2, hnev3, tnev, rovid, allapot, tajaz) <> (SzervezetRow.tupled, SzervezetRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(szkod), szpntip, nemz, Rep.Some(hnev1), hnev2, hnev3, Rep.Some(tnev), Rep.Some(rovid), Rep.Some(allapot), tajaz).shaped.<>({r=>import r._; _1.map(_=> SzervezetRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6, _7, _8.get, _9.get, _10.get, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column SZKOD SqlType(INTEGER) */
    val szkod: Rep[Int] = column[Int]("SZKOD")
    /** Database column SZPNTIP SqlType(VARCHAR) */
    val szpntip: Rep[Option[Char]] = column[Option[Char]]("SZPNTIP")
    /** Database column NEMZ SqlType(INTEGER) */
    val nemz: Rep[Option[Int]] = column[Option[Int]]("NEMZ")
    /** Database column HNEV1 SqlType(VARCHAR), Length(30,true) */
    val hnev1: Rep[String] = column[String]("HNEV1", O.Length(30,varying=true))
    /** Database column HNEV2 SqlType(VARCHAR), Length(30,true) */
    val hnev2: Rep[Option[String]] = column[Option[String]]("HNEV2", O.Length(30,varying=true))
    /** Database column HNEV3 SqlType(VARCHAR), Length(30,true) */
    val hnev3: Rep[Option[String]] = column[Option[String]]("HNEV3", O.Length(30,varying=true))
    /** Database column TNEV SqlType(VARCHAR), Length(100,true) */
    val tnev: Rep[String] = column[String]("TNEV", O.Length(100,varying=true))
    /** Database column ROVID SqlType(VARCHAR), Length(35,true) */
    val rovid: Rep[String] = column[String]("ROVID", O.Length(35,varying=true))
    /** Database column ALLAPOT SqlType(INTEGER) */
    val allapot: Rep[Int] = column[Int]("ALLAPOT")
    /** Database column TAJAZ SqlType(INTEGER) */
    val tajaz: Rep[Option[Int]] = column[Option[Int]]("TAJAZ")

    /** Index over (rovid) (database name SZERVEZET_ROVID) */
    val index1 = index("SZERVEZET_ROVID", rovid)
    /** Index over (szkod) (database name SZERVEZET_SZKOD) */
    val index2 = index("SZERVEZET_SZKOD", szkod)
    /** Index over (szpntip) (database name SZERVEZET_SZPNTIP) */
    val index3 = index("SZERVEZET_SZPNTIP", szpntip)
  }
  /** Collection-like TableQuery object for table Szervezet */
  lazy val Szervezet = new TableQuery(tag => new Szervezet(tag))

  /** Entity class storing rows of table Szkepv
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param mtip Database column MTIP SqlType(INTEGER)
   *  @param jlid Database column JLID SqlType(INTEGER)
   *  @param lsorsz Database column LSORSZ SqlType(INTEGER) */
  case class SzkepvRow(internalId: Int, mtip: Int, jlid: Int, lsorsz: Int)
  /** GetResult implicit for fetching SzkepvRow objects using plain SQL queries */
  implicit def GetResultSzkepvRow(implicit e0: GR[Int]): GR[SzkepvRow] = GR{
    prs => import prs._
    SzkepvRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table SZKEPV. Objects of this class serve as prototypes for rows in queries. */
  class Szkepv(_tableTag: Tag) extends profile.api.Table[SzkepvRow](_tableTag, "SZKEPV") {
    def * = (internalId, mtip, jlid, lsorsz) <> (SzkepvRow.tupled, SzkepvRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(mtip), Rep.Some(jlid), Rep.Some(lsorsz)).shaped.<>({r=>import r._; _1.map(_=> SzkepvRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column MTIP SqlType(INTEGER) */
    val mtip: Rep[Int] = column[Int]("MTIP")
    /** Database column JLID SqlType(INTEGER) */
    val jlid: Rep[Int] = column[Int]("JLID")
    /** Database column LSORSZ SqlType(INTEGER) */
    val lsorsz: Rep[Int] = column[Int]("LSORSZ")

    /** Index over (jlid) (database name SZKEPV_JLID) */
    val index1 = index("SZKEPV_JLID", jlid)
    /** Index over (lsorsz) (database name SZKEPV_LSORSZ) */
    val index2 = index("SZKEPV_LSORSZ", lsorsz)
    /** Index over (mtip) (database name SZKEPV_MTIP) */
    val index3 = index("SZKEPV_MTIP", mtip)
  }
  /** Collection-like TableQuery object for table Szkepv */
  lazy val Szkepv = new TableQuery(tag => new Szkepv(tag))

  /** Entity class storing rows of table Sznapi
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param valtip Database column VALTIP SqlType(VARCHAR)
   *  @param maz Database column MAZ SqlType(VARCHAR), Length(2,true)
   *  @param taz Database column TAZ SqlType(VARCHAR), Length(3,true)
   *  @param sorsz Database column SORSZ SqlType(VARCHAR), Length(3,true)
   *  @param a Database column A SqlType(INTEGER)
   *  @param f Database column F SqlType(INTEGER) */
  case class SznapiRow(internalId: Int, valtip: Char, maz: String, taz: String, sorsz: String, a: Int, f: Int)
  /** GetResult implicit for fetching SznapiRow objects using plain SQL queries */
  implicit def GetResultSznapiRow(implicit e0: GR[Int], e1: GR[Char], e2: GR[String]): GR[SznapiRow] = GR{
    prs => import prs._
    SznapiRow.tupled((<<[Int], <<[Char], <<[String], <<[String], <<[String], <<[Int], <<[Int]))
  }
  /** Table description of table SZNAPI. Objects of this class serve as prototypes for rows in queries. */
  class Sznapi(_tableTag: Tag) extends profile.api.Table[SznapiRow](_tableTag, "SZNAPI") {
    def * = (internalId, valtip, maz, taz, sorsz, a, f) <> (SznapiRow.tupled, SznapiRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(valtip), Rep.Some(maz), Rep.Some(taz), Rep.Some(sorsz), Rep.Some(a), Rep.Some(f)).shaped.<>({r=>import r._; _1.map(_=> SznapiRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column VALTIP SqlType(VARCHAR) */
    val valtip: Rep[Char] = column[Char]("VALTIP")
    /** Database column MAZ SqlType(VARCHAR), Length(2,true) */
    val maz: Rep[String] = column[String]("MAZ", O.Length(2,varying=true))
    /** Database column TAZ SqlType(VARCHAR), Length(3,true) */
    val taz: Rep[String] = column[String]("TAZ", O.Length(3,varying=true))
    /** Database column SORSZ SqlType(VARCHAR), Length(3,true) */
    val sorsz: Rep[String] = column[String]("SORSZ", O.Length(3,varying=true))
    /** Database column A SqlType(INTEGER) */
    val a: Rep[Int] = column[Int]("A")
    /** Database column F SqlType(INTEGER) */
    val f: Rep[Int] = column[Int]("F")

    /** Index over (maz) (database name SZNAPI_MAZ) */
    val index1 = index("SZNAPI_MAZ", maz)
    /** Index over (sorsz) (database name SZNAPI_SORSZ) */
    val index2 = index("SZNAPI_SORSZ", sorsz)
    /** Index over (taz) (database name SZNAPI_TAZ) */
    val index3 = index("SZNAPI_TAZ", taz)
    /** Index over (valtip) (database name SZNAPI_VALTIP) */
    val index4 = index("SZNAPI_VALTIP", valtip)
  }
  /** Collection-like TableQuery object for table Sznapi */
  lazy val Sznapi = new TableQuery(tag => new Sznapi(tag))

  /** Entity class storing rows of table Sznapilf
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param valtip Database column VALTIP SqlType(VARCHAR)
   *  @param maz Database column MAZ SqlType(VARCHAR), Length(2,true)
   *  @param taz Database column TAZ SqlType(VARCHAR), Length(3,true)
   *  @param sorsz Database column SORSZ SqlType(VARCHAR), Length(3,true)
   *  @param nemz Database column NEMZ SqlType(INTEGER)
   *  @param a Database column A SqlType(INTEGER)
   *  @param f Database column F SqlType(INTEGER) */
  case class SznapilfRow(internalId: Int, valtip: Char, maz: String, taz: String, sorsz: String, nemz: Int, a: Int, f: Int)
  /** GetResult implicit for fetching SznapilfRow objects using plain SQL queries */
  implicit def GetResultSznapilfRow(implicit e0: GR[Int], e1: GR[Char], e2: GR[String]): GR[SznapilfRow] = GR{
    prs => import prs._
    SznapilfRow.tupled((<<[Int], <<[Char], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table SZNAPILF. Objects of this class serve as prototypes for rows in queries. */
  class Sznapilf(_tableTag: Tag) extends profile.api.Table[SznapilfRow](_tableTag, "SZNAPILF") {
    def * = (internalId, valtip, maz, taz, sorsz, nemz, a, f) <> (SznapilfRow.tupled, SznapilfRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(valtip), Rep.Some(maz), Rep.Some(taz), Rep.Some(sorsz), Rep.Some(nemz), Rep.Some(a), Rep.Some(f)).shaped.<>({r=>import r._; _1.map(_=> SznapilfRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column VALTIP SqlType(VARCHAR) */
    val valtip: Rep[Char] = column[Char]("VALTIP")
    /** Database column MAZ SqlType(VARCHAR), Length(2,true) */
    val maz: Rep[String] = column[String]("MAZ", O.Length(2,varying=true))
    /** Database column TAZ SqlType(VARCHAR), Length(3,true) */
    val taz: Rep[String] = column[String]("TAZ", O.Length(3,varying=true))
    /** Database column SORSZ SqlType(VARCHAR), Length(3,true) */
    val sorsz: Rep[String] = column[String]("SORSZ", O.Length(3,varying=true))
    /** Database column NEMZ SqlType(INTEGER) */
    val nemz: Rep[Int] = column[Int]("NEMZ")
    /** Database column A SqlType(INTEGER) */
    val a: Rep[Int] = column[Int]("A")
    /** Database column F SqlType(INTEGER) */
    val f: Rep[Int] = column[Int]("F")

    /** Index over (maz) (database name SZNAPILF_MAZ) */
    val index1 = index("SZNAPILF_MAZ", maz)
    /** Index over (sorsz) (database name SZNAPILF_SORSZ) */
    val index2 = index("SZNAPILF_SORSZ", sorsz)
    /** Index over (taz) (database name SZNAPILF_TAZ) */
    val index3 = index("SZNAPILF_TAZ", taz)
    /** Index over (valtip) (database name SZNAPILF_VALTIP) */
    val index4 = index("SZNAPILF_VALTIP", valtip)
  }
  /** Collection-like TableQuery object for table Sznapilf */
  lazy val Sznapilf = new TableQuery(tag => new Sznapilf(tag))

  /** Entity class storing rows of table Telep
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param maz Database column MAZ SqlType(VARCHAR), Length(2,true)
   *  @param taz Database column TAZ SqlType(VARCHAR), Length(3,true)
   *  @param tnevi Database column TNEVI SqlType(VARCHAR), Length(23,true)
   *  @param tnev Database column TNEV SqlType(VARCHAR), Length(20,true)
   *  @param tker Database column TKER SqlType(VARCHAR), Length(2,true)
   *  @param ttip Database column TTIP SqlType(INTEGER) */
  case class TelepRow(internalId: Int, maz: String, taz: String, tnevi: String, tnev: String, tker: Option[String], ttip: Int)
  /** GetResult implicit for fetching TelepRow objects using plain SQL queries */
  implicit def GetResultTelepRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[TelepRow] = GR{
    prs => import prs._
    TelepRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[String], <<?[String], <<[Int]))
  }
  /** Table description of table TELEP. Objects of this class serve as prototypes for rows in queries. */
  class Telep(_tableTag: Tag) extends profile.api.Table[TelepRow](_tableTag, "TELEP") {
    def * = (internalId, maz, taz, tnevi, tnev, tker, ttip) <> (TelepRow.tupled, TelepRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(maz), Rep.Some(taz), Rep.Some(tnevi), Rep.Some(tnev), tker, Rep.Some(ttip)).shaped.<>({r=>import r._; _1.map(_=> TelepRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column MAZ SqlType(VARCHAR), Length(2,true) */
    val maz: Rep[String] = column[String]("MAZ", O.Length(2,varying=true))
    /** Database column TAZ SqlType(VARCHAR), Length(3,true) */
    val taz: Rep[String] = column[String]("TAZ", O.Length(3,varying=true))
    /** Database column TNEVI SqlType(VARCHAR), Length(23,true) */
    val tnevi: Rep[String] = column[String]("TNEVI", O.Length(23,varying=true))
    /** Database column TNEV SqlType(VARCHAR), Length(20,true) */
    val tnev: Rep[String] = column[String]("TNEV", O.Length(20,varying=true))
    /** Database column TKER SqlType(VARCHAR), Length(2,true) */
    val tker: Rep[Option[String]] = column[Option[String]]("TKER", O.Length(2,varying=true))
    /** Database column TTIP SqlType(INTEGER) */
    val ttip: Rep[Int] = column[Int]("TTIP")

    /** Index over (maz) (database name TELEP_MAZ) */
    val index1 = index("TELEP_MAZ", maz)
    /** Index over (taz) (database name TELEP_TAZ) */
    val index2 = index("TELEP_TAZ", taz)
    /** Index over (ttip) (database name TELEP_TTIP) */
    val index3 = index("TELEP_TTIP", ttip)
  }
  /** Collection-like TableQuery object for table Telep */
  lazy val Telep = new TableQuery(tag => new Telep(tag))

  /** Entity class storing rows of table Terulet
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param maz Database column MAZ SqlType(VARCHAR), Length(2,true)
   *  @param mnev Database column MNEV SqlType(VARCHAR), Length(22,true)
   *  @param mrnev Database column MRNEV SqlType(VARCHAR), Length(10,true) */
  case class TeruletRow(internalId: Int, maz: String, mnev: String, mrnev: String)
  /** GetResult implicit for fetching TeruletRow objects using plain SQL queries */
  implicit def GetResultTeruletRow(implicit e0: GR[Int], e1: GR[String]): GR[TeruletRow] = GR{
    prs => import prs._
    TeruletRow.tupled((<<[Int], <<[String], <<[String], <<[String]))
  }
  /** Table description of table TERULET. Objects of this class serve as prototypes for rows in queries. */
  class Terulet(_tableTag: Tag) extends profile.api.Table[TeruletRow](_tableTag, "TERULET") {
    def * = (internalId, maz, mnev, mrnev) <> (TeruletRow.tupled, TeruletRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(maz), Rep.Some(mnev), Rep.Some(mrnev)).shaped.<>({r=>import r._; _1.map(_=> TeruletRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column MAZ SqlType(VARCHAR), Length(2,true) */
    val maz: Rep[String] = column[String]("MAZ", O.Length(2,varying=true))
    /** Database column MNEV SqlType(VARCHAR), Length(22,true) */
    val mnev: Rep[String] = column[String]("MNEV", O.Length(22,varying=true))
    /** Database column MRNEV SqlType(VARCHAR), Length(10,true) */
    val mrnev: Rep[String] = column[String]("MRNEV", O.Length(10,varying=true))

    /** Index over (maz) (database name TERULET_MAZ) */
    val index1 = index("TERULET_MAZ", maz)
  }
  /** Collection-like TableQuery object for table Terulet */
  lazy val Terulet = new TableQuery(tag => new Terulet(tag))

  /** Entity class storing rows of table Tlista
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param tlid Database column TLID SqlType(INTEGER)
   *  @param ltip Database column LTIP SqlType(VARCHAR)
   *  @param nemz Database column NEMZ SqlType(INTEGER)
   *  @param jlcs Database column JLCS SqlType(INTEGER)
   *  @param tnev Database column TNEV SqlType(VARCHAR), Length(100,true)
   *  @param sorsz Database column SORSZ SqlType(INTEGER)
   *  @param erv Database column ERV SqlType(INTEGER)
   *  @param allapot Database column ALLAPOT SqlType(INTEGER) */
  case class TlistaRow(internalId: Int, tlid: Int, ltip: Char, nemz: Option[Int], jlcs: Int, tnev: String, sorsz: Option[Int], erv: Int, allapot: Int)
  /** GetResult implicit for fetching TlistaRow objects using plain SQL queries */
  implicit def GetResultTlistaRow(implicit e0: GR[Int], e1: GR[Char], e2: GR[Option[Int]], e3: GR[String]): GR[TlistaRow] = GR{
    prs => import prs._
    TlistaRow.tupled((<<[Int], <<[Int], <<[Char], <<?[Int], <<[Int], <<[String], <<?[Int], <<[Int], <<[Int]))
  }
  /** Table description of table TLISTA. Objects of this class serve as prototypes for rows in queries. */
  class Tlista(_tableTag: Tag) extends profile.api.Table[TlistaRow](_tableTag, "TLISTA") {
    def * = (internalId, tlid, ltip, nemz, jlcs, tnev, sorsz, erv, allapot) <> (TlistaRow.tupled, TlistaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(tlid), Rep.Some(ltip), nemz, Rep.Some(jlcs), Rep.Some(tnev), sorsz, Rep.Some(erv), Rep.Some(allapot)).shaped.<>({r=>import r._; _1.map(_=> TlistaRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column TLID SqlType(INTEGER) */
    val tlid: Rep[Int] = column[Int]("TLID")
    /** Database column LTIP SqlType(VARCHAR) */
    val ltip: Rep[Char] = column[Char]("LTIP")
    /** Database column NEMZ SqlType(INTEGER) */
    val nemz: Rep[Option[Int]] = column[Option[Int]]("NEMZ")
    /** Database column JLCS SqlType(INTEGER) */
    val jlcs: Rep[Int] = column[Int]("JLCS")
    /** Database column TNEV SqlType(VARCHAR), Length(100,true) */
    val tnev: Rep[String] = column[String]("TNEV", O.Length(100,varying=true))
    /** Database column SORSZ SqlType(INTEGER) */
    val sorsz: Rep[Option[Int]] = column[Option[Int]]("SORSZ")
    /** Database column ERV SqlType(INTEGER) */
    val erv: Rep[Int] = column[Int]("ERV")
    /** Database column ALLAPOT SqlType(INTEGER) */
    val allapot: Rep[Int] = column[Int]("ALLAPOT")

    /** Index over (jlcs) (database name TLISTA_JLCS) */
    val index1 = index("TLISTA_JLCS", jlcs)
    /** Index over (ltip) (database name TLISTA_LTIP) */
    val index2 = index("TLISTA_LTIP", ltip)
    /** Index over (sorsz) (database name TLISTA_SORSZ) */
    val index3 = index("TLISTA_SORSZ", sorsz)
    /** Index over (tlid) (database name TLISTA_TLID) */
    val index4 = index("TLISTA_TLID", tlid)
  }
  /** Collection-like TableQuery object for table Tlista */
  lazy val Tlista = new TableQuery(tag => new Tlista(tag))

  /** Entity class storing rows of table Tlistaj
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param tlid Database column TLID SqlType(INTEGER)
   *  @param tjsorsz Database column TJSORSZ SqlType(INTEGER)
   *  @param tajaz Database column TAJAZ SqlType(VARCHAR), Length(40,true)
   *  @param dr Database column DR SqlType(VARCHAR), Length(3,true)
   *  @param drjel Database column DRJEL SqlType(VARCHAR)
   *  @param nev Database column NEV SqlType(VARCHAR), Length(50,true)
   *  @param unev1 Database column UNEV1 SqlType(VARCHAR), Length(20,true)
   *  @param unev2 Database column UNEV2 SqlType(VARCHAR), Length(20,true)
   *  @param unevjel Database column UNEVJEL SqlType(INTEGER)
   *  @param allapot Database column ALLAPOT SqlType(INTEGER)
   *  @param fenykep Database column FENYKEP SqlType(INTEGER) */
  case class TlistajRow(internalId: Int, tlid: Int, tjsorsz: Int, tajaz: String, dr: Option[String], drjel: Option[Char], nev: String, unev1: String, unev2: Option[String], unevjel: Option[Int], allapot: Int, fenykep: Option[Int])
  /** GetResult implicit for fetching TlistajRow objects using plain SQL queries */
  implicit def GetResultTlistajRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Char]], e4: GR[Option[Int]]): GR[TlistajRow] = GR{
    prs => import prs._
    TlistajRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<?[String], <<?[Char], <<[String], <<[String], <<?[String], <<?[Int], <<[Int], <<?[Int]))
  }
  /** Table description of table TLISTAJ. Objects of this class serve as prototypes for rows in queries. */
  class Tlistaj(_tableTag: Tag) extends profile.api.Table[TlistajRow](_tableTag, "TLISTAJ") {
    def * = (internalId, tlid, tjsorsz, tajaz, dr, drjel, nev, unev1, unev2, unevjel, allapot, fenykep) <> (TlistajRow.tupled, TlistajRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(tlid), Rep.Some(tjsorsz), Rep.Some(tajaz), dr, drjel, Rep.Some(nev), Rep.Some(unev1), unev2, unevjel, Rep.Some(allapot), fenykep).shaped.<>({r=>import r._; _1.map(_=> TlistajRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7.get, _8.get, _9, _10, _11.get, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column TLID SqlType(INTEGER) */
    val tlid: Rep[Int] = column[Int]("TLID")
    /** Database column TJSORSZ SqlType(INTEGER) */
    val tjsorsz: Rep[Int] = column[Int]("TJSORSZ")
    /** Database column TAJAZ SqlType(VARCHAR), Length(40,true) */
    val tajaz: Rep[String] = column[String]("TAJAZ", O.Length(40,varying=true))
    /** Database column DR SqlType(VARCHAR), Length(3,true) */
    val dr: Rep[Option[String]] = column[Option[String]]("DR", O.Length(3,varying=true))
    /** Database column DRJEL SqlType(VARCHAR) */
    val drjel: Rep[Option[Char]] = column[Option[Char]]("DRJEL")
    /** Database column NEV SqlType(VARCHAR), Length(50,true) */
    val nev: Rep[String] = column[String]("NEV", O.Length(50,varying=true))
    /** Database column UNEV1 SqlType(VARCHAR), Length(20,true) */
    val unev1: Rep[String] = column[String]("UNEV1", O.Length(20,varying=true))
    /** Database column UNEV2 SqlType(VARCHAR), Length(20,true) */
    val unev2: Rep[Option[String]] = column[Option[String]]("UNEV2", O.Length(20,varying=true))
    /** Database column UNEVJEL SqlType(INTEGER) */
    val unevjel: Rep[Option[Int]] = column[Option[Int]]("UNEVJEL")
    /** Database column ALLAPOT SqlType(INTEGER) */
    val allapot: Rep[Int] = column[Int]("ALLAPOT")
    /** Database column FENYKEP SqlType(INTEGER) */
    val fenykep: Rep[Option[Int]] = column[Option[Int]]("FENYKEP")

    /** Index over (tjsorsz) (database name TLISTAJ_TJSORSZ) */
    val index1 = index("TLISTAJ_TJSORSZ", tjsorsz)
    /** Index over (tlid) (database name TLISTAJ_TLID) */
    val index2 = index("TLISTAJ_TLID", tlid)
  }
  /** Collection-like TableQuery object for table Tlistaj */
  lazy val Tlistaj = new TableQuery(tag => new Tlistaj(tag))

  /** Entity class storing rows of table Verzio
   *  @param internalId Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey
   *  @param ver Database column VER SqlType(VARCHAR), Length(19,true)
   *  @param tjel Database column TJEL SqlType(INTEGER)
   *  @param eng1 Database column ENG1 SqlType(INTEGER)
   *  @param eng2 Database column ENG2 SqlType(INTEGER)
   *  @param feldar Database column FELDAR SqlType(VARCHAR), Length(5,true)
   *  @param levell Database column LEVELL SqlType(VARCHAR), Length(5,true)
   *  @param levszl Database column LEVSZL SqlType(INTEGER) */
  case class VerzioRow(internalId: Int, ver: String, tjel: Int, eng1: Int, eng2: Int, feldar: String, levell: String, levszl: Int)
  /** GetResult implicit for fetching VerzioRow objects using plain SQL queries */
  implicit def GetResultVerzioRow(implicit e0: GR[Int], e1: GR[String]): GR[VerzioRow] = GR{
    prs => import prs._
    VerzioRow.tupled((<<[Int], <<[String], <<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table VERZIO. Objects of this class serve as prototypes for rows in queries. */
  class Verzio(_tableTag: Tag) extends profile.api.Table[VerzioRow](_tableTag, "VERZIO") {
    def * = (internalId, ver, tjel, eng1, eng2, feldar, levell, levszl) <> (VerzioRow.tupled, VerzioRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(internalId), Rep.Some(ver), Rep.Some(tjel), Rep.Some(eng1), Rep.Some(eng2), Rep.Some(feldar), Rep.Some(levell), Rep.Some(levszl)).shaped.<>({r=>import r._; _1.map(_=> VerzioRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INTERNAL_ID SqlType(INTEGER), AutoInc, PrimaryKey */
    val internalId: Rep[Int] = column[Int]("INTERNAL_ID", O.AutoInc, O.PrimaryKey)
    /** Database column VER SqlType(VARCHAR), Length(19,true) */
    val ver: Rep[String] = column[String]("VER", O.Length(19,varying=true))
    /** Database column TJEL SqlType(INTEGER) */
    val tjel: Rep[Int] = column[Int]("TJEL")
    /** Database column ENG1 SqlType(INTEGER) */
    val eng1: Rep[Int] = column[Int]("ENG1")
    /** Database column ENG2 SqlType(INTEGER) */
    val eng2: Rep[Int] = column[Int]("ENG2")
    /** Database column FELDAR SqlType(VARCHAR), Length(5,true) */
    val feldar: Rep[String] = column[String]("FELDAR", O.Length(5,varying=true))
    /** Database column LEVELL SqlType(VARCHAR), Length(5,true) */
    val levell: Rep[String] = column[String]("LEVELL", O.Length(5,varying=true))
    /** Database column LEVSZL SqlType(INTEGER) */
    val levszl: Rep[Int] = column[Int]("LEVSZL")
  }
  /** Collection-like TableQuery object for table Verzio */
  lazy val Verzio = new TableQuery(tag => new Verzio(tag))
}
