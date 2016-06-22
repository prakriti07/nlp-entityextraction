package ae.teletronics.nlp.entityextraction

/**
  * Created by Boris on 2016-06-22.
  */
object EntityType {
  val allEntityTypes = List(Person, Location, Organization)
}

sealed trait EntityType
case object Person extends EntityType
case object Location extends EntityType
case object Organization extends EntityType
